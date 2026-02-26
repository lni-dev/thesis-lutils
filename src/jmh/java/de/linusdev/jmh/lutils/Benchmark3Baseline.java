package de.linusdev.jmh.lutils;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.lutils.SmallTestStruct1;
import de.linusdev.jmh.structs.lutils.SmallTestStruct10;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.lutils.nat.struct.abstracts.Structure.allocate;

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
        var struct1 = allocate(new SmallTestStruct1());
        var struct2 = allocate(new SmallTestStruct10());

        bh.consume(struct1);
        bh.consume(struct2);
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
