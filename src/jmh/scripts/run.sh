cd ../../../

chmod +x ./gradlew
./gradlew jmhJar

BenchmarkName="Benchmark9"
OutputDir="$(date +"%Y-%m-%d_%H-%M-%S")"

java -Xmx8g -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.$BenchmarkName" "$OutputDir"
java -Xmx8g -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "ffma.$BenchmarkName" "$OutputDir"
java -Xmx8g -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "jna.$BenchmarkName" "$OutputDir"
java -Xmx8g -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lwjgl.$BenchmarkName" "$OutputDir"

cd ./src/jmh/python/
source .venv/bin/activate
python ./make-graph.py "$OutputDir"
