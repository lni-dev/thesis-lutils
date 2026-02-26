# Directory Structure

- `benchmark-results`: Results of all JMH benchmark and async profiler runs as well as the generated graphs
- `documents`: The thesis, the paper and the final presentation
- `lwjgl3`: edited LWJGL clone to generate structures 
- `src/jmh`: benchmark code, python code for graph generation, scripts to start benchmarks
- `src/main`: structure code and generator for structures

# Benchmarks
The code of the benchmarks is in `src/jmh/java/de/linusdev/jmh/`.
A table which maps experiments/benchmarks to **benchmark class names** can be found in
`src/jmh/java/de/linusdev/jmh/Benchmarks.md`.

## Executing Benchmarks
Notes:
- **All Shell scripts must be executed from the working directory `src/jmh/scripts/`!**


Average time benchmarks (benchmark 1 and 2 of each experiment) can be executed using
`src/jmh/scripts/run.sh`. Inside the script the `BenchmarkName` variable
must be set to the benchmark class name which should be executed.
This will also automatically run the python script to generate the corresponding plots.

Single shot benchmarks (benchmark 3 of each experiment) can be executed using 
`src/jmh/scripts/run-single-shot-benchmark.sh`. Inside the script the `BenchmarkName` variable
must be set to the benchmark class name which should be executed. This will also automatically
run the python script to generate the corresponding plots.

## Special Benchmarks
Special Benchmarks (e.g.: `optimizationtests.AllocateBenchmark`) can be run using
`src/jmh/scripts/run-special.sh`. The `Name` variable must be set to the benchmark class name including the
last package.

Special Benchmarks can also be profiled using `src/jmh/scripts/run-special-with-async.sh`. The `Name` variable must be set to the benchmark class name including the
last package.

## Profiling LUtils Benchmarks
Executing the script `src/jmh/scripts/run-with-async.sh` will run all lutils benchmark with the async profiler.
Inside the script the `Allocation` variable can be set to `true` to benchmark allocations instead
of execution time.

# Python script to generate plots
The python scripts are all located in `src/jmh/python`. The respective README `src/jmh/python/README.md`
shows how to install the python environment.

The scripts `make-graph.py` and `make-graph-of-ss.py` 

Some other python scripts must be run manually. They contain variables at the top of the script
which define where the benchmark results to process are:
- `make-graph.py` and `make-graph-of-ss.py`: make graph and create `summary.json` of normal and single shot benchmarks.
  These are executed automatically after the respective benchmark scripts are executed. But can be executed again. If the variable
  `benchmarkDir` contains a `reference.json` it is used as reference. The `reference.json` must be a `summary.json` from another benchmark.
- `allocator_benchmark_graph.py`: Processes a benchmark of the benchmark `optimizationtests.AllocateBenchmark`
- `bar_chart_of_summary.py`: Creates multiple bar charts of a `summary.json` file created through a run of
  `run.sh` or `run-single-shot-benchmark.sh`
- `two_benchmarks_combined.py`: Creates a single bar chart combining a specific benchmark of 2 experiments. Uses the
  `summary.json` file created through a run of `run.sh` or `run-single-shot-benchmark.sh`.
- `two_experiments_combined.py`: Creates a single bar chart combining two different benchmarks. Uses the
  `summary.json` file created through a run of `run.sh` or `run-single-shot-benchmark.sh`.

Note: **the python `venv` environment must be created in order for the `summary.json` files to be created during execution of
`run.sh` or `run-single-shot-benchmark.sh`.** See `src/jmh/python/README.md`.

# Generating additional structures
- Define all new structures in `src/main/java/de/linusdev/jmh/structs/lutils` analogous to the already present structures.
- Add the new structures in the main method of `src/main/java/de/linusdev/jmh/generator/Generator.java`.
- Copy the content from `src/main/resources/de/linusdev/jmh/structs/lwjgl/generated/structs.kt` to
  `lwjgl3/modules/lwjgl/assimp/src/templates/kotlin/assimp/AssimpTypes.kt`. (Replace what is currently between the comments `START OF CUSTOM STRUCTS`
  and `END OF CUSTOM STRUCTS`)
- Open the directory`lwjgl` in a new IDE window
  - run ant task `clean`
  - run the ant task `generate` (also stored as IntelIJ task called `GENERATOR`)
  - copy the generated structures from `lwjgl3/modules/lwjgl/assimp/src/generated/java/org/lwjgl/assimp`
    to `src/main/java/de/linusdev/jmh/structs/lwjgl/`