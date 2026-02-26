package de.linusdev.jmh.optimizationtests;

import de.linusdev.jmh.Common;
import de.linusdev.jmh.structs.ffma.generated.SmallTestStruct1;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.profile.AsyncProfiler;
import org.openjdk.jmh.profile.JavaFlightRecorderProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Constants.OUTPUT_DIR;
import static de.linusdev.jmh.Main.fixBenchmarkName;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = 1, time = 60)
@Measurement(iterations = 10, time = 60)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class VarHandleTest {


    @Benchmark
    public void benchmark() {
        Arena arena = Arena.ofConfined();

        MemorySegment s = arena.allocate(SmallTestStruct1.LAYOUT);

        SmallTestStruct1.aIntHandle.set(s, 0L, 1);
        SmallTestStruct1.aIntHandle.get(s, 0L);

        arena.close();
    }

    public static void main(String[] args) throws RunnerException {
        Common.setup();

        Class<?> benchmarkClazz = VarHandleTest.class;
        ChainedOptionsBuilder opt = new OptionsBuilder()
                .shouldDoGC(true)
                .include(benchmarkClazz.getCanonicalName())
                .resultFormat(ResultFormatType.JSON)
                .result("benchmark-results/" + OUTPUT_DIR + "/" + fixBenchmarkName(benchmarkClazz) + ".json");

        if(ADD_ASYNC_PROFILER)
            opt.addProfiler(AsyncProfiler.class, "libPath=" + Common.asyncProfilerLib + ";" + (ASYNC_PROFILER_ALLOCATIONS ? "alloc=1k;" : "") + "output=flamegraph;simple=true;dir=benchmark-results/" + OUTPUT_DIR);

        new Runner(opt.build()).run();
    }
}
