package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class SmallTestStruct6 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aPointer"), ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("aByte1"), MemoryLayout.paddingLayout(7), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aSecondPointer")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aPointer = MemoryLayout.PathElement.groupElement("aPointer");
    public static final VarHandle aPointerHandle = LAYOUT.varHandle(aPointer);
    public static final MemoryLayout.PathElement aByte1 = MemoryLayout.PathElement.groupElement("aByte1");
    public static final VarHandle aByte1Handle = LAYOUT.varHandle(aByte1);
    public static final MemoryLayout.PathElement aSecondPointer = MemoryLayout.PathElement.groupElement("aSecondPointer");
    public static final VarHandle aSecondPointerHandle = LAYOUT.varHandle(aSecondPointer);

}