package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct6 extends Structure {

    public long aPointer;
    public byte aByte1;
    public long aSecondPointer;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aPointer", "aByte1", "aSecondPointer");

    }

    public SmallTestStruct6() {
        super();

    }

    public SmallTestStruct6(Pointer p) {
        super(p);
        read();

    }

}