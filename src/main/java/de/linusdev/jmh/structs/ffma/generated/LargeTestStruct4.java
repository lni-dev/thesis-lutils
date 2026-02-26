package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;

public class LargeTestStruct4 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(400, MediumTestStruct1.LAYOUT).withName("mediumTestStruct1Array"), MemoryLayout.sequenceLayout(500, MediumTestStruct2.LAYOUT).withName("mediumTestStruct2Array"), MemoryLayout.sequenceLayout(600, MediumTestStruct3.LAYOUT).withName("mediumTestStruct3Array"), MemoryLayout.sequenceLayout(300, MediumTestStruct4.LAYOUT).withName("mediumTestStruct4Array"), MemoryLayout.sequenceLayout(700, MediumTestStruct5.LAYOUT).withName("mediumTestStruct5Array")).withByteAlignment(8);
    public static final MemoryLayout.PathElement mediumTestStruct1Array = MemoryLayout.PathElement.groupElement("mediumTestStruct1Array");
    public static final MemoryLayout.PathElement mediumTestStruct2Array = MemoryLayout.PathElement.groupElement("mediumTestStruct2Array");
    public static final MemoryLayout.PathElement mediumTestStruct3Array = MemoryLayout.PathElement.groupElement("mediumTestStruct3Array");
    public static final MemoryLayout.PathElement mediumTestStruct4Array = MemoryLayout.PathElement.groupElement("mediumTestStruct4Array");
    public static final MemoryLayout.PathElement mediumTestStruct5Array = MemoryLayout.PathElement.groupElement("mediumTestStruct5Array");

    public static MemorySegment mediumTestStruct1ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct1Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment mediumTestStruct2ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct2Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct2.LAYOUT.byteSize());

    }

    public static MemorySegment mediumTestStruct3ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct3Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct3.LAYOUT.byteSize());

    }

    public static MemorySegment mediumTestStruct4ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct4Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct4.LAYOUT.byteSize());

    }

    public static MemorySegment mediumTestStruct5ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct5Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct5.LAYOUT.byteSize());

    }

}