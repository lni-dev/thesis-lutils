package de.linusdev.jmh.lwjgl;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.lwjgl.SmallTestStruct1;
import de.linusdev.jmh.structs.lwjgl.SmallTestStruct10;
import de.linusdev.lutils.result.BiResult;
import org.lwjgl.system.MemoryUtil;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.jmh.lwjgl.Global.allocate;

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
        BiResult<ByteBuffer, SmallTestStruct1> struct1Container = allocate(SmallTestStruct1.SIZEOF, SmallTestStruct1::new);
        SmallTestStruct1 struct1 = struct1Container.result2();
        struct1.aInt(intValues[0]);
        struct1.aFloat(floatValues[0]);
        struct1.aIntVec4(0, intValues[1]);
        struct1.aIntVec4(1, intValues[2]);
        struct1.aIntVec4(2, intValues[3]);
        struct1.aIntVec4(3, intValues[4]);

        BiResult<ByteBuffer, SmallTestStruct10> struct2Container = allocate(SmallTestStruct10.SIZEOF, SmallTestStruct10::new);
        SmallTestStruct10 struct2 = struct2Container.result2();

        struct2.aSmallTestStruct3().aLong(longValues[0]);
        struct2.aSmallTestStruct3().aSecondLong(longValues[1]);
        struct2.aSmallTestStruct3().aThirdLong(longValues[2]);
        struct2.aSmallTestStruct7().aInt(intValues[5]);
        struct2.aSmallTestStruct7().aSecondInt(intValues[6]);
        struct2.aSmallTestStruct7().aThirdInt(intValues[7]);
        struct2.aSmallTestStruct7().aPointer(longValues[3]);

        mustBeEquals(struct1.aInt(), intValues[0]);
        mustBeEquals(struct1.aFloat(), floatValues[0]);
        mustBeEquals(struct1.aIntVec4(0), intValues[1]);
        mustBeEquals(struct1.aIntVec4(1), intValues[2]);
        mustBeEquals(struct1.aIntVec4(2), intValues[3]);
        mustBeEquals(struct1.aIntVec4(3), intValues[4]);

        mustBeEquals(struct2.aSmallTestStruct3().aLong(), longValues[0]);
        mustBeEquals(struct2.aSmallTestStruct3().aSecondLong(), longValues[1]);
        mustBeEquals(struct2.aSmallTestStruct3().aThirdLong(), longValues[2]);
        mustBeEquals(struct2.aSmallTestStruct7().aInt(), intValues[5]);
        mustBeEquals(struct2.aSmallTestStruct7().aSecondInt(), intValues[6]);
        mustBeEquals(struct2.aSmallTestStruct7().aThirdInt(), intValues[7]);
        mustBeEquals(struct2.aSmallTestStruct7().aPointer(), longValues[3]);

        MemoryUtil.memFree(struct1Container.result1());
        MemoryUtil.memFree(struct2Container.result1());
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
