package de.linusdev.jmh;

import de.linusdev.lutils.nat.loader.ResourceNativeLibraryLoader;
import de.linusdev.lutils.os.OsType;
import de.linusdev.lutils.os.OsUtils;
import org.openjdk.jmh.profile.AsyncProfiler;
import org.openjdk.jmh.profile.GCProfiler;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.ChainedOptionsBuilder;
import org.openjdk.jmh.runner.options.OptionsBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static de.linusdev.jmh.Constants.*;
import static de.linusdev.jmh.Main.fixBenchmarkName;

public class Common {
    private static boolean isSetup = false;

    public static Path asyncProfilerLib = null;

    public static synchronized void setup() {
        if(isSetup)
            return;

        // export async profiler native lib
        if(OsUtils.CURRENT_OS == OsType.LINUX) {
            try {
                var exported = ResourceNativeLibraryLoader.export(null, null,
                        "/de/linusdev/jmh/asyncProfiler").get().getResult();
                assert exported != null;
                asyncProfilerLib = exported.getLibFilePath();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Create output dir if it does not exist
        Path outputDir = Paths.get("benchmark-results/", OUTPUT_DIR, "/");

        if(!Files.isDirectory(outputDir)) {
            try {
                Files.createDirectories(outputDir);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        isSetup = true;
    }

    public static void runBenchmark(Class<?> benchmarkClazz, boolean doGc) throws RunnerException {
        ChainedOptionsBuilder opt = new OptionsBuilder()
                .include(benchmarkClazz.getCanonicalName() + "\\.")
                .addProfiler(GCProfiler.class)
                .resultFormat(ResultFormatType.JSON)
                .result("benchmark-results/" + OUTPUT_DIR + "/" + fixBenchmarkName(benchmarkClazz) + ".json")
                .shouldDoGC(doGc);;

        if(ADD_ASYNC_PROFILER)
            opt.addProfiler(AsyncProfiler.class, "libPath=" + Common.asyncProfilerLib + ";" + (ASYNC_PROFILER_ALLOCATIONS ? "alloc=1k;" : "") + "output=flamegraph;simple=true;dir=benchmark-results/" + OUTPUT_DIR);

        new Runner(opt.build()).run();
    }

}
