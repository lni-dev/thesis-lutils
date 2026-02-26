package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class MediumTestStruct2 extends Structure {

    public long aLong;
    public byte aByte;
    public double aSecondLong;
    public byte[] aByteArray = new byte[20];
    public SmallTestStruct1 aSubStruct;
    public long aThirdLong;
    public int[] aInt4 = new int[4];
    public short aShort;
    public SmallTestStruct3 aSecondSubStruct;
    public long aPointer;

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aLong", "aByte", "aSecondLong", "aByteArray", "aSubStruct", "aThirdLong", "aInt4", "aShort", "aSecondSubStruct", "aPointer");

    }

    public MediumTestStruct2() {
        super();

    }

    public MediumTestStruct2(Pointer p) {
        super(p);
        read();

    }

}