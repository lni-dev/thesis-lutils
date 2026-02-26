package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.array.NativeInt32Array;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import de.linusdev.lutils.nat.struct.array.StructureArray;
import org.jetbrains.annotations.NotNull;

public class LargeTestStruct1 extends ComplexStructure {

    @StructValue(value = 0, length = 600, elementType = MediumTestStruct1.class)
    public final @NotNull StructureArray<MediumTestStruct1> mediumTestStruct1Array = StructureArray.newUnallocated(false, MediumTestStruct1::new);

    @StructValue(value = 1, length = 1200, elementType = SmallTestStruct3.class)
    public final @NotNull StructureArray<SmallTestStruct3> smallTestStruct3Array = StructureArray.newUnallocated(false, SmallTestStruct3::new);

    @StructValue(value = 2, length = 100000)
    public final @NotNull NativeInt32Array intArray = NativeInt32Array.newUnallocated();

    public LargeTestStruct1() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new LargeTestStruct1()).getRequiredSize());
    }
}
