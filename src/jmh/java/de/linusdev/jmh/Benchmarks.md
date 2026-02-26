
# Benchmarks

| Experiment | Benchmark | Class Name   | Description                                                   |
|------------|-----------|--------------|---------------------------------------------------------------|
| 1          | 1         | Benchmark2   | Allocate 10 small structs                                     |
| 1          | 2         | Benchmark3   | Allocate, Write, Read 1 small struct                          |   
| 1          | 3         | Benchmark4   | Allocate, Write, Read 1 small struct (No Warmup, singleShot)  |
| 2          | 1         | Benchmark5   | Allocate 5 medium structs                                     |
| 2          | 2         | Benchmark7   | Allocate, Write, Read 1 medium struct                         |
| 2          | 3         | Benchmark8   | Allocate, Write, Read 1 medium struct (No Warmup, singleShot) |
| 3          | 1         | Benchmark6   | Allocate 5 large structs                                      |
| 3          | 2         | Benchmark9   | Allocate, Write, Read 1 large struct                          |
| 3          | 3         | Benchmark10  | Allocate, Write, Read 1 large struct (No Warmup, singleShot)  |
