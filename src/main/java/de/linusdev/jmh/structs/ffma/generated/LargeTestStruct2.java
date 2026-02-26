package de.linusdev.jmh.structs.ffma.generated;

import java.lang.foreign.StructLayout;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.ValueLayout;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.VarHandle;

public class LargeTestStruct2 {

    public static final StructLayout LAYOUT = MemoryLayout.structLayout(MemoryLayout.sequenceLayout(500000, ValueLayout.JAVA_BYTE.withByteAlignment(1)).withName("nativeInt8Array")).withByteAlignment(1);
    public static final MemoryLayout.PathElement nativeInt8Array = MemoryLayout.PathElement.groupElement("nativeInt8Array");
    public static final VarHandle nativeInt8ArrayHandle = LAYOUT.varHandle(nativeInt8Array, MemoryLayout.PathElement.sequenceElement());

}