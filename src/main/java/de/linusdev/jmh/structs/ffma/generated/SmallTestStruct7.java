package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class SmallTestStruct7 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_INT.withByteAlignment(1).withName("aInt"), MemoryLayout.paddingLayout(4), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aPointer"), ValueLayout.JAVA_INT.withByteAlignment(1).withName("aSecondInt"), ValueLayout.JAVA_INT.withByteAlignment(1).withName("aThirdInt")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aInt = MemoryLayout.PathElement.groupElement("aInt");
    public static final VarHandle aIntHandle = LAYOUT.varHandle(aInt);
    public static final MemoryLayout.PathElement aPointer = MemoryLayout.PathElement.groupElement("aPointer");
    public static final VarHandle aPointerHandle = LAYOUT.varHandle(aPointer);
    public static final MemoryLayout.PathElement aSecondInt = MemoryLayout.PathElement.groupElement("aSecondInt");
    public static final VarHandle aSecondIntHandle = LAYOUT.varHandle(aSecondInt);
    public static final MemoryLayout.PathElement aThirdInt = MemoryLayout.PathElement.groupElement("aThirdInt");
    public static final VarHandle aThirdIntHandle = LAYOUT.varHandle(aThirdInt);

}