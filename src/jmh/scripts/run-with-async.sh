cd ../../../

chmod +x ./gradlew
./gradlew jmhJar

Allocation="false"
OutputDir="$(date +"%Y-%m-%d_%H-%M-%S")"

java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark2" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark3" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark5" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark6" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark7" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark9" "$OutputDir" "true" "$Allocation"

Allocation="true"

java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark2" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark3" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark5" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark6" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark7" "$OutputDir" "true" "$Allocation"
java -Xmx8g -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "lutils.Benchmark9" "$OutputDir" "true" "$Allocation"




