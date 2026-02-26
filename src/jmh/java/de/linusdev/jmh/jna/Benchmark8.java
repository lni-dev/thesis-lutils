package de.linusdev.jmh.jna;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.jna.generated.MediumTestStruct1;
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

@BenchmarkMode(Mode.SingleShotTime)
@Fork(value = B8_FORKS)
@Warmup(iterations = B8_WARMUP_ITERATIONS)
@Measurement(iterations = B8_MEASUREMENT_ITERATIONS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark8 {


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

        MediumTestStruct1 struct1 = new MediumTestStruct1();

        struct1.aLong = longValues[0];
        struct1.aSecondLong = longValues[1];
        struct1.aThirdLong = longValues[2];
        struct1.aInt4[0] = intValues[0];
        struct1.aInt4[1] = intValues[1];
        struct1.aInt4[2] = intValues[2];
        struct1.aInt4[3] = intValues[3];
        struct1.aShort = shortValues[0];
        struct1.aSubStruct.aInt = intValues[4];
        struct1.aSubStruct.aFloat = floatValues[0];
        struct1.aSubStruct.aIntVec4[0] = intValues[5];
        struct1.aSubStruct.aIntVec4[1] = intValues[6];
        struct1.aSubStruct.aIntVec4[2] = intValues[7];
        struct1.aSubStruct.aIntVec4[3] = intValues[8];
        struct1.aSecondSubStruct.aInt = intValues[9];
        struct1.aSecondSubStruct.aLong = longValues[3];
        struct1.aSecondSubStruct.aByte = byteValues[0];
        struct1.aByteArray = byteArray;

        struct1.write();
        struct1.read();

        mustBeEquals(struct1.aLong, longValues[0]);
        mustBeEquals(struct1.aSecondLong, longValues[1]);
        mustBeEquals(struct1.aThirdLong, longValues[2]);
        mustBeEquals(struct1.aInt4[0], intValues[0]);
        mustBeEquals(struct1.aInt4[1], intValues[1]);
        mustBeEquals(struct1.aInt4[2], intValues[2]);
        mustBeEquals(struct1.aInt4[3], intValues[3]);
        mustBeEquals(struct1.aShort, shortValues[0]);
        mustBeEquals(struct1.aSubStruct.aInt, intValues[4]);
        mustBeEquals(struct1.aSubStruct.aFloat, floatValues[0]);
        mustBeEquals(struct1.aSubStruct.aIntVec4[0], intValues[5]);
        mustBeEquals(struct1.aSubStruct.aIntVec4[1], intValues[6]);
        mustBeEquals(struct1.aSubStruct.aIntVec4[2], intValues[7]);
        mustBeEquals(struct1.aSubStruct.aIntVec4[3], intValues[8]);
        mustBeEquals(struct1.aSecondSubStruct.aInt, intValues[9]);
        mustBeEquals(struct1.aSecondSubStruct.aLong, longValues[3]);
        mustBeEquals(struct1.aSecondSubStruct.aByte, byteValues[0]);

        for (int i = 0; i < 20; i++) {
            mustBeEquals(struct1.aByteArray[i], byteArray[i]);
        }
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark8.class;
        Common.runBenchmark(selfClazz, SINGLE_DO_GC);
    }

}
