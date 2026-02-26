package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.VarHandle;

public class SmallTestStruct9 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(SmallTestStruct8.LAYOUT.withName("aSmallTestStruct8"), ValueLayout.JAVA_INT.withByteAlignment(1).withName("aSmallInt"), ValueLayout.JAVA_INT.withByteAlignment(1).withName("aSecondSmallInt")).withByteAlignment(4);
    public static final MemoryLayout.PathElement aSmallTestStruct8 = MemoryLayout.PathElement.groupElement("aSmallTestStruct8");
    public static final MemoryLayout.PathElement aSmallInt = MemoryLayout.PathElement.groupElement("aSmallInt");
    public static final VarHandle aSmallIntHandle = LAYOUT.varHandle(aSmallInt);
    public static final MemoryLayout.PathElement aSecondSmallInt = MemoryLayout.PathElement.groupElement("aSecondSmallInt");
    public static final VarHandle aSecondSmallIntHandle = LAYOUT.varHandle(aSecondSmallInt);

    public static MemorySegment aSmallTestStruct8Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct8),  SmallTestStruct8.LAYOUT.byteSize());

    }

}