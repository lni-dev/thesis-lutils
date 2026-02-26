package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.nat.array.NativeInt32Array;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import de.linusdev.lutils.nat.struct.array.StructureArray;
import org.jetbrains.annotations.NotNull;

public class LargeTestStruct3 extends ComplexStructure {

    @StructValue(value = 0, length = 1200, elementType = MediumTestStruct1.class)
    public final @NotNull StructureArray<MediumTestStruct1> mediumTestStruct1Array = StructureArray.newUnallocated(false, MediumTestStruct1::new);

    @StructValue(value = 1, length = 1200, elementType = MediumTestStruct5.class)
    public final @NotNull StructureArray<MediumTestStruct5> mediumTestStruct5Array = StructureArray.newUnallocated(false, MediumTestStruct5::new);

    @StructValue(value = 2, length = 1200, elementType = SmallTestStruct8.class)
    public final @NotNull StructureArray<SmallTestStruct8> smallTestStruct8Array = StructureArray.newUnallocated(false, SmallTestStruct8::new);

    @StructValue(value = 3, length = 1200, elementType = SmallTestStruct10.class)
    public final @NotNull StructureArray<SmallTestStruct10> smallTestStruct10Array = StructureArray.newUnallocated(false, SmallTestStruct10::new);


    public LargeTestStruct3() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new LargeTestStruct3()).getRequiredSize());
    }
}
