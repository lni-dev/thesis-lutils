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

        var struct1 = allocate(new SmallTestStruct1());
        var struct2 = allocate(new SmallTestStruct2());
        var struct3 = allocate(new SmallTestStruct3());
        var struct4 = allocate(new SmallTestStruct4());
        var struct5 = allocate(new SmallTestStruct5());
        var struct6 = allocate(new SmallTestStruct6());
        var struct7 = allocate(new SmallTestStruct7());
        var struct8 = allocate(new SmallTestStruct8());
        var struct9 = allocate(new SmallTestStruct9());
        var struct10 = allocate(new SmallTestStruct10());


        bh.consume(struct1);
        bh.consume(struct2);
        bh.consume(struct3);
        bh.consume(struct4);
        bh.consume(struct5);
        bh.consume(struct6);
        bh.consume(struct7);
        bh.consume(struct8);
        bh.consume(struct9);
        bh.consume(struct10);
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
