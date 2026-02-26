package de.linusdev.jmh.structs.jna.generated;

import com.sun.jna.Structure;
import java.util.List;
import java.lang.String;
import java.lang.Override;
import com.sun.jna.Pointer;

public class MediumTestStruct1 extends Structure {

    public long aLong;
    public long aSecondLong;
    public long aThirdLong;
    public int[] aInt4 = new int[4];
    public short aShort;
    public SmallTestStruct1 aSubStruct;
    public SmallTestStruct2 aSecondSubStruct;
    public byte[] aByteArray = new byte[20];

    @Override
    protected List<String> getFieldOrder() {
        return List.of("aLong", "aSecondLong", "aThirdLong", "aInt4", "aShort", "aSubStruct", "aSecondSubStruct", "aByteArray");

    }

    public MediumTestStruct1() {
        super();

    }

    public MediumTestStruct1(Pointer p) {
        super(p);
        read();

    }

}