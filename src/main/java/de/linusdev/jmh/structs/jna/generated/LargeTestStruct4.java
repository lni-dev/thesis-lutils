package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class LargeTestStruct4 extends Structure {

    public MediumTestStruct1[] mediumTestStruct1Array = (MediumTestStruct1[]) new MediumTestStruct1().toArray(400);
    public MediumTestStruct2[] mediumTestStruct2Array = (MediumTestStruct2[]) new MediumTestStruct2().toArray(500);
    public MediumTestStruct3[] mediumTestStruct3Array = (MediumTestStruct3[]) new MediumTestStruct3().toArray(600);
    public MediumTestStruct4[] mediumTestStruct4Array = (MediumTestStruct4[]) new MediumTestStruct4().toArray(300);
    public MediumTestStruct5[] mediumTestStruct5Array = (MediumTestStruct5[]) new MediumTestStruct5().toArray(700);

    @Override
    protected List<String> getFieldOrder() {
        return List.of("mediumTestStruct1Array", "mediumTestStruct2Array", "mediumTestStruct3Array", "mediumTestStruct4Array", "mediumTestStruct5Array");

    }

    public LargeTestStruct4() {
        super();

    }

    public LargeTestStruct4(Pointer p) {
        super(p);
        read();

    }

}