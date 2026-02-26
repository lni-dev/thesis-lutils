package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.shortn.BBShort1;
import de.linusdev.lutils.nat.array.NativeFloat64Array;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class MediumTestStruct4 extends ComplexStructure {

    public final @StructValue(0) @NotNull MediumTestStruct1 aMediumTestStruct1 = new MediumTestStruct1();
    public final @StructValue(1) @NotNull MediumTestStruct2 aMediumTestStruct2 = new MediumTestStruct2();
    public final @StructValue(value = 2, length = 13) @NotNull NativeFloat64Array aFloat64Array = NativeFloat64Array.newUnallocated();
    public final @StructValue(3) BBByte1 aByte = BBByte1.newUnallocated();
    public final @StructValue(4) @NotNull SmallTestStruct6 aSmallTestStruct6 = new SmallTestStruct6();
    public final @StructValue(5) BBShort1 aShort = BBShort1.newUnallocated();
    public final @StructValue(6) @NotNull SmallTestStruct7 aSmallTestStruct7 = new SmallTestStruct7();


    public MediumTestStruct4() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new MediumTestStruct4()).getRequiredSize());
    }
}
