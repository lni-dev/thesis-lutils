package de.linusdev.jmh;

public class Constants {

    // Average Time Benchmarks
    private static final int MEASURE_TIME = 1;
    private static final int WARMUP_IT = 50; // 50
    private static final int MEASURE_IT = 400; // 400
    public static final int FORKS = 3; // 3, Change to 1 for profiling
    public static final boolean AVERAGE_DO_GC = false;

    // Singe Shot Benchmarks
    private static final int NO_WARMUP = 0; // No warmup to measure startup time
    private static final int SINGLE_IT = 2; // one measurement, one reference
    private static final int SINGLE_FORKS = 1000; // Repeat
    public static final boolean SINGLE_DO_GC = true;

    // Benchmark Specific
    public static final int B2_FORKS = FORKS;
    public static final int B2_MEASUREMENT_TIME = MEASURE_TIME;
    public static final int B2_WARMUP_ITERATIONS = WARMUP_IT;
    public static final int B2_MEASUREMENT_ITERATIONS = MEASURE_IT;

    public static final int B3_FORKS = FORKS;
    public static final int B3_MEASUREMENT_TIME = MEASURE_TIME;
    public static final int B3_WARMUP_ITERATIONS = WARMUP_IT;
    public static final int B3_MEASUREMENT_ITERATIONS = MEASURE_IT;
    public static final int B3_RANDOM_SEED = 134545;

    public static final int B4_WARMUP_ITERATIONS = NO_WARMUP;
    public static final int B4_MEASUREMENT_ITERATIONS = SINGLE_IT;
    public static final int B4_FORKS = SINGLE_FORKS;

    public static final int B5_FORKS = FORKS;
    public static final int B5_MEASUREMENT_TIME = MEASURE_TIME;
    public static final int B5_WARMUP_ITERATIONS = WARMUP_IT;
    public static final int B5_MEASUREMENT_ITERATIONS = MEASURE_IT;

    public static final int B6_FORKS = FORKS;
    public static final int B6_MEASUREMENT_TIME = MEASURE_TIME;
    public static final int B6_WARMUP_ITERATIONS = WARMUP_IT;
    public static final int B6_MEASUREMENT_ITERATIONS = MEASURE_IT;

    public static final int B7_FORKS = FORKS;
    public static final int B7_MEASUREMENT_TIME = MEASURE_TIME;
    public static final int B7_WARMUP_ITERATIONS = WARMUP_IT;
    public static final int B7_MEASUREMENT_ITERATIONS = MEASURE_IT;
    public static final int B7_RANDOM_SEED = 134545;

    public static final int B8_WARMUP_ITERATIONS = NO_WARMUP;
    public static final int B8_MEASUREMENT_ITERATIONS = SINGLE_IT;
    public static final int B8_FORKS = SINGLE_FORKS;

    public static final int B9_FORKS = FORKS;
    public static final int B9_MEASUREMENT_TIME = MEASURE_TIME;
    public static final int B9_WARMUP_ITERATIONS = WARMUP_IT;
    public static final int B9_MEASUREMENT_ITERATIONS = MEASURE_IT;
    public static final int B9_RANDOM_SEED = 124545;

    public static final int B10_WARMUP_ITERATIONS = NO_WARMUP;
    public static final int B10_MEASUREMENT_ITERATIONS = SINGLE_IT;
    public static final int B10_FORKS = SINGLE_FORKS;

    public static String OUTPUT_DIR = "" + System.currentTimeMillis();
    public static boolean ADD_ASYNC_PROFILER = false;
    /**
     * Profile allocations instead of execution time
     */
    public static boolean ASYNC_PROFILER_ALLOCATIONS = false;

}
