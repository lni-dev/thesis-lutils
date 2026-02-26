package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;

public class LargeTestStruct3 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(1200, MediumTestStruct1.LAYOUT).withName("mediumTestStruct1Array"), MemoryLayout.sequenceLayout(1200, MediumTestStruct5.LAYOUT).withName("mediumTestStruct5Array"), MemoryLayout.sequenceLayout(1200, SmallTestStruct8.LAYOUT).withName("smallTestStruct8Array"), MemoryLayout.sequenceLayout(1200, SmallTestStruct10.LAYOUT).withName("smallTestStruct10Array")).withByteAlignment(8);
    public static final MemoryLayout.PathElement mediumTestStruct1Array = MemoryLayout.PathElement.groupElement("mediumTestStruct1Array");
    public static final MemoryLayout.PathElement mediumTestStruct5Array = MemoryLayout.PathElement.groupElement("mediumTestStruct5Array");
    public static final MemoryLayout.PathElement smallTestStruct8Array = MemoryLayout.PathElement.groupElement("smallTestStruct8Array");
    public static final MemoryLayout.PathElement smallTestStruct10Array = MemoryLayout.PathElement.groupElement("smallTestStruct10Array");

    public static MemorySegment mediumTestStruct1ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct1Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment mediumTestStruct5ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct5Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct5.LAYOUT.byteSize());

    }

    public static MemorySegment smallTestStruct8ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(smallTestStruct8Array, MemoryLayout.PathElement.sequenceElement(index)),  SmallTestStruct8.LAYOUT.byteSize());

    }

    public static MemorySegment smallTestStruct10ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(smallTestStruct10Array, MemoryLayout.PathElement.sequenceElement(index)),  SmallTestStruct10.LAYOUT.byteSize());

    }

}