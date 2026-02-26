package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.floatn.BBFloat1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt4;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct1 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBInt1 aInt = BBInt1.newUnallocated();
    public final @StructValue(1) @NotNull BBFloat1 aFloat = BBFloat1.newUnallocated();
    public final @StructValue(2) @NotNull BBInt4 aIntVec4 = BBInt4.newUnallocated();

    public SmallTestStruct1() {
        super(false);
    }

    public static void main(String[] args) {
        System.out.println(allocate(new SmallTestStruct1()).getRequiredSize());
    }
}
