cd ../../../

chmod +x ./gradlew
./gradlew jmhJar

OutputDir="$(date +"%Y-%m-%d_%H-%M-%S")"
Name="optimizationtests.AllocateBenchmark"

java -Xmx8g -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "$Name" "$OutputDir"



