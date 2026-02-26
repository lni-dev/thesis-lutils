package de.linusdev.jmh.generator;

import de.linusdev.jmh.structs.lutils.*;
import de.linusdev.lutils.codegen.SourceGenerator;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.nio.file.Path;

public class Generator {

    SourceGenerator generator  = new SourceGenerator(Path.of("src/main/"));

    JNAGenerator jnaGenerator = new JNAGenerator();
    FFMAGenerator ffmaGenerator = new FFMAGenerator();
    LWJGLGenerator lwjglGenerator = new LWJGLGenerator();

    public Generator() {
        generator.setJavaBasePackage("de.linusdev.jmh.structs");
    }

    public void generate(@NotNull ComplexStructure lutilsStruct) {
        lutilsStruct.allocate();
        jnaGenerator.generate(generator, lutilsStruct, lutilsStruct.getInfo());
        ffmaGenerator.generate(generator, lutilsStruct, lutilsStruct.getInfo());
        lwjglGenerator.generate(generator, lutilsStruct, lutilsStruct.getInfo());
    }

    public void write() throws IOException {
        generator.write();
    }

    public static void main(String[] args) throws IOException {
        Generator gen = new Generator();

        gen.generate(new SmallTestStruct1());
        gen.generate(new SmallTestStruct2());
        gen.generate(new SmallTestStruct3());
        gen.generate(new SmallTestStruct4());
        gen.generate(new SmallTestStruct5());
        gen.generate(new SmallTestStruct6());
        gen.generate(new SmallTestStruct7());
        gen.generate(new SmallTestStruct8());
        gen.generate(new SmallTestStruct9());
        gen.generate(new SmallTestStruct10());

        gen.generate(new MediumTestStruct1());
        gen.generate(new MediumTestStruct2());
        gen.generate(new MediumTestStruct3());
        gen.generate(new MediumTestStruct4());
        gen.generate(new MediumTestStruct5());

        gen.generate(new LargeTestStruct1());
        gen.generate(new LargeTestStruct2());
        gen.generate(new LargeTestStruct3());
        gen.generate(new LargeTestStruct4());
        gen.generate(new LargeTestStruct5());

        gen.write();
    }

}
