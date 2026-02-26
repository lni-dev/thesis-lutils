package de.linusdev.jmh.jna;

import com.sun.jna.Structure;
import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.jna.generated.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Main.fixBenchmarkName;

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

        Structure struct1 = new LargeTestStruct1();
        Structure struct2 = new LargeTestStruct2();
        Structure struct3 = new LargeTestStruct3();
        Structure struct4 = new LargeTestStruct4();
        Structure struct5 = new LargeTestStruct5();

        // Make sure the structure is only garbage collected after the native method returned
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
        Common.runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
