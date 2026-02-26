package de.linusdev.jmh.lutils;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.lutils.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.runner.RunnerException;

import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Common.runBenchmark;
import static de.linusdev.jmh.Constants.*;
import static de.linusdev.lutils.nat.struct.abstracts.Structure.allocate;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = B6_FORKS)
@Warmup(iterations = B6_WARMUP_ITERATIONS, time = B6_MEASUREMENT_TIME)
@Measurement(iterations = B6_MEASUREMENT_ITERATIONS, time = B6_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark6 {

    @Setup
    public void setup() {

    }

    @Benchmark
    public void benchmark(Blackhole bh) {

        var struct1 = allocate(new LargeTestStruct1());
        var struct2 = allocate(new LargeTestStruct2());
        var struct3 = allocate(new LargeTestStruct3());
        var struct4 = allocate(new LargeTestStruct4());
        var struct5 = allocate(new LargeTestStruct5());


        bh.consume(struct1);
        bh.consume(struct2);
        bh.consume(struct3);
        bh.consume(struct4);
        bh.consume(struct5);
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();

        Class<?> selfClazz = Benchmark6.class;

        runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
