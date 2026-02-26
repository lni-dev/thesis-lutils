package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class SmallTestStruct5 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aPointer64"), ValueLayout.JAVA_SHORT.withByteAlignment(1).withName("aShort1"), MemoryLayout.paddingLayout(6), MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_LONG.withByteAlignment(1)).withName("aLong3")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aPointer64 = MemoryLayout.PathElement.groupElement("aPointer64");
    public static final VarHandle aPointer64Handle = LAYOUT.varHandle(aPointer64);
    public static final MemoryLayout.PathElement aShort1 = MemoryLayout.PathElement.groupElement("aShort1");
    public static final VarHandle aShort1Handle = LAYOUT.varHandle(aShort1);
    public static final MemoryLayout.PathElement aLong3 = MemoryLayout.PathElement.groupElement("aLong3");
    public static final VarHandle aLong3Handle = LAYOUT.varHandle(aLong3, MemoryLayout.PathElement.sequenceElement());

}