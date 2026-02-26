package de.linusdev.jmh.ffma;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.ffma.generated.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
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
        Arena arena = Arena.ofConfined();

        MemorySegment struct1 = arena.allocate(LargeTestStruct1.LAYOUT);
        MemorySegment struct2 = arena.allocate(LargeTestStruct2.LAYOUT);
        MemorySegment struct3 = arena.allocate(LargeTestStruct3.LAYOUT);
        MemorySegment struct4 = arena.allocate(LargeTestStruct4.LAYOUT);
        MemorySegment struct5 = arena.allocate(LargeTestStruct5.LAYOUT);

        // Make sure the structure is not garbage collected in between
        bh.consume(struct1);
        bh.consume(struct2);
        bh.consume(struct3);
        bh.consume(struct4);
        bh.consume(struct5);

        arena.close();
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
