package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class LargeTestStruct1 extends Structure {

    public MediumTestStruct1[] mediumTestStruct1Array = (MediumTestStruct1[]) new MediumTestStruct1().toArray(600);
    public SmallTestStruct3[] smallTestStruct3Array = (SmallTestStruct3[]) new SmallTestStruct3().toArray(1200);
    public int[] intArray = new int[100000];

    @Override
    protected List<String> getFieldOrder() {
        return List.of("mediumTestStruct1Array", "smallTestStruct3Array", "intArray");

    }

    public LargeTestStruct1() {
        super();

    }

    public LargeTestStruct1(Pointer p) {
        super(p);
        read();

    }

}