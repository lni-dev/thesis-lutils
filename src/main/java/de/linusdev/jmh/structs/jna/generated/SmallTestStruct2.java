package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct2 extends Structure {

    public int aInt;
    public byte aByte;
    public long aLong;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aInt", "aByte", "aLong");

    }

    public SmallTestStruct2() {
        super();

    }

    public SmallTestStruct2(Pointer p) {
        super(p);
        read();

    }

}