package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt1;
import de.linusdev.lutils.math.vector.buffer.shortn.BBShort1;
import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct8 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBByte1 AByte = BBByte1.newUnallocated();
    public final @StructValue(1) @NotNull BBShort1 aShort = BBShort1.newUnallocated();
    public final @StructValue(2) @NotNull BBInt1 aInt = BBInt1.newUnallocated();


    public SmallTestStruct8() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct8()).getRequiredSize());
    }
}
