package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct9 extends Structure {

    public SmallTestStruct8 aSmallTestStruct8;
    public int aSmallInt;
    public int aSecondSmallInt;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aSmallTestStruct8", "aSmallInt", "aSecondSmallInt");

    }

    public SmallTestStruct9() {
        super();

    }

    public SmallTestStruct9(Pointer p) {
        super(p);
        read();

    }

}