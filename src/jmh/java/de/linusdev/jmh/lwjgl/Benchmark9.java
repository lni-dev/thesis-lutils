package de.linusdev.jmh.lwjgl;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.lwjgl.LargeTestStruct1;
import de.linusdev.jmh.structs.lwjgl.MediumTestStruct1;
import de.linusdev.jmh.structs.lwjgl.SmallTestStruct3;
import de.linusdev.lutils.result.BiResult;
import org.lwjgl.system.MemoryUtil;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.jmh.lwjgl.Global.allocate;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = B9_FORKS)
@Warmup(iterations = B9_WARMUP_ITERATIONS, time = B9_MEASUREMENT_TIME)
@Measurement(iterations = B9_MEASUREMENT_ITERATIONS, time = B9_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark9 {

    @Setup
    public void setup() {

    }

    public MyRandom random = new MyRandom(B9_RANDOM_SEED);
    public byte[][] byteValues = random.getBytes(10, 600);
    public short[][] shortValues = random.getShorts(10, 600);
    public int[][] intValues = random.getInts(10, 600);
    public long[][] longValues = random.getLongs(10, 600);
    public float[][] floatValues = random.getFloats(10, 600);
    public byte[][] byteArray = random.getBytes(20, 600);

    public long[][] long2Values = random.getLongs(3, 1200);
    public int[] int2Values = random.getInts(100000);

    @Benchmark
    public void benchmark(Blackhole bh) {
        BiResult<ByteBuffer, LargeTestStruct1> struct1Container = allocate(LargeTestStruct1.SIZEOF, LargeTestStruct1::new);
        LargeTestStruct1 struct1 = struct1Container.result2();

        for (int i = 0; i < 600; i++) {
            MediumTestStruct1 struct = struct1.mediumTestStruct1Array(i);

            struct.aLong(longValues[i][0]);
            struct.aSecondLong(longValues[i][1]);
            struct.aThirdLong(longValues[i][2]);
            struct.aInt4(0, intValues[i][0]);
            struct.aInt4(1, intValues[i][1]);
            struct.aInt4(2, intValues[i][2]);
            struct.aInt4(3, intValues[i][3]);
            struct.aShort(shortValues[i][0]);
            struct.aSubStruct().aInt(intValues[i][4]);
            struct.aSubStruct().aFloat(floatValues[i][0]);
            struct.aSubStruct().aIntVec4(0, intValues[i][5]);
            struct.aSubStruct().aIntVec4(1, intValues[i][6]);
            struct.aSubStruct().aIntVec4(2, intValues[i][7]);
            struct.aSubStruct().aIntVec4(3, intValues[i][8]);
            struct.aSecondSubStruct().aInt(intValues[i][9]);
            struct.aSecondSubStruct().aLong(longValues[i][3]);
            struct.aSecondSubStruct().aByte(byteValues[i][0]);

            for (int j = 0; j < 20; j++) {
                struct.aByteArray(j, byteArray[i][j]);
            }
        }

        for (int i = 0; i < 1200; i++) {
            SmallTestStruct3 struct = struct1.smallTestStruct3Array(i);

            struct.aLong(long2Values[i][0]);
            struct.aSecondLong(long2Values[i][1]);
            struct.aThirdLong(long2Values[i][2]);
        }

        for (int i = 0; i < 100000; i++) {
            struct1.intArray(i, int2Values[i]);
        }


        for (int i = 0; i < 600; i++) {
            MediumTestStruct1 struct = struct1.mediumTestStruct1Array(i);

            mustBeEquals(struct.aLong(), longValues[i][0]);
            mustBeEquals(struct.aSecondLong(), longValues[i][1]);
            mustBeEquals(struct.aThirdLong(), longValues[i][2]);
            mustBeEquals(struct.aInt4(0), intValues[i][0]);
            mustBeEquals(struct.aInt4(1), intValues[i][1]);
            mustBeEquals(struct.aInt4(2), intValues[i][2]);
            mustBeEquals(struct.aInt4(3), intValues[i][3]);
            mustBeEquals(struct.aShort(), shortValues[i][0]);
            mustBeEquals(struct.aSubStruct().aInt(), intValues[i][4]);
            mustBeEquals(struct.aSubStruct().aFloat(), floatValues[i][0]);
            mustBeEquals(struct.aSubStruct().aIntVec4(0), intValues[i][5]);
            mustBeEquals(struct.aSubStruct().aIntVec4(1), intValues[i][6]);
            mustBeEquals(struct.aSubStruct().aIntVec4(2), intValues[i][7]);
            mustBeEquals(struct.aSubStruct().aIntVec4(3), intValues[i][8]);
            mustBeEquals(struct.aSecondSubStruct().aInt(), intValues[i][9]);
            mustBeEquals(struct.aSecondSubStruct().aLong(), longValues[i][3]);
            mustBeEquals(struct.aSecondSubStruct().aByte(), byteValues[i][0]);

            for (int j = 0; j < 20; j++) {
                mustBeEquals(struct.aByteArray(j), byteArray[i][j]);
            }
        }

        for (int i = 0; i < 1200; i++) {
            SmallTestStruct3 struct = struct1.smallTestStruct3Array(i);

            mustBeEquals(struct.aLong(), long2Values[i][0]);
            mustBeEquals(struct.aSecondLong(), long2Values[i][1]);
            mustBeEquals(struct.aThirdLong(), long2Values[i][2]);
        }

        for (int i = 0; i < 100000; i++) {
            mustBeEquals(struct1.intArray(i), int2Values[i]);
        }

        MemoryUtil.memFree(struct1Container.result1());
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark9.class;
        runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
