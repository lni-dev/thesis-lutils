cd ../../../

chmod +x ./gradlew
./gradlew jmhJar

OutputDir="$(date +"%Y-%m-%d_%H-%M-%S")"
Name="optimizationtests.VarHandleTest"

java -XX:+UnlockDiagnosticVMOptions -XX:+DebugNonSafepoints -jar ./build/libs/thesis-lutils-1.0.0-jmh.jar "$Name" "$OutputDir" "true"



