package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;

public class LargeTestStruct5 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(LargeTestStruct1.LAYOUT.withName("largeTestStruct1"), LargeTestStruct4.LAYOUT.withName("largeTestStruct4")).withByteAlignment(8);
    public static final MemoryLayout.PathElement largeTestStruct1 = MemoryLayout.PathElement.groupElement("largeTestStruct1");
    public static final MemoryLayout.PathElement largeTestStruct4 = MemoryLayout.PathElement.groupElement("largeTestStruct4");

    public static MemorySegment largeTestStruct1Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(largeTestStruct1),  LargeTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment largeTestStruct4Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(largeTestStruct4),  LargeTestStruct4.LAYOUT.byteSize());

    }

}