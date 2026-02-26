package de.linusdev.jmh.ffma;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.ffma.generated.MediumTestStruct1;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct1;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct2;
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

@BenchmarkMode(Mode.AverageTime)
@Fork(value = B7_FORKS)
@Warmup(iterations = B7_WARMUP_ITERATIONS, time = B7_MEASUREMENT_TIME)
@Measurement(iterations = B7_MEASUREMENT_ITERATIONS, time = B7_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark7 {

    @Setup
    public void setup() {
    }

    public MyRandom random = new MyRandom(B7_RANDOM_SEED);
    public byte[] byteValues = random.getBytes(10);
    public short[] shortValues = random.getShorts(10);
    public int[] intValues = random.getInts(10);
    public long[] longValues = random.getLongs(10);
    public float[] floatValues = random.getFloats(10);
    public byte[] byteArray = random.getBytes(20);

    @Benchmark
    public void benchmark(Blackhole bh) {
        Arena arena = Arena.ofConfined();

        MemorySegment struct1 = arena.allocate(MediumTestStruct1.LAYOUT);

        MediumTestStruct1.aLongHandle.set(struct1, 0L, longValues[0]);
        MediumTestStruct1.aSecondLongHandle.set(struct1, 0L, longValues[1]);
        MediumTestStruct1.aThirdLongHandle.set(struct1, 0L, longValues[2]);
        MediumTestStruct1.aInt4Handle.set(struct1, 0L, 0L, intValues[0]);
        MediumTestStruct1.aInt4Handle.set(struct1, 0L, 1L, intValues[1]);
        MediumTestStruct1.aInt4Handle.set(struct1, 0L, 2L, intValues[2]);
        MediumTestStruct1.aInt4Handle.set(struct1, 0L, 3L, intValues[3]);
        MediumTestStruct1.aShortHandle.set(struct1, 0L, shortValues[0]);

        var aSubStruct = MediumTestStruct1.aSubStructAccessor(struct1);
        SmallTestStruct1.aIntHandle.set(aSubStruct, 0L, intValues[4]);
        SmallTestStruct1.aFloatHandle.set(aSubStruct, 0L, floatValues[0]);
        SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 0L, intValues[5]);
        SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 1L, intValues[6]);
        SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 2L, intValues[7]);
        SmallTestStruct1.aIntVec4Handle.set(aSubStruct, 0L, 3L, intValues[8]);

        var aSecondSubStruct = MediumTestStruct1.aSecondSubStructAccessor(struct1);
        SmallTestStruct2.aIntHandle.set(aSecondSubStruct, 0L, intValues[9]);
        SmallTestStruct2.aLongHandle.set(aSecondSubStruct, 0L, longValues[3]);
        SmallTestStruct2.aByteHandle.set(aSecondSubStruct, 0L, byteValues[0]);

        struct1.asSlice(MediumTestStruct1.LAYOUT.byteOffset(MediumTestStruct1.aByteArray), byteArray.length).copyFrom(
                MemorySegment.ofArray(byteArray)
        );

        mustBeEquals(MediumTestStruct1.aLongHandle.get(struct1, 0L), longValues[0]);
        mustBeEquals(MediumTestStruct1.aSecondLongHandle.get(struct1, 0L), longValues[1]);
        mustBeEquals(MediumTestStruct1.aThirdLongHandle.get(struct1, 0L), longValues[2]);
        mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct1, 0L, 0L), intValues[0]);
        mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct1, 0L, 1L), intValues[1]);
        mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct1, 0L, 2L), intValues[2]);
        mustBeEquals(MediumTestStruct1.aInt4Handle.get(struct1, 0L, 3L), intValues[3]);
        mustBeEquals(MediumTestStruct1.aShortHandle.get(struct1, 0L), shortValues[0]);

        mustBeEquals(SmallTestStruct1.aIntHandle.get(aSubStruct, 0L), intValues[4]);
        mustBeEquals(SmallTestStruct1.aFloatHandle.get(aSubStruct, 0L), floatValues[0]);
        mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 0L), intValues[5]);
        mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 1L), intValues[6]);
        mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 2L), intValues[7]);
        mustBeEquals(SmallTestStruct1.aIntVec4Handle.get(aSubStruct, 0L, 3L), intValues[8]);

        mustBeEquals(SmallTestStruct2.aIntHandle.get(aSecondSubStruct, 0L), intValues[9]);
        mustBeEquals(SmallTestStruct2.aLongHandle.get(aSecondSubStruct, 0L), longValues[3]);
        mustBeEquals(SmallTestStruct2.aByteHandle.get(aSecondSubStruct, 0L), byteValues[0]);

        for (int i = 0; i < 20; i++) {
            mustBeEquals(MediumTestStruct1.aByteArrayHandle.get(struct1, 0L, (long) i), byteArray[i]);
        }

        arena.close();
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark7.class;
        Common.runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
