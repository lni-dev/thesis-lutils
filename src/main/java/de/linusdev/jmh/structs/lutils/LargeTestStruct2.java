package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.array.NativeInt8Array;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class LargeTestStruct2 extends ComplexStructure {

    @StructValue(value = 0, length = 500_000)
    public final @NotNull NativeInt8Array nativeInt8Array = NativeInt8Array.newUnallocated();

    public LargeTestStruct2() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new LargeTestStruct2()).getRequiredSize());
    }
}
