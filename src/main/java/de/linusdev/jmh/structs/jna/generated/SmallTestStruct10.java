package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct10 extends Structure {

    public SmallTestStruct3 aSmallTestStruct3;
    public SmallTestStruct7 aSmallTestStruct7;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aSmallTestStruct3", "aSmallTestStruct7");

    }

    public SmallTestStruct10() {
        super();

    }

    public SmallTestStruct10(Pointer p) {
        super(p);
        read();

    }

}