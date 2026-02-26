package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.array.NativeInt8Array;
import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import de.linusdev.lutils.nat.struct.array.StructureArray;
import org.jetbrains.annotations.NotNull;

public class MediumTestStruct5 extends ComplexStructure {

    public final @StructValue(value = 0, length = 21) @NotNull NativeInt8Array aFloat64Array = NativeInt8Array.newUnallocated();
    public final @StructValue(1) @NotNull MediumTestStruct3 aMediumTestStruct3 = new MediumTestStruct3();
    public final @StructValue(2) @NotNull SmallTestStruct2 aSmallTestStruct2 = new SmallTestStruct2();
    public final @StructValue(3) BBPointer64 aPointer64 = BBPointer64.newUnallocated();
    public final @StructValue(value = 4, length = 5, elementType = SmallTestStruct7.class) @NotNull
    StructureArray<SmallTestStruct7> aStructArray = StructureArray.newUnallocated(false, SmallTestStruct7::new);


    public MediumTestStruct5() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new MediumTestStruct5()).getRequiredSize());
    }
}
