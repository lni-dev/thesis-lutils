package de.linusdev.jmh.generator;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;
import de.linusdev.lutils.codegen.SourceGenerator;
import de.linusdev.lutils.codegen.java.JavaClass;
import de.linusdev.lutils.codegen.java.JavaClassType;
import de.linusdev.lutils.codegen.java.JavaExpression;
import de.linusdev.lutils.codegen.java.JavaVisibility;
import de.linusdev.lutils.math.vector.buffer.BBVectorInfo;
import de.linusdev.lutils.nat.array.*;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.array.StructureArrayInfo;
import de.linusdev.lutils.nat.struct.info.ArrayInfo;
import de.linusdev.lutils.nat.struct.info.ComplexStructureInfo;
import de.linusdev.lutils.nat.struct.info.StructVarInfo;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class JNAGenerator implements SpecificGenerator {
    @Override
    public void generate(@NotNull SourceGenerator gen, @NotNull ComplexStructure struct, @NotNull ComplexStructureInfo info) {

        var file = gen.addJavaFile("jna.generated");

        file.setName(struct.getClass().getSimpleName());
        file.setType(JavaClassType.CLASS);
        file.setStatic(false);
        file.setExtendedClass(JavaClass.ofClass(Structure.class));

        var infos = info.getChildrenInfo();

        StringBuilder fieldOrderRet = new StringBuilder("List.of(");
        boolean first = true;

        for (StructVarInfo svInfo : infos) {

            if(first) first = false;
            else fieldOrderRet.append(", ");

            fieldOrderRet.append("\"").append(svInfo.getVarName()).append("\"");

            if(svInfo.getInfo() instanceof BBVectorInfo bbvInfo) {
                if(bbvInfo.getLength() == 1) {
                    JavaClass clazz = JavaClass.ofClass(bbvInfo.getType().correspondingJavaType());
                    var javaVar = file.addVariable(clazz, svInfo.getVarName());
                    javaVar.setVisibility(JavaVisibility.PUBLIC);
                } else {
                    JavaClass clazz = JavaClass.ofClass(bbvInfo.getType().correspondingJavaType().arrayType());
                    var javaVar = file.addVariable(clazz, svInfo.getVarName());
                    javaVar.setDefaultValue(JavaExpression.ofCode("new " + bbvInfo.getType().correspondingJavaType().getSimpleName() + "[" + bbvInfo.getLength() + "]"));
                    javaVar.setVisibility(JavaVisibility.PUBLIC);
                }

            } else if(svInfo.getInfo() instanceof ComplexStructureInfo cxInfo) {
                String structName = svInfo.getClazz().getSimpleName();
                JavaClass clazz = JavaClass.custom(gen.getJavaBasePackage().extend("jna.generated").getPackageString(), structName);
                var javaVar = file.addVariable(clazz, svInfo.getVarName());
                javaVar.setVisibility(JavaVisibility.PUBLIC);

            }  else if(svInfo.getInfo() instanceof StructureArrayInfo arrayInfo) {

                if (arrayInfo.getElementInfo() instanceof BBVectorInfo bbvInfo) {
                    if (bbvInfo.getLength() == 1) {
                        JavaClass clazz = JavaClass.ofClass(bbvInfo.getType().correspondingJavaType().arrayType());
                        var javaVar = file.addVariable(clazz, svInfo.getVarName());
                        javaVar.setDefaultValue(JavaExpression.ofCode("new " + bbvInfo.getType().correspondingJavaType().getSimpleName() + "[" + arrayInfo.getLength() + "]"));
                        javaVar.setVisibility(JavaVisibility.PUBLIC);
                    } else {
                        throw new Error("cannot do vector in array");
                    }

                } else if(arrayInfo.getElementInfo() instanceof ComplexStructureInfo complexInfo) {
                    JavaClass clazz = JavaClass.custom(gen.getJavaBasePackage().extend("jna.generated").getPackageString(), arrayInfo.getElementClass().getSimpleName()).asArray();
                    var javaVar = file.addVariable(clazz, svInfo.getVarName());
                    String structName = arrayInfo.getElementClass().getSimpleName();
                    javaVar.setDefaultValue(JavaExpression.ofCode("(" + structName + "[]) new " + structName + "().toArray(" + arrayInfo.getLength() + ")"));
                    javaVar.setVisibility(JavaVisibility.PUBLIC);

                } else {
                    throw new Error("Unhandled array element info type: " + arrayInfo.getElementInfo());
                }

            } else if(svInfo.getInfo() instanceof ArrayInfo arrayInfo) {
                Class<?> clazz;

                if(NativeInt8Array.class.equals(svInfo.getClazz())) {
                    clazz = byte.class;

                } else if(NativeInt16Array.class.equals(svInfo.getClazz())) {
                    clazz = short.class;

                } else if(NativeInt32Array.class.equals(svInfo.getClazz())) {
                    clazz = int.class;

                } else if(NativeInt64Array.class.equals(svInfo.getClazz())) {
                    clazz = long.class;

                } else if(NativeFloat32Array.class.equals(svInfo.getClazz())) {
                    clazz = float.class;

                } else if(NativeFloat64Array.class.equals(svInfo.getClazz())) {
                    clazz = double.class;

                } else {
                    throw new Error("Class " + svInfo.getClazz().getSimpleName() + " not supported");
                }

                var javaVar = file.addVariable(JavaClass.ofClass(clazz.arrayType()), svInfo.getVarName());
                javaVar.setDefaultValue(JavaExpression.ofCode("new " + clazz.getSimpleName() + "[" + arrayInfo.getLength() + "]"));
                javaVar.setVisibility(JavaVisibility.PUBLIC);

            } else {
                throw new Error("Unhandled info type: " + svInfo.getInfo());
            }
        }

        fieldOrderRet.append(")");


        var getFieldOrderMethod = file.addMethod(JavaClass.ofClass(List.class).withGenerics(JavaClass.ofClass(String.class)), "getFieldOrder");
        getFieldOrderMethod.setVisibility(JavaVisibility.PROTECTED);
        getFieldOrderMethod.addAnnotation(JavaClass.ofClass(Override.class));
        getFieldOrderMethod.body(block -> block.addExpression(JavaExpression.returnExpr(JavaExpression.ofCode(fieldOrderRet.toString()))));

        var constructor1 = file.addConstructor();
        constructor1.body(block -> block.addExpression(JavaExpression.callSuper()));
        constructor1.setVisibility(JavaVisibility.PUBLIC);

        var constructor2 = file.addConstructor();
        constructor2.addParameter("p", JavaClass.ofClass(Pointer.class));
        constructor2.body(block ->  {
            block.addExpression(JavaExpression.ofCode("super(p)"));
            block.addExpression(JavaExpression.ofCode("read()"));
        });
        constructor2.setVisibility(JavaVisibility.PUBLIC);
    }
}
