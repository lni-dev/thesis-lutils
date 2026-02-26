package de.linusdev.jmh.structs.lutils;

import de.linusdev.lutils.math.vector.buffer.longn.BBLong1;
import de.linusdev.lutils.nat.struct.abstracts.ComplexStructure;
import de.linusdev.lutils.nat.struct.annos.StructValue;
import org.jetbrains.annotations.NotNull;

public class SmallTestStruct3 extends ComplexStructure {

    public final @StructValue(0) @NotNull BBLong1 aLong = BBLong1.newUnallocated();
    public final @StructValue(1) @NotNull BBLong1 aSecondLong = BBLong1.newUnallocated();
    public final @StructValue(2) @NotNull BBLong1 aThirdLong = BBLong1.newUnallocated();

    public SmallTestStruct3() {
        super(false);
    }
}
