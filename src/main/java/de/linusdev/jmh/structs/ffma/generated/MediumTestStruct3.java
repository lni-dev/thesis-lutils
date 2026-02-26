package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;

public class MediumTestStruct3 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(SmallTestStruct1.LAYOUT.withName("aSmallTestStruct1"), SmallTestStruct2.LAYOUT.withName("aSmallTestStruct2"), SmallTestStruct3.LAYOUT.withName("aSmallTestStruct3"), SmallTestStruct4.LAYOUT.withName("aSmallTestStruct4"), SmallTestStruct5.LAYOUT.withName("aSmallTestStruct5"), SmallTestStruct6.LAYOUT.withName("aSmallTestStruct6"), SmallTestStruct7.LAYOUT.withName("aSmallTestStruct7"), SmallTestStruct8.LAYOUT.withName("aSmallTestStruct8"), SmallTestStruct9.LAYOUT.withName("aSmallTestStruct9"), SmallTestStruct10.LAYOUT.withName("aSmallTestStruct10")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aSmallTestStruct1 = MemoryLayout.PathElement.groupElement("aSmallTestStruct1");
    public static final MemoryLayout.PathElement aSmallTestStruct2 = MemoryLayout.PathElement.groupElement("aSmallTestStruct2");
    public static final MemoryLayout.PathElement aSmallTestStruct3 = MemoryLayout.PathElement.groupElement("aSmallTestStruct3");
    public static final MemoryLayout.PathElement aSmallTestStruct4 = MemoryLayout.PathElement.groupElement("aSmallTestStruct4");
    public static final MemoryLayout.PathElement aSmallTestStruct5 = MemoryLayout.PathElement.groupElement("aSmallTestStruct5");
    public static final MemoryLayout.PathElement aSmallTestStruct6 = MemoryLayout.PathElement.groupElement("aSmallTestStruct6");
    public static final MemoryLayout.PathElement aSmallTestStruct7 = MemoryLayout.PathElement.groupElement("aSmallTestStruct7");
    public static final MemoryLayout.PathElement aSmallTestStruct8 = MemoryLayout.PathElement.groupElement("aSmallTestStruct8");
    public static final MemoryLayout.PathElement aSmallTestStruct9 = MemoryLayout.PathElement.groupElement("aSmallTestStruct9");
    public static final MemoryLayout.PathElement aSmallTestStruct10 = MemoryLayout.PathElement.groupElement("aSmallTestStruct10");

    public static MemorySegment aSmallTestStruct1Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct1),  SmallTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct2Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct2),  SmallTestStruct2.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct3Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct3),  SmallTestStruct3.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct4Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct4),  SmallTestStruct4.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct5Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct5),  SmallTestStruct5.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct6Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct6),  SmallTestStruct6.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct7Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct7),  SmallTestStruct7.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct8Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct8),  SmallTestStruct8.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct9Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct9),  SmallTestStruct9.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct10Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct10),  SmallTestStruct10.LAYOUT.byteSize());

    }

}