package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class LargeTestStruct3 extends Structure {

    public MediumTestStruct1[] mediumTestStruct1Array = (MediumTestStruct1[]) new MediumTestStruct1().toArray(1200);
    public MediumTestStruct5[] mediumTestStruct5Array = (MediumTestStruct5[]) new MediumTestStruct5().toArray(1200);
    public SmallTestStruct8[] smallTestStruct8Array = (SmallTestStruct8[]) new SmallTestStruct8().toArray(1200);
    public SmallTestStruct10[] smallTestStruct10Array = (SmallTestStruct10[]) new SmallTestStruct10().toArray(1200);

    @Override
    protected List<String> getFieldOrder() {
        return List.of("mediumTestStruct1Array", "mediumTestStruct5Array", "smallTestStruct8Array", "smallTestStruct10Array");

    }

    public LargeTestStruct3() {
        super();

    }

    public LargeTestStruct3(Pointer p) {
        super(p);
        read();

    }

}