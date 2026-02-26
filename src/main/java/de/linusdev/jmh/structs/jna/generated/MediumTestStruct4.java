package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class MediumTestStruct4 extends Structure {

    public MediumTestStruct1 aMediumTestStruct1;
    public MediumTestStruct2 aMediumTestStruct2;
    public double[] aFloat64Array = new double[13];
    public byte aByte;
    public SmallTestStruct6 aSmallTestStruct6;
    public short aShort;
    public SmallTestStruct7 aSmallTestStruct7;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aMediumTestStruct1", "aMediumTestStruct2", "aFloat64Array", "aByte", "aSmallTestStruct6", "aShort", "aSmallTestStruct7");

    }

    public MediumTestStruct4() {
        super();

    }

    public MediumTestStruct4(Pointer p) {
        super(p);
        read();

    }

}