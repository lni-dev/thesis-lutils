package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct4 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBPointer64 aPointer = BBPointer64.newUnallocated();
    public final @StructValue(1) @NotNull SmallTestStruct1 aSmallTestStruct1 = new SmallTestStruct1();

    public SmallTestStruct4() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct4()).getRequiredSize());
    }
}
