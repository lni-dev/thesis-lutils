package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class SmallTestStruct2 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_INT.withByteAlignment(1).withName("aInt"), ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("aByte"), MemoryLayout.paddingLayout(3), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aLong")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aInt = MemoryLayout.PathElement.groupElement("aInt");
    public static final VarHandle aIntHandle = LAYOUT.varHandle(aInt);
    public static final MemoryLayout.PathElement aByte = MemoryLayout.PathElement.groupElement("aByte");
    public static final VarHandle aByteHandle = LAYOUT.varHandle(aByte);
    public static final MemoryLayout.PathElement aLong = MemoryLayout.PathElement.groupElement("aLong");
    public static final VarHandle aLongHandle = LAYOUT.varHandle(aLong);

}