package de.linusdev.jmh.generator;

import de.linusdev.lutils.codegen.SourceGenerator;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.info.ComplexStructureInfo;
import org.jetbrains.annotations.NotNull;

public interface SpecificGenerator {

    void generate(@NotNull SourceGenerator gen, @NotNull ComplexStructure struct,  @NotNull ComplexStructureInfo info);

}
