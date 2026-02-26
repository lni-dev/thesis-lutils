package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.VarHandle;

public class MediumTestStruct4 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(MediumTestStruct1.LAYOUT.withName("aMediumTestStruct1"), MediumTestStruct2.LAYOUT.withName("aMediumTestStruct2"), MemoryLayout.sequenceLayout(13, ValueLayout.JAVA_DOUBLE.withByteAlignment(1)).withName("aFloat64Array"), ValueLayout.JAVA_BYTE.withByteAlignment(1).withName("aByte"), MemoryLayout.paddingLayout(7), SmallTestStruct6.LAYOUT.withName("aSmallTestStruct6"), ValueLayout.JAVA_SHORT.withByteAlignment(1).withName("aShort"), MemoryLayout.paddingLayout(6), SmallTestStruct7.LAYOUT.withName("aSmallTestStruct7")).withByteAlignment(8);
    public static final MemoryLayout.PathElement aMediumTestStruct1 = MemoryLayout.PathElement.groupElement("aMediumTestStruct1");
    public static final MemoryLayout.PathElement aMediumTestStruct2 = MemoryLayout.PathElement.groupElement("aMediumTestStruct2");
    public static final MemoryLayout.PathElement aFloat64Array = MemoryLayout.PathElement.groupElement("aFloat64Array");
    public static final VarHandle aFloat64ArrayHandle = LAYOUT.varHandle(aFloat64Array, MemoryLayout.PathElement.sequenceElement());
    public static final MemoryLayout.PathElement aByte = MemoryLayout.PathElement.groupElement("aByte");
    public static final VarHandle aByteHandle = LAYOUT.varHandle(aByte);
    public static final MemoryLayout.PathElement aSmallTestStruct6 = MemoryLayout.PathElement.groupElement("aSmallTestStruct6");
    public static final MemoryLayout.PathElement aShort = MemoryLayout.PathElement.groupElement("aShort");
    public static final VarHandle aShortHandle = LAYOUT.varHandle(aShort);
    public static final MemoryLayout.PathElement aSmallTestStruct7 = MemoryLayout.PathElement.groupElement("aSmallTestStruct7");

    public static MemorySegment aMediumTestStruct1Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aMediumTestStruct1),  MediumTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment aMediumTestStruct2Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aMediumTestStruct2),  MediumTestStruct2.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct6Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct6),  SmallTestStruct6.LAYOUT.byteSize());

    }

    public static MemorySegment aSmallTestStruct7Accessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSmallTestStruct7),  SmallTestStruct7.LAYOUT.byteSize());

    }

}