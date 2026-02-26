package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class SmallTestStruct3 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aLong"), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aSecondLong"), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aThirdLong")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aLong = MemoryLayout.PathElement.groupElement("aLong");
    public static final VarHandle aLongHandle = LAYOUT.varHandle(aLong);
    public static final MemoryLayout.PathElement aSecondLong = MemoryLayout.PathElement.groupElement("aSecondLong");
    public static final VarHandle aSecondLongHandle = LAYOUT.varHandle(aSecondLong);
    public static final MemoryLayout.PathElement aThirdLong = MemoryLayout.PathElement.groupElement("aThirdLong");
    public static final VarHandle aThirdLongHandle = LAYOUT.varHandle(aThirdLong);

}