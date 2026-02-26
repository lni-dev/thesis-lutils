package de.linusdev.jmh.jna;

import com.sun.jna.Structure;
import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.jna.generated.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.jmh.Main.fixBenchmarkName;
import static de.linusdev.lutils.nat.struct.abstracts.Structure.allocate;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = B3_FORKS)
@Warmup(iterations = B3_WARMUP_ITERATIONS, time = B3_MEASUREMENT_TIME)
@Measurement(iterations = B3_MEASUREMENT_ITERATIONS, time = B3_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark3 {


    @Setup
    public void setup() {
    }

    public MyRandom random = new MyRandom(B3_RANDOM_SEED);
    public int[] intValues = random.getInts(10);
    public long[] longValues = random.getLongs(10);
    public float[] floatValues = random.getFloats(10);

    @Benchmark
    public void benchmark(Blackhole bh) {

        SmallTestStruct1 struct1 = new SmallTestStruct1();
        struct1.aInt = intValues[0];
        struct1.aFloat = floatValues[0];
        struct1.aIntVec4[0] = intValues[1];
        struct1.aIntVec4[1] = intValues[2];
        struct1.aIntVec4[2] = intValues[3];
        struct1.aIntVec4[3] = intValues[4];
        struct1.write();

        var struct2 = new SmallTestStruct10();
        struct2.aSmallTestStruct3.aLong = longValues[0];
        struct2.aSmallTestStruct3.aSecondLong = longValues[1];
        struct2.aSmallTestStruct3.aThirdLong = longValues[2];
        struct2.aSmallTestStruct7.aInt = intValues[5];
        struct2.aSmallTestStruct7.aSecondInt = intValues[6];
        struct2.aSmallTestStruct7.aThirdInt = intValues[7];
        struct2.aSmallTestStruct7.aPointer = longValues[3];
        struct2.write();

        struct1.read();
        struct2.read();

        mustBeEquals(struct1.aInt, intValues[0]);
        mustBeEquals(struct1.aFloat, floatValues[0]);
        mustBeEquals(struct1.aIntVec4[0], intValues[1]);
        mustBeEquals(struct1.aIntVec4[1], intValues[2]);
        mustBeEquals(struct1.aIntVec4[2], intValues[3]);
        mustBeEquals(struct1.aIntVec4[3], intValues[4]);

        mustBeEquals(struct2.aSmallTestStruct3.aLong, longValues[0]);
        mustBeEquals(struct2.aSmallTestStruct3.aSecondLong, longValues[1]);
        mustBeEquals(struct2.aSmallTestStruct3.aThirdLong, longValues[2]);
        mustBeEquals(struct2.aSmallTestStruct7.aInt, intValues[5]);
        mustBeEquals(struct2.aSmallTestStruct7.aSecondInt, intValues[6]);
        mustBeEquals(struct2.aSmallTestStruct7.aThirdInt, intValues[7]);
        mustBeEquals(struct2.aSmallTestStruct7.aPointer, longValues[3]);
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark3.class;
        Common.runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
