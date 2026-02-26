package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.array.NativeInt32Array;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import de.linusdev.lutils.nat.struct.array.StructureArray;
import org.jetbrains.annotations.NotNull;

public class LargeTestStruct4 extends ComplexStructure {

    @StructValue(value = 0, length = 400, elementType = MediumTestStruct1.class)
    public final @NotNull StructureArray<MediumTestStruct1> mediumTestStruct1Array = StructureArray.newUnallocated(false, MediumTestStruct1::new);

    @StructValue(value = 1, length = 500, elementType = MediumTestStruct2.class)
    public final @NotNull StructureArray<MediumTestStruct2> mediumTestStruct2Array = StructureArray.newUnallocated(false, MediumTestStruct2::new);

    @StructValue(value = 2, length = 600, elementType = MediumTestStruct3.class)
    public final @NotNull StructureArray<MediumTestStruct3> mediumTestStruct3Array = StructureArray.newUnallocated(false, MediumTestStruct3::new);

    @StructValue(value = 3, length = 300, elementType = MediumTestStruct4.class)
    public final @NotNull StructureArray<MediumTestStruct4> mediumTestStruct4Array = StructureArray.newUnallocated(false, MediumTestStruct4::new);

    @StructValue(value = 4, length = 700, elementType = MediumTestStruct5.class)
    public final @NotNull StructureArray<MediumTestStruct5> mediumTestStruct5Array = StructureArray.newUnallocated(false, MediumTestStruct5::new);


    public LargeTestStruct4() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new LargeTestStruct4()).getRequiredSize());
    }
}
