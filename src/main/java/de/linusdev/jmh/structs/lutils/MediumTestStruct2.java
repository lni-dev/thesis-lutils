package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.doublen.BBDouble1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt4;
import de.linusdev.lutils.math.vector.buffer.longn.BBLong1;
import de.linusdev.lutils.math.vector.buffer.shortn.BBShort1;
import de.linusdev.lutils.nat.array.NativeInt8Array;
import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import de.linusdev.lutils.nat.struct.array.StructureArray;
import org.jetbrains.annotations.NotNull;

public class MediumTestStruct2 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBLong1 aLong = BBLong1.newUnallocated();
    public final @StructValue(1) @NotNull BBByte1 aByte = BBByte1.newUnallocated();
    public final @StructValue(2) @NotNull BBDouble1 aSecondLong = BBDouble1.newUnallocated();
    public final @StructValue(value = 3, length = 20) @NotNull NativeInt8Array aByteArray = NativeInt8Array.newUnallocated();
    public final @StructValue(4) @NotNull SmallTestStruct1 aSubStruct = new SmallTestStruct1();
    public final @StructValue(5) @NotNull BBLong1 aThirdLong = BBLong1.newUnallocated();
    public final @StructValue(6) @NotNull BBInt4 aInt4 = BBInt4.newUnallocated();
    public final @StructValue(7) @NotNull BBShort1 aShort = BBShort1.newUnallocated();
    public final @StructValue(8) @NotNull SmallTestStruct3 aSecondSubStruct = new SmallTestStruct3();
    public final @StructValue(9) @NotNull BBPointer64 aPointer = BBPointer64.newUnallocated();

    public MediumTestStruct2() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new MediumTestStruct2()).getRequiredSize());
    }
}
