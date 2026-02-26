package de.linusdev.jmh;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static final @NotNull List<Class<?>> benchmarks = List.of(

            // Special Benchmarks
            de.linusdev.jmh.optimizationtests.AllocateBenchmark.class,
            de.linusdev.jmh.optimizationtests.VarHandleTest.class,

            // Normal Benchmarks

            de.linusdev.jmh.lutils.Benchmark2.class,
            de.linusdev.jmh.ffma.Benchmark2.class,
            de.linusdev.jmh.lwjgl.Benchmark2.class,
            de.linusdev.jmh.jna.Benchmark2.class,

            de.linusdev.jmh.lutils.Benchmark3.class,
            de.linusdev.jmh.ffma.Benchmark3.class,
            de.linusdev.jmh.lwjgl.Benchmark3.class,
            de.linusdev.jmh.jna.Benchmark3.class,

            de.linusdev.jmh.lutils.Benchmark3Baseline.class,
            de.linusdev.jmh.ffma.Benchmark3Baseline.class,
            de.linusdev.jmh.lwjgl.Benchmark3Baseline.class,
            de.linusdev.jmh.jna.Benchmark3Baseline.class,

            de.linusdev.jmh.lutils.Benchmark4.class,
            de.linusdev.jmh.ffma.Benchmark4.class,
            de.linusdev.jmh.lwjgl.Benchmark4.class,
            de.linusdev.jmh.jna.Benchmark4.class,

            de.linusdev.jmh.lutils.Benchmark5.class,
            de.linusdev.jmh.ffma.Benchmark5.class,
            de.linusdev.jmh.lwjgl.Benchmark5.class,
            de.linusdev.jmh.jna.Benchmark5.class,

            de.linusdev.jmh.lutils.Benchmark6.class,
            de.linusdev.jmh.ffma.Benchmark6.class,
            de.linusdev.jmh.lwjgl.Benchmark6.class,
            de.linusdev.jmh.jna.Benchmark6.class,

            de.linusdev.jmh.lutils.Benchmark7.class,
            de.linusdev.jmh.ffma.Benchmark7.class,
            de.linusdev.jmh.lwjgl.Benchmark7.class,
            de.linusdev.jmh.jna.Benchmark7.class,

            de.linusdev.jmh.lutils.Benchmark7Baseline.class,
            de.linusdev.jmh.ffma.Benchmark7Baseline.class,
            de.linusdev.jmh.lwjgl.Benchmark7Baseline.class,
            de.linusdev.jmh.jna.Benchmark7Baseline.class,

            de.linusdev.jmh.lutils.Benchmark8.class,
            de.linusdev.jmh.ffma.Benchmark8.class,
            de.linusdev.jmh.lwjgl.Benchmark8.class,
            de.linusdev.jmh.jna.Benchmark8.class,

            de.linusdev.jmh.lutils.Benchmark9.class,
            de.linusdev.jmh.ffma.Benchmark9.class,
            de.linusdev.jmh.lwjgl.Benchmark9.class,
            de.linusdev.jmh.jna.Benchmark9.class,

            de.linusdev.jmh.lutils.Benchmark9Baseline.class,
            de.linusdev.jmh.ffma.Benchmark9Baseline.class,
            de.linusdev.jmh.lwjgl.Benchmark9Baseline.class,
            de.linusdev.jmh.jna.Benchmark9Baseline.class,

            de.linusdev.jmh.lutils.Benchmark10.class,
            de.linusdev.jmh.ffma.Benchmark10.class,
            de.linusdev.jmh.lwjgl.Benchmark10.class,
            de.linusdev.jmh.jna.Benchmark10.class
    );

    public static @NotNull String fixBenchmarkName(@NotNull Class<?> benchmarkClass) {
        return benchmarkClass.getCanonicalName().substring("de.linusdev.jmh.".length());
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        if(args.length == 0) {
            System.out.println("Please select a benchmark to run (pass as fist arg):");
            for (Class<?> benchmark : benchmarks) {
                System.out.println(" - " + fixBenchmarkName(benchmark));
            }
            return;
        }




        String toRun = args[0];

        if(args.length > 1) {
            Constants.OUTPUT_DIR = args[1];
            System.out.println("Output dir read as: " + Constants.OUTPUT_DIR);
        }

        if(args.length > 2) {
            Constants.ADD_ASYNC_PROFILER = "true".equalsIgnoreCase(args[2]);
        }

        if(args.length > 3) {
            Constants.ASYNC_PROFILER_ALLOCATIONS = "true".equalsIgnoreCase(args[3]);
        }

        for (Class<? > benchmark : benchmarks) {
            if(fixBenchmarkName(benchmark).equals(toRun)) {
                Method meth = benchmark.getMethod("main", String[].class);
                String[] argsCopy = Arrays.copyOfRange(args, 1, args.length);
                meth.invoke(null, (Object) argsCopy);
                return;
            }
        }

        System.err.println("Unknown benchmark '" + toRun + "'.");
    }
}
