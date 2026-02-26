package de.linusdev.jmh.ffma;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct1;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct10;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct3;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct7;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.jmh.Main.fixBenchmarkName;
import static de.linusdev.jmh.structs.ffma.generated.SmallTestStruct1.*;

@BenchmarkMode(Mode.SingleShotTime)
@Fork(value = B4_FORKS)
@Warmup(iterations = B4_WARMUP_ITERATIONS)
@Measurement(iterations = B4_MEASUREMENT_ITERATIONS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark4 {

    @Setup
    public void setup() {
    }

    public MyRandom random = new MyRandom(B3_RANDOM_SEED);
    public int[] intValues = random.getInts(10);
    public long[] longValues = random.getLongs(10);
    public float[] floatValues = random.getFloats(10);

    @Benchmark
    public void benchmark(Blackhole bh) {
        Arena arena = Arena.ofConfined();

        MemorySegment struct1 = arena.allocate(SmallTestStruct1.LAYOUT);

        SmallTestStruct1.aIntHandle.set(struct1, 0L, intValues[0]);
        aFloatHandle.set(struct1, 0L, floatValues[0]);
        aIntVec4Handle.set(struct1, 0L, 0L, intValues[1]);
        aIntVec4Handle.set(struct1, 0L, 1L, intValues[2]);
        aIntVec4Handle.set(struct1, 0L, 2L, intValues[3]);
        aIntVec4Handle.set(struct1, 0L, 3L, intValues[4]);

        MemorySegment struct2 = arena.allocate(SmallTestStruct10.LAYOUT);
        MemorySegment sts3 = SmallTestStruct10.aSmallTestStruct3Accessor(struct2);
        SmallTestStruct3.aLongHandle.set(sts3, 0L, longValues[0]);
        SmallTestStruct3.aSecondLongHandle.set(sts3, 0L, longValues[1]);
        SmallTestStruct3.aThirdLongHandle.set(sts3, 0L, longValues[2]);

        MemorySegment sts7 = SmallTestStruct10.aSmallTestStruct7Accessor(struct2);
        SmallTestStruct7.aIntHandle.set(sts7, 0L, intValues[5]);
        SmallTestStruct7.aSecondIntHandle.set(sts7, 0L, intValues[6]);
        SmallTestStruct7.aThirdIntHandle.set(sts7, 0L, intValues[7]);
        SmallTestStruct7.aPointerHandle.set(sts7, 0L, longValues[3]);

        mustBeEquals(aIntHandle.get(struct1, 0L), intValues[0]);
        mustBeEquals(aFloatHandle.get(struct1, 0L), floatValues[0]);
        mustBeEquals(aIntVec4Handle.get(struct1, 0L, 0L), intValues[1]);
        mustBeEquals(aIntVec4Handle.get(struct1, 0L, 1L), intValues[2]);
        mustBeEquals(aIntVec4Handle.get(struct1, 0L, 2L), intValues[3]);
        mustBeEquals(aIntVec4Handle.get(struct1, 0L, 3L), intValues[4]);

        mustBeEquals(SmallTestStruct3.aLongHandle.get(sts3, 0L), longValues[0]);
        mustBeEquals(SmallTestStruct3.aSecondLongHandle.get(sts3, 0L), longValues[1]);
        mustBeEquals(SmallTestStruct3.aThirdLongHandle.get(sts3, 0L), longValues[2]);
        mustBeEquals(SmallTestStruct7.aIntHandle.get(sts7, 0L), intValues[5]);
        mustBeEquals(SmallTestStruct7.aSecondIntHandle.get(sts7, 0L), intValues[6]);
        mustBeEquals(SmallTestStruct7.aThirdIntHandle.get(sts7, 0L), intValues[7]);
        mustBeEquals(SmallTestStruct7.aPointerHandle.get(sts7, 0L),  longValues[3]);

        arena.close();
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark4.class;
        Common.runBenchmark(selfClazz, SINGLE_DO_GC);
    }

}
