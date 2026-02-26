package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class SmallTestStruct8 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("AByte"), MemoryLayout.paddingLayout(1), ValueLayout.JAVA_SHORT.withByteAlignment(1).withName("aShort"), ValueLayout.JAVA_INT.withByteAlignment(1).withName("aInt")).withByteAlignment(4);
    public static final MemoryLayout.PathElement AByte = MemoryLayout.PathElement.groupElement("AByte");
    public static final VarHandle AByteHandle = LAYOUT.varHandle(AByte);
    public static final MemoryLayout.PathElement aShort = MemoryLayout.PathElement.groupElement("aShort");
    public static final VarHandle aShortHandle = LAYOUT.varHandle(aShort);
    public static final MemoryLayout.PathElement aInt = MemoryLayout.PathElement.groupElement("aInt");
    public static final VarHandle aIntHandle = LAYOUT.varHandle(aInt);

}