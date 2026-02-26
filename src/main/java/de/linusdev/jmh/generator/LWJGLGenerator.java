package de.linusdev.jmh.generator;

import de.linusdev.lutils.codegen.SourceGenerator;
import de.linusdev.lutils.codegen.java.JavaClass;
import de.linusdev.lutils.codegen.java.JavaExpression;
import de.linusdev.lutils.codegen.java.JavaVisibility;
import de.linusdev.lutils.codegen.res.ResourceFileGenerator;
import de.linusdev.lutils.math.vector.buffer.BBVectorInfo;
import de.linusdev.lutils.nat.NativeType;
import de.linusdev.lutils.nat.array.*;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.array.StructureArrayInfo;
import de.linusdev.lutils.nat.struct.info.ArrayInfo;
import de.linusdev.lutils.nat.struct.info.ComplexStructureInfo;
import de.linusdev.lutils.nat.struct.info.StructVarInfo;
import org.jetbrains.annotations.NotNull;

public class LWJGLGenerator implements SpecificGenerator {

    public ResourceFileGenerator file = null;

    @Override
    public void generate(@NotNull SourceGenerator gen, @NotNull ComplexStructure struct, @NotNull ComplexStructureInfo info) {
        if(file == null)
            file = gen.addResourceFile("de/linusdev/jmh/structs/lwjgl/generated", "structs", "kt");

        file.addContent("val " + struct.getClass().getSimpleName() + " = struct(Module.ASSIMP, \"" + struct.getClass().getSimpleName() + "\") {\n");

        var infos = info.getChildrenInfo();
        // Elements
        for (StructVarInfo svInfo : infos) {

            if(svInfo.getInfo() instanceof BBVectorInfo bbvInfo) {
                if(bbvInfo.getLength() == 1) {
                    file.addContent("    " + nativeTypeToLWJGLType(bbvInfo.getType()) + "(\"" + svInfo.getVarName() + "\")\n");
                } else {
                    file.addContent("    " + nativeTypeToLWJGLType(bbvInfo.getType()) + "(\"" + svInfo.getVarName() + "\")[" + bbvInfo.getLength() + "]\n");
                }

            } else if(svInfo.getInfo() instanceof ComplexStructureInfo cxInfo) {
                String structName = svInfo.getClazz().getSimpleName();
                file.addContent("    " + structName + "(\"" + svInfo.getVarName() + "\")\n");

            }  else if(svInfo.getInfo() instanceof StructureArrayInfo arrayInfo) {

                if (arrayInfo.getElementInfo() instanceof BBVectorInfo bbvInfo) {
                    if (bbvInfo.getLength() == 1) {
                        file.addContent("    " + nativeTypeToLWJGLType(bbvInfo.getType()) + "(\"" + svInfo.getVarName() + "\")[" + arrayInfo.getLength() + "]\n");
                    } else {
                        throw new Error("cannot do vector in array");
                    }

                } else if(arrayInfo.getElementInfo() instanceof ComplexStructureInfo complexInfo) {

                    String structName = arrayInfo.getElementClass().getSimpleName();
                    file.addContent("    " + structName + "(\"" + svInfo.getVarName() + "\")[" + arrayInfo.getLength() + "]\n");

                } else {
                    throw new Error("Unhandled array element info type: " + arrayInfo.getElementInfo());
                }

            } else if(svInfo.getInfo() instanceof ArrayInfo arrayInfo) {
                NativeType nativeType;

                if(NativeInt8Array.class.equals(svInfo.getClazz())) {
                    nativeType = NativeType.INT8;

                } else if(NativeInt16Array.class.equals(svInfo.getClazz())) {
                    nativeType = NativeType.INT16;

                } else if(NativeInt32Array.class.equals(svInfo.getClazz())) {
                    nativeType = NativeType.INT32;

                } else if(NativeInt64Array.class.equals(svInfo.getClazz())) {
                    nativeType = NativeType.INT64;

                } else if(NativeFloat32Array.class.equals(svInfo.getClazz())) {
                    nativeType = NativeType.FLOAT32;

                } else if(NativeFloat64Array.class.equals(svInfo.getClazz())) {
                    nativeType = NativeType.FLOAT64;

                } else {
                    throw new Error("Class " + svInfo.getClazz().getSimpleName() + " not supported");
                }

                file.addContent("    " + nativeTypeToLWJGLType(nativeType) + "(\"" + svInfo.getVarName() + "\")[" + arrayInfo.getLength() + "]\n");

            } else {
                throw new Error("Unhandled info type: " + svInfo.getInfo());
            }
        }


        // End
        file.addContent("}\n\n");


    }

    private static @NotNull String nativeTypeToLWJGLType(@NotNull NativeType type) {
        return switch (type) {
            case INTEGER, INT32 -> "int32_t";
            case INT8 -> "int8_t";
            case INT16 -> "int16_t";
            case INT64, POINTER -> "int64_t";
            case FLOAT32 -> "float";
            case FLOAT64 -> "double";
        };
    }
}
