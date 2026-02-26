package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class SmallTestStruct1 extends Structure {

    public int aInt;
    public float aFloat;
    public int[] aIntVec4 = new int[4];

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aInt", "aFloat", "aIntVec4");

    }

    public SmallTestStruct1() {
        super();

    }

    public SmallTestStruct1(Pointer p) {
        super(p);
        read();

    }

}