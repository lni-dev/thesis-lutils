package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct3 extends Structure {

    public long aLong;
    public long aSecondLong;
    public long aThirdLong;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aLong", "aSecondLong", "aThirdLong");

    }

    public SmallTestStruct3() {
        super();

    }

    public SmallTestStruct3(Pointer p) {
        super(p);
        read();

    }

}