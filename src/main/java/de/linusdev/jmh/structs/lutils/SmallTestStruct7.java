package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt1;
import de.linusdev.lutils.nat.pointer.BBPointer64;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct7 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBInt1 aInt = BBInt1.newUnallocated();
    public final @StructValue(1) @NotNull BBPointer64 aPointer = BBPointer64.newUnallocated();
    public final @StructValue(2) @NotNull BBInt1 aSecondInt = BBInt1.newUnallocated();
    public final @StructValue(3) @NotNull BBInt1 aThirdInt = BBInt1.newUnallocated();


    public SmallTestStruct7() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct7()).getRequiredSize());
    }
}
