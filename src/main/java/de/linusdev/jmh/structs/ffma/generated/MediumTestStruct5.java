package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;
import java.lang.foreign.MemorySegment;

public class MediumTestStruct5 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(21, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withName("aFloat64Array"), MemoryLayout.paddingLayout(3), MediumTestStruct3.LAYOUT.withName("aMediumTestStruct3"), SmallTestStruct2.LAYOUT.withName("aSmallTestStruct2"), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aPointer64"), MemoryLayout.sequenceLayout(5, SmallTestStruct7.LAYOUT).withName("aStructArray")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aFloat64Array = MemoryLayout.PathElement.groupElement("aFloat64Array");
    public static final VarHandle aFloat64ArrayHandle = LAYOUT.varHandle(aFloat64Array, MemoryLayout.PathElement.sequenceElement());
    public static final MemoryLayout.PathElement aMediumTestStruct3 = MemoryLayout.PathElement.groupElement("aMediumTestStruct3");
    public static final MemoryLayout.PathElement aSmallTestStruct2 = MemoryLayout.PathElement.groupElement("aSmallTestStruct2");
    public static final MemoryLayout.PathElement aPointer64 = MemoryLayout.PathElement.groupElement("aPointer64");
    public static final VarHandle aPointer64Handle = LAYOUT.varHandle(aPointer64);
    public static final MemoryLayout.PathElement aStructArray = MemoryLayout.PathElement.groupElement("aStructArray");

    public static MemorySegment aMediumTestStruct3Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aMediumTestStruct3),  MediumTestStruct3.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct2Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct2),  SmallTestStruct2.LAYOUT.byteSize());

    }

    public static MemorySegment aStructArrayAccessor(MemorySegment struct, int index) {
        return struct.asSlice(LAYOUT.byteOffset(aStructArray, MemoryLayout.PathElement.sequenceElement(index)),  SmallTestStruct7.LAYOUT.byteSize());

    }

}