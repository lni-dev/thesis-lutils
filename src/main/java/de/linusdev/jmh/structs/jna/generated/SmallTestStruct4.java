package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct4 extends Structure {

    public long aPointer;
    public SmallTestStruct1 aSmallTestStruct1;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aPointer", "aSmallTestStruct1");

    }

    public SmallTestStruct4() {
        super();

    }

    public SmallTestStruct4(Pointer p) {
        super(p);
        read();

    }

}