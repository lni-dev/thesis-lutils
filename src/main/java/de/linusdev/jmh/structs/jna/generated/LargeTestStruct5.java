package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class LargeTestStruct5 extends Structure {

    public LargeTestStruct1 largeTestStruct1;
    public LargeTestStruct4 largeTestStruct4;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("largeTestStruct1", "largeTestStruct4");

    }

    public LargeTestStruct5() {
        super();

    }

    public LargeTestStruct5(Pointer p) {
        super(p);
        read();

    }

}