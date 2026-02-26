package de.linusdev.jmh.lwjgl;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.lwjgl.*;
import de.linusdev.lutils.result.BiResult;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.Struct;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.lwjgl.Global.allocate;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = B2_FORKS)
@Warmup(iterations = B2_WARMUP_ITERATIONS, time = B2_MEASUREMENT_TIME)
@Measurement(iterations = B2_MEASUREMENT_ITERATIONS, time = B2_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark2 {

    @Setup
    public void setup() {

    }

    @Benchmark
    public void benchmark(Blackhole bh) {
        BiResult<ByteBuffer, Struct<?>> struct1 = allocate(SmallTestStruct1.SIZEOF, SmallTestStruct1::new);
        BiResult<ByteBuffer, Struct<?>> struct2 = allocate(SmallTestStruct2.SIZEOF, SmallTestStruct2::new);
        BiResult<ByteBuffer, Struct<?>> struct3 = allocate(SmallTestStruct3.SIZEOF, SmallTestStruct3::new);
        BiResult<ByteBuffer, Struct<?>> struct4 = allocate(SmallTestStruct4.SIZEOF, SmallTestStruct4::new);
        BiResult<ByteBuffer, Struct<?>> struct5 = allocate(SmallTestStruct5.SIZEOF, SmallTestStruct5::new);
        BiResult<ByteBuffer, Struct<?>> struct6 = allocate(SmallTestStruct6.SIZEOF, SmallTestStruct6::new);
        BiResult<ByteBuffer, Struct<?>> struct7 = allocate(SmallTestStruct7.SIZEOF, SmallTestStruct7::new);
        BiResult<ByteBuffer, Struct<?>> struct8 = allocate(SmallTestStruct8.SIZEOF, SmallTestStruct8::new);
        BiResult<ByteBuffer, Struct<?>> struct9 = allocate(SmallTestStruct9.SIZEOF, SmallTestStruct9::new);
        BiResult<ByteBuffer, Struct<?>> struct10 = allocate(SmallTestStruct10.SIZEOF, SmallTestStruct10::new);

        bh.consume(struct1.result2());
        bh.consume(struct2.result2());
        bh.consume(struct3.result2());
        bh.consume(struct4.result2());
        bh.consume(struct5.result2());
        bh.consume(struct6.result2());
        bh.consume(struct7.result2());
        bh.consume(struct8.result2());
        bh.consume(struct9.result2());
        bh.consume(struct10.result2());
        MemoryUtil.memFree(struct1.result1());
        MemoryUtil.memFree(struct2.result1());
        MemoryUtil.memFree(struct3.result1());
        MemoryUtil.memFree(struct4.result1());
        MemoryUtil.memFree(struct5.result1());
        MemoryUtil.memFree(struct6.result1());
        MemoryUtil.memFree(struct7.result1());
        MemoryUtil.memFree(struct8.result1());
        MemoryUtil.memFree(struct9.result1());
        MemoryUtil.memFree(struct10.result1());
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark2.class;
        runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
