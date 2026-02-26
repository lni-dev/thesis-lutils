package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class LargeTestStruct2 extends Structure {

    public byte[] nativeInt8Array = new byte[500000];

    @Override
    protected List<String> getFieldOrder() {
        return List.of("nativeInt8Array");

    }

    public LargeTestStruct2() {
        super();

    }

    public LargeTestStruct2(Pointer p) {
        super(p);
        read();

    }

}