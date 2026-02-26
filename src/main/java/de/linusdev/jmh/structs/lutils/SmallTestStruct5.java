package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.longn.BBLong3;
import de.linusdev.lutils.math.vector.buffer.shortn.BBShort1;
import de.linusdev.lutils.math.vector.buffer.shortn.BBUShort1;
import de.linusdev.lutils.nat.pointer.BBPointer32;
import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct5 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBPointer64 aPointer64 = BBPointer64.newUnallocated();
    public final @StructValue(1) @NotNull BBShort1 aShort1 = BBShort1.newUnallocated();
    public final @StructValue(2) @NotNull BBLong3 aLong3 = BBLong3.newUnallocated();

    public SmallTestStruct5() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct5()).getRequiredSize());
    }
}
