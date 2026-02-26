package de.linusdev.jmh.generator;

import com.sun.jna.Structure;
import de.linusdev.lutils.codegen.SourceGenerator;
import de.linusdev.lutils.codegen.java.*;
import de.linusdev.lutils.math.vector.buffer.BBVectorInfo;
import de.linusdev.lutils.nat.array.*;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.array.StructureArrayInfo;
import de.linusdev.lutils.nat.struct.info.ArrayInfo;
import de.linusdev.lutils.nat.struct.info.ComplexStructureInfo;
import de.linusdev.lutils.nat.struct.info.StructVarInfo;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.Objects;

@SuppressWarnings("DuplicatedCode")
public class FFMAGenerator implements SpecificGenerator {

    private final static String SEQ_LAYOUT_HARD_CODED = ".withByteAlignment(1)).withName(\"";

    @Override
    public void generate(@NotNull SourceGenerator gen, @NotNull ComplexStructure struct, @NotNull ComplexStructureInfo info) {
        var file = gen.addJavaFile("ffma.generated");

        file.setName(struct.getClass().getSimpleName());
        file.setType(JavaClassType.CLASS);
        file.setStatic(false);

        var layoutVar = file.addVariable(JavaClass.ofClass(StructLayout.class), "LAYOUT");
        layoutVar.setVisibility(JavaVisibility.PUBLIC);
        layoutVar.setStatic(true);
        layoutVar.setFinal(true);


        int[] sizes = info.getSizes();
        JavaExpression[] params = new JavaExpression[sizes.length];

        StructVarInfo[] infos = info.getChildrenInfo();
        for (int i = 0; i < params.length; i++) {


            if(i%2==0) {
                // padding
                int pad = sizes[i];
                if(pad == 0)
                    continue;
                params[i] = JavaExpression.ofCode(
                        "MemoryLayout.paddingLayout(" + pad + ")",
                        new JavaImport(MemoryLayout.class, null)
                );
                continue;
            }

            StructVarInfo svInfo = infos[(i-1)/2];

            if(svInfo.getInfo() instanceof BBVectorInfo bbvInfo) {
                if(bbvInfo.getLength() == 1) {
                    switch (bbvInfo.getType()) {
                        case INTEGER, INT32 -> params[i] = JavaExpression.ofCode(
                                "ValueLayout.JAVA_INT.withByteAlignment(1).withName(\"" + svInfo.getVarName() + "\")",
                                new JavaImport(ValueLayout.class, null)
                        );
                        case INT8 -> params[i] = JavaExpression.ofCode(
                                "ValueLayout.JAVA_BYTE.withByteAlignment(1).withName(\"" + svInfo.getVarName() + "\")",
                                new JavaImport(ValueLayout.class, null)
                        );
                        case INT16 -> params[i] = JavaExpression.ofCode(
                                "ValueLayout.JAVA_SHORT.withByteAlignment(1).withName(\"" + svInfo.getVarName() + "\")",
                                new JavaImport(ValueLayout.class, null)
                        );
                        case INT64, POINTER -> params[i] = JavaExpression.ofCode(
                                "ValueLayout.JAVA_LONG.withByteAlignment(1).withName(\"" + svInfo.getVarName() + "\")",
                                new JavaImport(ValueLayout.class, null)
                        );
                        case FLOAT32 -> params[i] = JavaExpression.ofCode(
                                "ValueLayout.JAVA_FLOAT.withByteAlignment(1).withName(\"" + svInfo.getVarName() + "\")",
                                new JavaImport(ValueLayout.class, null)
                        );
                        case FLOAT64 -> params[i] = JavaExpression.ofCode(
                                "ValueLayout.JAVA_DOUBLE.withByteAlignment(1).withName(\"" + svInfo.getVarName() + "\")",
                                new JavaImport(ValueLayout.class, null)
                        );
                    }

                } else {
                    switch (bbvInfo.getType()) {
                        case INTEGER, INT32 -> params[i] = JavaExpression.ofCode(
                                "MemoryLayout.sequenceLayout(" + bbvInfo.getLength() + ", ValueLayout.JAVA_INT" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                                new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                        );
                        case INT8 -> params[i] = JavaExpression.ofCode(
                                "MemoryLayout.sequenceLayout(" + bbvInfo.getLength() + ", ValueLayout.JAVA_BYTE" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                                new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                        );
                        case INT16 -> params[i] = JavaExpression.ofCode(
                                "MemoryLayout.sequenceLayout(" + bbvInfo.getLength() + ", ValueLayout.JAVA_SHORT" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                                new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                        );
                        case INT64, POINTER -> params[i] = JavaExpression.ofCode(
                                "MemoryLayout.sequenceLayout(" + bbvInfo.getLength() + ", ValueLayout.JAVA_LONG" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                                new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                        );
                        case FLOAT32 -> params[i] = JavaExpression.ofCode(
                                "MemoryLayout.sequenceLayout(" + bbvInfo.getLength() + ", ValueLayout.JAVA_FLOAT" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                                new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                        );
                        case FLOAT64 -> params[i] = JavaExpression.ofCode(
                                "MemoryLayout.sequenceLayout(" + bbvInfo.getLength() + ", ValueLayout.JAVA_DOUBLE" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                                new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                        );
                    }
                }
            } else if(svInfo.getInfo() instanceof ComplexStructureInfo cxInfo) {
                String structName = svInfo.getClazz().getSimpleName();
                params[i] = JavaExpression.ofCode(
                        structName + ".LAYOUT.withName(\"" + svInfo.getVarName() + "\")",
                        JavaClass.custom(gen.getJavaBasePackage().extend("ffma.generated").getPackageString(), structName).getRequiredImports().toArray(new JavaImport[0])
                );
            }   else if(svInfo.getInfo() instanceof StructureArrayInfo arrayInfo) {

                if (arrayInfo.getElementInfo() instanceof BBVectorInfo bbvInfo) {
                    throw new Error("BBVector in array not implemented");

                } else if(arrayInfo.getElementInfo() instanceof ComplexStructureInfo complexInfo) {
                    String structName = arrayInfo.getElementClass().getSimpleName();
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", " + structName + ".LAYOUT).withName(\"" + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), JavaClass.custom(gen.getJavaBasePackage().extend("ffma.generated").getPackageString(), structName).getRequiredImports().getFirst()
                    );
                } else {
                    throw new Error("Unhandled array element info type: " + arrayInfo.getElementInfo());
                }

            } else if(svInfo.getInfo() instanceof ArrayInfo arrayInfo) {
                if(NativeInt8Array.class.equals(svInfo.getClazz())) {
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", ValueLayout.JAVA_BYTE" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                    );

                } else if(NativeInt16Array.class.equals(svInfo.getClazz())) {
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", ValueLayout.JAVA_SHORT" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                    );

                } else if(NativeInt32Array.class.equals(svInfo.getClazz())) {
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", ValueLayout.JAVA_INT" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                    );

                } else if(NativeInt64Array.class.equals(svInfo.getClazz())) {
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", ValueLayout.JAVA_LONG" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                    );

                } else if(NativeFloat32Array.class.equals(svInfo.getClazz())) {
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", ValueLayout.JAVA_FLOAT" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                    );

                } else if(NativeFloat64Array.class.equals(svInfo.getClazz())) {
                    params[i] = JavaExpression.ofCode(
                            "MemoryLayout.sequenceLayout(" + arrayInfo.getLength() + ", ValueLayout.JAVA_DOUBLE" + SEQ_LAYOUT_HARD_CODED + svInfo.getVarName() + "\")",
                            new JavaImport(MemoryLayout.class, null), new JavaImport(ValueLayout.class, null)
                    );

                } else {
                    throw new Error("Class " + svInfo.getClazz().getSimpleName() + " not supported");
                }

            } else {
                throw new Error("Unhandled info type");
            }
        }

        params = Arrays.stream(params).filter(Objects::nonNull).toArray(JavaExpression[]::new);


        JavaExpression m = JavaExpression.callMethod(
                JavaMethod.of(MemoryLayout.class, StructLayout.class, "structLayout", true),
                params
        );

        layoutVar.setDefaultValue(JavaExpression.ofCode(m.getExprString(gen.getSg()) + ".withByteAlignment(" + struct.getAlignment() + ")", m.getRequiredImports().toArray(new JavaImport[0])));


        for (int i = 0; i < infos.length; i++) {
            StructVarInfo svInfo = infos[i];

            var path = file.addVariable(JavaClass.ofClass(MemoryLayout.PathElement.class), svInfo.getVarName());
            path.setVisibility(JavaVisibility.PUBLIC);
            path.setStatic(true);
            path.setFinal(true);
            path.setDefaultValue(JavaExpression.ofCode(
                    "MemoryLayout.PathElement.groupElement(\"" + svInfo.getVarName() + "\")",
                    new JavaImport(MemoryLayout.class, null)
            ));

            if(svInfo.getInfo() instanceof BBVectorInfo bbvInfo) {
                if(bbvInfo.getLength() == 1) {
                    var handle = file.addVariable(JavaClass.ofClass(VarHandle.class), svInfo.getVarName() + "Handle");
                    handle.setVisibility(JavaVisibility.PUBLIC);
                    handle.setStatic(true);
                    handle.setFinal(true);
                    handle.setDefaultValue(JavaExpression.ofCode(
                            "LAYOUT.varHandle(" + svInfo.getVarName() + ")"
                    ));

                } else {
                    var handle = file.addVariable(JavaClass.ofClass(VarHandle.class), svInfo.getVarName() + "Handle");
                    handle.setVisibility(JavaVisibility.PUBLIC);
                    handle.setStatic(true);
                    handle.setFinal(true);
                    handle.setDefaultValue(JavaExpression.ofCode(
                            "LAYOUT.varHandle(" + svInfo.getVarName() + ", MemoryLayout.PathElement.sequenceElement())",
                            new JavaImport(MemoryLayout.class, null)
                    ));
                }
            } else if(svInfo.getInfo() instanceof ComplexStructureInfo cxInfo) {

                String elementStructName = svInfo.getClazz().getSimpleName();

                var handle = file.addMethod(JavaClass.ofClass(MemorySegment.class), svInfo.getVarName() + "Accessor");
                handle.setStatic(true);
                handle.setVisibility(JavaVisibility.PUBLIC);
                handle.addParameter("struct", JavaClass.ofClass(MemorySegment.class));
                handle.body(block -> {
                    block.addExpression(JavaExpression.ofCode("return struct.asSlice(LAYOUT.byteOffset(" + svInfo.getVarName() + "),  " + elementStructName + ".LAYOUT.byteSize())"));
                });

            }   else if(svInfo.getInfo() instanceof StructureArrayInfo arrayInfo) {

                if (arrayInfo.getElementInfo() instanceof BBVectorInfo bbvInfo) {
                    throw new Error("BBVector in array not implemented");

                } else if(arrayInfo.getElementInfo() instanceof ComplexStructureInfo complexInfo) {

                    String elementStructName = arrayInfo.getElementClass().getSimpleName();

                    var handle = file.addMethod(JavaClass.ofClass(MemorySegment.class), svInfo.getVarName() + "Accessor");
                    handle.setStatic(true);
                    handle.setVisibility(JavaVisibility.PUBLIC);
                    handle.addParameter("struct", JavaClass.ofClass(MemorySegment.class));
                    handle.addParameter("index", JavaClass.ofClass(int.class));
                    handle.body(block -> {
                        block.addExpression(JavaExpression.ofCode("return struct.asSlice(LAYOUT.byteOffset(" + svInfo.getVarName() + ", MemoryLayout.PathElement.sequenceElement(index)),  " + elementStructName + ".LAYOUT.byteSize())"));
                    });

                } else {
                    throw new Error("Unhandled array element info type: " + arrayInfo.getElementInfo());
                }

            } else if(svInfo.getInfo() instanceof ArrayInfo arrayInfo) {
                var handle = file.addVariable(JavaClass.ofClass(VarHandle.class), svInfo.getVarName() + "Handle");
                handle.setVisibility(JavaVisibility.PUBLIC);
                handle.setStatic(true);
                handle.setFinal(true);
                handle.setDefaultValue(JavaExpression.ofCode(
                        "LAYOUT.varHandle(" + svInfo.getVarName() + ", MemoryLayout.PathElement.sequenceElement())",
                        new JavaImport(MemoryLayout.class, null)
                ));

            } else {
                throw new Error("Unhandled info type");
            }

        }

    }
}
