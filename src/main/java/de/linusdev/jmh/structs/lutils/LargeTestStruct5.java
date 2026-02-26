package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import de.linusdev.lutils.nat.struct.array.StructureArray;
import org.jetbrains.annotations.NotNull;

public class LargeTestStruct5 extends ComplexStructure {

    @StructValue(0)
    public final @NotNull LargeTestStruct1 largeTestStruct1 = new LargeTestStruct1();

    @StructValue(1)
    public final @NotNull LargeTestStruct4 largeTestStruct4 = new LargeTestStruct4();

    public LargeTestStruct5() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new LargeTestStruct5()).getRequiredSize());
    }
}
