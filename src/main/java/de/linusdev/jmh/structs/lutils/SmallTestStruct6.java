package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.longn.BBLong3;
import de.linusdev.lutils.math.vector.buffer.shortn.BBShort1;
import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct6 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBPointer64 aPointer = BBPointer64.newUnallocated();
    public final @StructValue(1) @NotNull BBByte1 aByte1 = BBByte1.newUnallocated();
    public final @StructValue(2) @NotNull BBPointer64 aSecondPointer = BBPointer64.newUnallocated();

    public SmallTestStruct6() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct6()).getRequiredSize());
    }
}
