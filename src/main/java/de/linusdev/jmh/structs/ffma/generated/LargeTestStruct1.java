package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.VarHandle;

public class LargeTestStruct1 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(600, MediumTestStruct1.LAYOUT).withName("mediumTestStruct1Array"), MemoryLayout.sequenceLayout(1200, SmallTestStruct3.LAYOUT).withName("smallTestStruct3Array"), MemoryLayout.sequenceLayout(100000, ValueLayout.JAVA_INT.withByteAlignment(1)).withName("intArray")).withByteAlignment(8);
    public static final MemoryLayout.PathElement mediumTestStruct1Array = MemoryLayout.PathElement.groupElement("mediumTestStruct1Array");
    public static final MemoryLayout.PathElement smallTestStruct3Array = MemoryLayout.PathElement.groupElement("smallTestStruct3Array");
    public static final MemoryLayout.PathElement intArray = MemoryLayout.PathElement.groupElement("intArray");
    public static final VarHandle intArrayHandle = LAYOUT.varHandle(intArray, MemoryLayout.PathElement.sequenceElement());

    public static MemorySegment mediumTestStruct1ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(mediumTestStruct1Array, MemoryLayout.PathElement.sequenceElement(index)),  MediumTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment smallTestStruct3ArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(smallTestStruct3Array, MemoryLayout.PathElement.sequenceElement(index)),  SmallTestStruct3.LAYOUT.byteSize());

    }

}