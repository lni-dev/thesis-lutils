package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt1;
import de.linusdev.lutils.math.vector.buffer.shortn.BBShort1;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct9 extends ComplexStructure {

    public final @StructValue(0) @NotNull SmallTestStruct8 aSmallTestStruct8 = new SmallTestStruct8();
    public final @StructValue(1) @NotNull BBInt1 aSmallInt = BBInt1.newUnallocated();
    public final @StructValue(2) @NotNull BBInt1 aSecondSmallInt = BBInt1.newUnallocated();


    public SmallTestStruct9() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct9()).getRequiredSize());
    }
}
