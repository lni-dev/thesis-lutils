plugins {
    id("java")
    id("me.champeau.jmh").version("0.7.3")
}

group = "de.linusdev"
version = "1.0.0"

repositories {
    mavenCentral()
}

tasks.jmhJar {
    manifest {
        attributes["Main-Class"] = "de.linusdev.jmh.Main"
    }
}

jmh {

}

dependencies {

    // JMH
    jmh("org.openjdk.jmh:jmh-core:1.37")
    jmh("org.openjdk.jmh:jmh-generator-annprocess:1.37")
    jmhAnnotationProcessor("org.openjdk.jmh:jmh-generator-annprocess:1.37")

    // LUtils
    implementation("de.linusdev:lutils:2.1.0")

    // LWJGL
    implementation(platform("org.lwjgl:lwjgl-bom:3.3.6"))
    implementation("org.lwjgl", "lwjgl")
    implementation("org.lwjgl", "lwjgl", classifier = "natives-linux")
    implementation("org.lwjgl", "lwjgl", classifier = "natives-windows")
    implementation("org.jspecify:jspecify:1.0.0")

    // JNA
    implementation("net.java.dev.jna:jna:5.17.0")
}

tasks.test {
    useJUnitPlatform()
}
