package de.linusdev.jmh;

import com.sun.jna.Pointer;
import de.linusdev.lutils.nat.struct.abstracts.Structure;
import org.jetbrains.annotations.NotNull;
import org.lwjgl.system.MemoryUtil;

import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;
import java.util.Objects;

public class Helper {

    public static void mustBeEquals(Object a, Object b) {
        if(!Objects.equals(a, b))
            throw new Error("Not equals! (" + a + " != " + b +")");
    }

    public static void mustBeEqualStructContent(
            MemorySegment ffmaStruct,  // FFMA
            com.sun.jna.Structure jnaStruct, // JNA
            Structure lutilsStruct, // Lutils
            org.lwjgl.system.Struct<?> lwjglStruct // LWJGL
    ) {
        jnaStruct.write(); // make sure the jna struct is written to the pointer

        long expectedSize = lutilsStruct.getRequiredSize();
        String name = lutilsStruct.getClass().getSimpleName();

        checkSize(expectedSize, ffmaStruct.byteSize(), name, "ffma");
        checkSize(expectedSize, jnaStruct.size(), name, "jna");
        checkSize(expectedSize, lwjglStruct.sizeof(), name, "lwjgl");

        checkContent(lutilsStruct.getByteBuffer(), ffmaStruct.address());
        checkContent(lutilsStruct.getByteBuffer(), Pointer.nativeValue(jnaStruct.getPointer()));
        checkContent(lutilsStruct.getByteBuffer(), lutilsStruct.getPointer());
    }

    private static void checkContent(@NotNull ByteBuffer expected, long pointerActual) {
        ByteBuffer actual = MemoryUtil.memByteBuffer(pointerActual, expected.capacity());

        for (int i = 0; i < expected.capacity(); i++) {
            if(expected.get(i) != actual.get(i))
                throw new Error("Content does not match at byte " + i);
        }
    }

    private static void checkSize(long expected, long actual, String structName, String libName) {
        if(actual != expected)
            throw new Error("struct '" + structName + "' in lib " + libName + " has a wrong size (" + actual +" bytes). Should be " + expected + " bytes");
    }

}
