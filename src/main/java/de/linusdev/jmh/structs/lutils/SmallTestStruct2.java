package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.byten.BBByte1;
import de.linusdev.lutils.math.vector.buffer.floatn.BBFloat1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt1;
import de.linusdev.lutils.math.vector.buffer.intn.BBInt4;
import de.linusdev.lutils.math.vector.buffer.longn.BBLong1;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct2 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBInt1 aInt = BBInt1.newUnallocated();
    public final @StructValue(1) @NotNull BBByte1 aByte = BBByte1.newUnallocated();
    public final @StructValue(2) @NotNull BBLong1 aLong = BBLong1.newUnallocated();

    public SmallTestStruct2() {
        super(false);
    }
}

