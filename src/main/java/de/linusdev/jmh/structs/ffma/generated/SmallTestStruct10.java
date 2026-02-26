package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;

public class SmallTestStruct10 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(SmallTestStruct3.LAYOUT.withName("aSmallTestStruct3"), SmallTestStruct7.LAYOUT.withName("aSmallTestStruct7")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aSmallTestStruct3 = MemoryLayout.PathElement.groupElement("aSmallTestStruct3");
    public static final MemoryLayout.PathElement aSmallTestStruct7 = MemoryLayout.PathElement.groupElement("aSmallTestStruct7");

    public static MemorySegment aSmallTestStruct3Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct3),  SmallTestStruct3.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct7Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct7),  SmallTestStruct7.LAYOUT.byteSize());

    }

}