package de.linusdev.jmh.lwjgl;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.lwjgl.SmallTestStruct1;
import de.linusdev.jmh.structs.lwjgl.SmallTestStruct10;
import de.linusdev.lutils.result.BiResult;
import org.lwjgl.system.MemoryUtil;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.lwjgl.Global.allocate;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = B3_WARMUP_ITERATIONS, time = B3_MEASUREMENT_TIME)
@Measurement(iterations = B3_MEASUREMENT_ITERATIONS, time = B3_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark3Baseline {

    @Setup
    public void setup() {

    }

    @Benchmark
    public void benchmark(Blackhole bh) {
        BiResult<ByteBuffer, SmallTestStruct1> struct1Container = allocate(SmallTestStruct1.SIZEOF, SmallTestStruct1::new);
        BiResult<ByteBuffer, SmallTestStruct10> struct2Container = allocate(SmallTestStruct10.SIZEOF, SmallTestStruct10::new);

        bh.consume(struct1Container.result2());
        bh.consume(struct2Container.result2());
        MemoryUtil.memFree(struct1Container.result1());
        MemoryUtil.memFree(struct2Container.result1());

    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark3Baseline.class;
        runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
