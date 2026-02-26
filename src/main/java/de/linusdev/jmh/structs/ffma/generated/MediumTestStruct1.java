package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;
import java.lang.foreign.MemorySegment;

public class MediumTestStruct1 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aLong"), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aSecondLong"), ValueLayout.JAVA_LONG.withByteAlignment(1).withName("aThirdLong"), MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT.withByteAlignment(1)).withName("aInt4"), ValueLayout.JAVA_SHORT.withByteAlignment(1).withName("aShort"), MemoryLayout.paddingLayout(2), SmallTestStruct1.LAYOUT.withName("aSubStruct"), MemoryLayout.paddingLayout(4), SmallTestStruct2.LAYOUT.withName("aSecondSubStruct"), MemoryLayout.sequenceLayout(20, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withName("aByteArray"), MemoryLayout.paddingLayout(4)).withByteAlignment(8);
    public static final MemoryLayout.PathElement aLong = MemoryLayout.PathElement.groupElement("aLong");
    public static final VarHandle aLongHandle = LAYOUT.varHandle(aLong);
    public static final MemoryLayout.PathElement aSecondLong = MemoryLayout.PathElement.groupElement("aSecondLong");
    public static final VarHandle aSecondLongHandle = LAYOUT.varHandle(aSecondLong);
    public static final MemoryLayout.PathElement aThirdLong = MemoryLayout.PathElement.groupElement("aThirdLong");
    public static final VarHandle aThirdLongHandle = LAYOUT.varHandle(aThirdLong);
    public static final MemoryLayout.PathElement aInt4 = MemoryLayout.PathElement.groupElement("aInt4");
    public static final VarHandle aInt4Handle = LAYOUT.varHandle(aInt4, MemoryLayout.PathElement.sequenceElement());
    public static final MemoryLayout.PathElement aShort = MemoryLayout.PathElement.groupElement("aShort");
    public static final VarHandle aShortHandle = LAYOUT.varHandle(aShort);
    public static final MemoryLayout.PathElement aSubStruct = MemoryLayout.PathElement.groupElement("aSubStruct");
    public static final MemoryLayout.PathElement aSecondSubStruct = MemoryLayout.PathElement.groupElement("aSecondSubStruct");
    public static final MemoryLayout.PathElement aByteArray = MemoryLayout.PathElement.groupElement("aByteArray");
    public static final VarHandle aByteArrayHandle = LAYOUT.varHandle(aByteArray, MemoryLayout.PathElement.sequenceElement());

    public static MemorySegment aSubStructAccessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSubStruct),  SmallTestStruct1.LAYOUT.byteSize());

    }

    public static MemorySegment aSecondSubStructAccessor(MemorySegment struct) {
        return struct.asSlice(LAYOUT.byteOffset(aSecondSubStruct),  SmallTestStruct2.LAYOUT.byteSize());

    }

}