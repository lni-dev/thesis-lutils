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
        Arena arena = Arena.ofConfined();

        MemorySegment struct1 = arena.allocate(SmallTestStruct1.LAYOUT);
        MemorySegment struct2 = arena.allocate(SmallTestStruct2.LAYOUT);
        MemorySegment struct3 = arena.allocate(SmallTestStruct3.LAYOUT);
        MemorySegment struct4 = arena.allocate(SmallTestStruct4.LAYOUT);
        MemorySegment struct5 = arena.allocate(SmallTestStruct5.LAYOUT);
        MemorySegment struct6 = arena.allocate(SmallTestStruct6.LAYOUT);
        MemorySegment struct7 = arena.allocate(SmallTestStruct7.LAYOUT);
        MemorySegment struct8 = arena.allocate(SmallTestStruct8.LAYOUT);
        MemorySegment struct9 = arena.allocate(SmallTestStruct9.LAYOUT);
        MemorySegment struct10 = arena.allocate(SmallTestStruct10.LAYOUT);

        // Make sure the structure is not garbage collected in between
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

        arena.close();
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
