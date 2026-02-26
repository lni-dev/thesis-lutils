package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct5 extends Structure {

    public long aPointer64;
    public short aShort1;
    public long[] aLong3 = new long[3];

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aPointer64", "aShort1", "aLong3");

    }

    public SmallTestStruct5() {
        super();

    }

    public SmallTestStruct5(Pointer p) {
        super(p);
        read();

    }

}