package de.linusdev.jmh.lutils;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.lutils.LargeTestStruct1;
import de.linusdev.jmh.structs.lutils.MediumTestStruct1;
import de.linusdev.jmh.structs.lutils.SmallTestStruct3;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.lutils.nat.struct.abstracts.Structure.allocate;

@BenchmarkMode(Mode.SingleShotTime)
@Fork(value = B10_FORKS)
@Warmup(iterations = B10_WARMUP_ITERATIONS)
@Measurement(iterations = B10_MEASUREMENT_ITERATIONS)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark10 {

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
        var struct1 = allocate(new LargeTestStruct1());

        for (int i = 0; i < 600; i++) {
            MediumTestStruct1 struct = struct1.mediumTestStruct1Array.get(i);

            struct.aLong.set(longValues[i][0]);
            struct.aSecondLong.set(longValues[i][1]);
            struct.aThirdLong.set(longValues[i][2]);
            struct.aInt4.put(0, intValues[i][0]);
            struct.aInt4.put(1, intValues[i][1]);
            struct.aInt4.put(2, intValues[i][2]);
            struct.aInt4.put(3, intValues[i][3]);
            struct.aShort.set(shortValues[i][0]);
            struct.aSubStruct.aInt.set(intValues[i][4]);
            struct.aSubStruct.aFloat.set(floatValues[i][0]);
            struct.aSubStruct.aIntVec4.put(0, intValues[i][5]);
            struct.aSubStruct.aIntVec4.put(1, intValues[i][6]);
            struct.aSubStruct.aIntVec4.put(2, intValues[i][7]);
            struct.aSubStruct.aIntVec4.put(3, intValues[i][8]);
            struct.aSecondSubStruct.aInt.set(intValues[i][9]);
            struct.aSecondSubStruct.aLong.set(longValues[i][3]);
            struct.aSecondSubStruct.aByte.set(byteValues[i][0]);
            struct.aByteArray.set(byteArray[i]);
        }

        for (int i = 0; i < 1200; i++) {
            SmallTestStruct3 struct = struct1.smallTestStruct3Array.get(i);

            struct.aLong.set(long2Values[i][0]);
            struct.aSecondLong.set(long2Values[i][1]);
            struct.aThirdLong.set(long2Values[i][2]);
        }

        for (int i = 0; i < struct1.intArray.length(); i++) {
            struct1.intArray.set(i, int2Values[i]);
        }

        for (int i = 0; i < 600; i++) {
            MediumTestStruct1 struct = struct1.mediumTestStruct1Array.get(i);

            mustBeEquals(struct.aLong.get(), longValues[i][0]);
            mustBeEquals(struct.aSecondLong.get(), longValues[i][1]);
            mustBeEquals(struct.aThirdLong.get(), longValues[i][2]);
            mustBeEquals(struct.aInt4.get(0), intValues[i][0]);
            mustBeEquals(struct.aInt4.get(1), intValues[i][1]);
            mustBeEquals(struct.aInt4.get(2), intValues[i][2]);
            mustBeEquals(struct.aInt4.get(3), intValues[i][3]);
            mustBeEquals(struct.aShort.get(0), shortValues[i][0]);
            mustBeEquals(struct.aSubStruct.aInt.get(), intValues[i][4]);
            mustBeEquals(struct.aSubStruct.aFloat.get(), floatValues[i][0]);
            mustBeEquals(struct.aSubStruct.aIntVec4.get(0), intValues[i][5]);
            mustBeEquals(struct.aSubStruct.aIntVec4.get(1), intValues[i][6]);
            mustBeEquals(struct.aSubStruct.aIntVec4.get(2), intValues[i][7]);
            mustBeEquals(struct.aSubStruct.aIntVec4.get(3), intValues[i][8]);
            mustBeEquals(struct.aSecondSubStruct.aInt.get(), intValues[i][9]);
            mustBeEquals(struct.aSecondSubStruct.aLong.get(), longValues[i][3]);
            mustBeEquals(struct.aSecondSubStruct.aByte.get(), byteValues[i][0]);

            for (int j = 0; j < 20; j++) {
                mustBeEquals(struct.aByteArray.get(j), byteArray[i][j]);
            }
        }

        for (int i = 0; i < 1200; i++) {
            SmallTestStruct3 struct = struct1.smallTestStruct3Array.get(i);

            mustBeEquals(struct.aLong.get(), long2Values[i][0]);
            mustBeEquals(struct.aSecondLong.get(), long2Values[i][1]);
            mustBeEquals(struct.aThirdLong.get(), long2Values[i][2]);
        }

        for (int i = 0; i < struct1.intArray.length(); i++) {
            mustBeEquals(struct1.intArray.get(i), int2Values[i]);
        }

    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();

        Class<?> selfClazz = Benchmark10.class;

        runBenchmark(selfClazz, SINGLE_DO_GC);
    }

}
