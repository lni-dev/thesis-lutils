package de.linusdev.jmh.optimizationtests;

import de.linusdev.jmh.Common;
import de.linusdev.lutils.nat.struct.utils.BufferUtils;
import de.linusdev.lutils.nat.struct.utils.Utils;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.system.libc.LibCStdlib;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import org.openjdk.jmh.profile.AsyncProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import sun.misc.Unsafe;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Constants.OUTPUT_DIR;
import static de.linusdev.jmh.Main.fixBenchmarkName;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1)
@Warmup(iterations = 2, time = 3)
@Measurement(iterations = 3, time = 3)
@OutputTimeUnit(value = TimeUnit.NANOSECONDS)
@State(value = Scope.Benchmark)
public class AllocateBenchmark {

    @Param({"100000"})
    public int size;

    @Benchmark
    public void allocateLUtils(Blackhole bh) {
        ByteBuffer buf = BufferUtils.create64BitAligned(size);
        bh.consume(buf);
    }

    @SuppressWarnings("removal")
    @Benchmark
    public void allocateMAlloc(Blackhole bh) {
        long p = LibCStdlib.nmalloc(size);
        bh.consume(p);
        LibCStdlib.nfree(p);
    }

    @SuppressWarnings("removal")
    @Benchmark
    public void allocateMAlloc_Zeroed_Memory(Blackhole bh) {
        long p = LibCStdlib.nmalloc(size);
        Utils.UNSAFE.setMemory(p, size, (byte) 0);
        bh.consume(p);
        LibCStdlib.nfree(p);
    }

    public MethodHandle malloc;
    public MethodHandle mfree;

    //@Setup
    public void setup() {
        Linker linker = Linker.nativeLinker();
        SymbolLookup stdlib = linker.defaultLookup();

        malloc = linker.downcallHandle(
                stdlib.find("malloc").get(),
                FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
        );

        mfree = linker.downcallHandle(
                stdlib.find("free").get(),
                FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)
        );
    }

    //@Benchmark
    public void allocateMAllocViaMethodHandle(Blackhole bh) throws Throwable {
        long address = (long) malloc.invokeExact((long) size);
        bh.consume(address);
        mfree.invokeExact(address);
    }

    @Benchmark
    public void allocateFFMA(Blackhole bh) {
        Arena arena = Arena.ofConfined();
        MemorySegment segment = arena.allocate(size);
        bh.consume(segment);
        arena.close();
    }

    public static List<String> params() {
        Random random = new Random(2989);
        List<String> params = random.doubles(180, 5.0, 19.0)
                .mapToInt(v -> {
                    int i = (int) Math.pow(2, v);
                    return (i % 2) == 0 ? i : i+1;
                }).distinct().sorted().mapToObj(value -> "" + value).toList();
        System.out.println(params.size() + " params:\n" + params);
        return params;
    }

    public static void main(String[] args) throws RunnerException {
        Common.setup();

        Class<?> benchmarkClazz = AllocateBenchmark.class;
        ChainedOptionsBuilder opt = new OptionsBuilder()
                .shouldDoGC(true)
                .include(benchmarkClazz.getCanonicalName())
                .resultFormat(ResultFormatType.JSON)
                .param("size", params().toArray(new String[0]))
                .result("benchmark-results/" + OUTPUT_DIR + "/" + fixBenchmarkName(benchmarkClazz) + ".json");

        if(ADD_ASYNC_PROFILER)
            opt.addProfiler(AsyncProfiler.class, "libPath=" + Common.asyncProfilerLib + ";" + (ASYNC_PROFILER_ALLOCATIONS ? "alloc=1k;" : "") + "output=flamegraph;simple=true;dir=benchmark-results/" + OUTPUT_DIR);

        new Runner(opt.build()).run();
    }

}
