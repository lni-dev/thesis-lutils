package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;
import java.lang.foreign.MemorySegment;

public class SmallTestStruct4 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aPointer"), SmallTestStruct1.LAYOUT.withName("aSmallTestStruct1")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aPointer = MemoryLayout.PathElement.groupElement("aPointer");
    public static final VarHandle aPointerHandle = LAYOUT.varHandle(aPointer);
    public static final MemoryLayout.PathElement aSmallTestStruct1 = MemoryLayout.PathElement.groupElement("aSmallTestStruct1");

    public static MemorySegment aSmallTestStruct1Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct1),  SmallTestStruct1.LAYOUT.byteSize());

    }

}