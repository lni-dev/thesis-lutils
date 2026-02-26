package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class MediumTestStruct3 extends Structure {

    public SmallTestStruct1 aSmallTestStruct1;
    public SmallTestStruct2 aSmallTestStruct2;
    public SmallTestStruct3 aSmallTestStruct3;
    public SmallTestStruct4 aSmallTestStruct4;
    public SmallTestStruct5 aSmallTestStruct5;
    public SmallTestStruct6 aSmallTestStruct6;
    public SmallTestStruct7 aSmallTestStruct7;
    public SmallTestStruct8 aSmallTestStruct8;
    public SmallTestStruct9 aSmallTestStruct9;
    public SmallTestStruct10 aSmallTestStruct10;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aSmallTestStruct1", "aSmallTestStruct2", "aSmallTestStruct3", "aSmallTestStruct4", "aSmallTestStruct5", "aSmallTestStruct6", "aSmallTestStruct7", "aSmallTestStruct8", "aSmallTestStruct9", "aSmallTestStruct10");

    }

    public MediumTestStruct3() {
        super();

    }

    public MediumTestStruct3(Pointer p) {
        super(p);
        read();

    }

}