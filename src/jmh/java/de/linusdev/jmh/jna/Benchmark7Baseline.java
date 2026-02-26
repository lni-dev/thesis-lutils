package de.linusdev.jmh.jna;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.MyRandom;
import de.linusdev.jmh.structs.jna.generated.MediumTestStruct1;
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
import static de.linusdev.jmh.Helper.mustBeEquals;
import static de.linusdev.jmh.Main.fixBenchmarkName;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = B7_WARMUP_ITERATIONS, time = B7_MEASUREMENT_TIME)
@Measurement(iterations = B7_MEASUREMENT_ITERATIONS, time = B7_MEASUREMENT_TIME)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class Benchmark7Baseline {


    @Setup
    public void setup() {
    }



    @Benchmark
    public void benchmark(Blackhole bh) {
        MediumTestStruct1 struct1 = new MediumTestStruct1();
        bh.consume(struct1);
    }

    @TearDown
    public void teardown() {

    }

    public static void main(String[] args) throws RunnerException {
        // Do setup before everything, so the async profiler can be initialized
        Common.setup();
        Class<?> selfClazz = Benchmark7Baseline.class;
        Common.runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
