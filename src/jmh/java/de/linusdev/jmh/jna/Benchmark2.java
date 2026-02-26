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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Main.fixBenchmarkName;

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

        Structure struct1 = new SmallTestStruct1();
        Structure struct2 = new SmallTestStruct2();
        Structure struct3 = new SmallTestStruct3();
        Structure struct4 = new SmallTestStruct4();
        Structure struct5 = new SmallTestStruct5();
        Structure struct6 = new SmallTestStruct6();
        Structure struct7 = new SmallTestStruct7();
        Structure struct8 = new SmallTestStruct8();
        Structure struct9 = new SmallTestStruct9();
        Structure struct10 = new SmallTestStruct10();

        // Make sure the structure is only garbage collected after the native method returned
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
        Common.runBenchmark(selfClazz, AVERAGE_DO_GC);
    }

}
