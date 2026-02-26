package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct10 extends ComplexStructure {

    public final @StructValue(0) @NotNull SmallTestStruct3 aSmallTestStruct3 = new SmallTestStruct3();
    public final @StructValue(1) @NotNull SmallTestStruct7 aSmallTestStruct7 = new SmallTestStruct7();


    public SmallTestStruct10() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct10()).getRequiredSize());
    }
}
