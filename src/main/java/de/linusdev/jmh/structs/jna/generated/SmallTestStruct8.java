package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct8 extends Structure {

    public byte AByte;
    public short aShort;
    public int aInt;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("AByte", "aShort", "aInt");

    }

    public SmallTestStruct8() {
        super();

    }

    public SmallTestStruct8(Pointer p) {
        super(p);
        read();

    }

}