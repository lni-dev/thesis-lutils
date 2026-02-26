package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class MediumTestStruct5 extends Structure {

    public byte[] aFloat64Array = new byte[21];
    public MediumTestStruct3 aMediumTestStruct3;
    public SmallTestStruct2 aSmallTestStruct2;
    public long aPointer64;
    public SmallTestStruct7[] aStructArray = (SmallTestStruct7[]) new SmallTestStruct7().toArray(5);

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aFloat64Array", "aMediumTestStruct3", "aSmallTestStruct2", "aPointer64", "aStructArray");

    }

    public MediumTestStruct5() {
        super();

    }

    public MediumTestStruct5(Pointer p) {
        super(p);
        read();

    }

}