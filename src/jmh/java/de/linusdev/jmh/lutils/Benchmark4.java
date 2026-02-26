package de.linusdev.jmh.lutils;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.lutils.SmallTestStruct1;
import de.linusdev.jmh.structs.lutils.SmallTestStruct10;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.lutils.nat.struct.abstracts.Structure.allocate;

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
        var struct1 = allocate(new SmallTestStruct1());

        struct1.aInt.set(intValues[0]);
        struct1.aFloat.set(floatValues[0]);
        struct1.aIntVec4.x(intValues[1]);
        struct1.aIntVec4.y(intValues[2]);
        struct1.aIntVec4.z(intValues[3]);
        struct1.aIntVec4.w(intValues[4]);

        var struct2 = allocate(new SmallTestStruct10());

        struct2.aSmallTestStruct3.aLong.set(longValues[0]);
        struct2.aSmallTestStruct3.aSecondLong.set(longValues[1]);
        struct2.aSmallTestStruct3.aThirdLong.set(longValues[2]);
        struct2.aSmallTestStruct7.aInt.set(intValues[5]);
        struct2.aSmallTestStruct7.aSecondInt.set(intValues[6]);
        struct2.aSmallTestStruct7.aThirdInt.set(intValues[7]);
        struct2.aSmallTestStruct7.aPointer.set(longValues[3]);

        mustBeEquals(struct1.aInt.get(), intValues[0]);
        mustBeEquals(struct1.aFloat.get(), floatValues[0]);
        mustBeEquals(struct1.aIntVec4.x(), intValues[1]);
        mustBeEquals(struct1.aIntVec4.y(), intValues[2]);
        mustBeEquals(struct1.aIntVec4.z(), intValues[3]);
        mustBeEquals(struct1.aIntVec4.w(), intValues[4]);

        mustBeEquals(struct2.aSmallTestStruct3.aLong.get(), longValues[0]);
        mustBeEquals(struct2.aSmallTestStruct3.aSecondLong.get(), longValues[1]);
        mustBeEquals(struct2.aSmallTestStruct3.aThirdLong.get(), longValues[2]);
        mustBeEquals(struct2.aSmallTestStruct7.aInt.get(), intValues[5]);
        mustBeEquals(struct2.aSmallTestStruct7.aSecondInt.get(), intValues[6]);
        mustBeEquals(struct2.aSmallTestStruct7.aThirdInt.get(), intValues[7]);
        mustBeEquals(struct2.aSmallTestStruct7.aPointer.get(), longValues[3]);
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();

        Class<?> selfClazz = Benchmark4.class;

        runBenchmark(selfClazz, SINGLE_DO_GC);
    }

}
