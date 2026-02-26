package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class MediumTestStruct3 extends ComplexStructure {

    public final @StructValue(0) @NotNull SmallTestStruct1 aSmallTestStruct1 = new SmallTestStruct1();
    public final @StructValue(1) @NotNull SmallTestStruct2 aSmallTestStruct2 = new SmallTestStruct2();
    public final @StructValue(2) @NotNull SmallTestStruct3 aSmallTestStruct3 = new SmallTestStruct3();
    public final @StructValue(3) @NotNull SmallTestStruct4 aSmallTestStruct4 = new SmallTestStruct4();
    public final @StructValue(4) @NotNull SmallTestStruct5 aSmallTestStruct5 = new SmallTestStruct5();
    public final @StructValue(5) @NotNull SmallTestStruct6 aSmallTestStruct6 = new SmallTestStruct6();
    public final @StructValue(6) @NotNull SmallTestStruct7 aSmallTestStruct7 = new SmallTestStruct7();
    public final @StructValue(7) @NotNull SmallTestStruct8 aSmallTestStruct8 = new SmallTestStruct8();
    public final @StructValue(8) @NotNull SmallTestStruct9 aSmallTestStruct9 = new SmallTestStruct9();
    public final @StructValue(9) @NotNull SmallTestStruct10 aSmallTestStruct10 = new SmallTestStruct10();

    public MediumTestStruct3() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new MediumTestStruct3()).getRequiredSize());
    }
}
