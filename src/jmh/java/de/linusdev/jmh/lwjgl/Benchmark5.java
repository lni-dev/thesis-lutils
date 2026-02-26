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
@Fork(value = B5_FORKS)
@Warmup(iterations = B5_WARMUP_ITERATIONS, time = B5_MEASUREMENT_TIME)
@Measurement(iterations = B5_MEASUREMENT_ITERATIONS, time = B5_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark5 {

    @Setup
    public void setup() {

    }

    @Benchmark
    public void benchmark(Blackhole bh) {
        BiResult<ByteBuffer, Struct<?>> struct1 = allocate(MediumTestStruct1.SIZEOF, MediumTestStruct1::new);
        BiResult<ByteBuffer, Struct<?>> struct2 = allocate(MediumTestStruct2.SIZEOF, MediumTestStruct2::new);
        BiResult<ByteBuffer, Struct<?>> struct3 = allocate(MediumTestStruct3.SIZEOF, MediumTestStruct3::new);
        BiResult<ByteBuffer, Struct<?>> struct4 = allocate(MediumTestStruct4.SIZEOF, MediumTestStruct4::new);
        BiResult<ByteBuffer, Struct<?>> struct5 = allocate(MediumTestStruct5.SIZEOF, MediumTestStruct5::new);

        bh.consume(struct1.result2());
        bh.consume(struct2.result2());
        bh.consume(struct3.result2());
        bh.consume(struct4.result2());
        bh.consume(struct5.result2());
        MemoryUtil.memFree(struct1.result1());
        MemoryUtil.memFree(struct2.result1());
        MemoryUtil.memFree(struct3.result1());
        MemoryUtil.memFree(struct4.result1());
        MemoryUtil.memFree(struct5.result1());
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark5.class;
        runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
