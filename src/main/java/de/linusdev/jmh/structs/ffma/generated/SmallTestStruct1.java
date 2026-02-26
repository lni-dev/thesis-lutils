package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.VarHandle;

public class SmallTestStruct1 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_INT.withByteAlignment(1).withName("aInt"), ValueLayout.JAVA_FLOAT.withByteAlignment(1).withName("aFloat"), MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT.withByteAlignment(1)).withName("aIntVec4")).withByteAlignment(4);
    public static final MemoryLayout.PathElement aInt = MemoryLayout.PathElement.groupElement("aInt");
    public static final VarHandle aIntHandle = LAYOUT.varHandle(aInt);
    public static final MemoryLayout.PathElement aFloat = MemoryLayout.PathElement.groupElement("aFloat");
    public static final VarHandle aFloatHandle = LAYOUT.varHandle(aFloat);
    public static final MemoryLayout.PathElement aIntVec4 = MemoryLayout.PathElement.groupElement("aIntVec4");
    public static final VarHandle aIntVec4Handle = LAYOUT.varHandle(aIntVec4, MemoryLayout.PathElement.sequenceElement());

}