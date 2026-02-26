package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct7 extends Structure {

    public int aInt;
    public long aPointer;
    public int aSecondInt;
    public int aThirdInt;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aInt", "aPointer", "aSecondInt", "aThirdInt");

    }

    public SmallTestStruct7() {
        super();

    }

    public SmallTestStruct7(Pointer p) {
        super(p);
        read();

    }

}