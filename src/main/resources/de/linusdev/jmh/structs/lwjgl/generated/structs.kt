val SmallTestStruct1 = struct(Module.ASSIMP, "SmallTestStruct1") {
    int32_t("aInt")
    float("aFloat")
    int32_t("aIntVec4")[4]
}

val SmallTestStruct2 = struct(Module.ASSIMP, "SmallTestStruct2") {
    int32_t("aInt")
    int8_t("aByte")
    int64_t("aLong")
}

val SmallTestStruct3 = struct(Module.ASSIMP, "SmallTestStruct3") {
    int64_t("aLong")
    int64_t("aSecondLong")
    int64_t("aThirdLong")
}

val SmallTestStruct4 = struct(Module.ASSIMP, "SmallTestStruct4") {
    int64_t("aPointer")
    SmallTestStruct1("aSmallTestStruct1")
}

val SmallTestStruct5 = struct(Module.ASSIMP, "SmallTestStruct5") {
    int64_t("aPointer64")
    int16_t("aShort1")
    int64_t("aLong3")[3]
}

val SmallTestStruct6 = struct(Module.ASSIMP, "SmallTestStruct6") {
    int64_t("aPointer")
    int8_t("aByte1")
    int64_t("aSecondPointer")
}

val SmallTestStruct7 = struct(Module.ASSIMP, "SmallTestStruct7") {
    int32_t("aInt")
    int64_t("aPointer")
    int32_t("aSecondInt")
    int32_t("aThirdInt")
}

val SmallTestStruct8 = struct(Module.ASSIMP, "SmallTestStruct8") {
    int8_t("AByte")
    int16_t("aShort")
    int32_t("aInt")
}

val SmallTestStruct9 = struct(Module.ASSIMP, "SmallTestStruct9") {
    SmallTestStruct8("aSmallTestStruct8")
    int32_t("aSmallInt")
    int32_t("aSecondSmallInt")
}

val SmallTestStruct10 = struct(Module.ASSIMP, "SmallTestStruct10") {
    SmallTestStruct3("aSmallTestStruct3")
    SmallTestStruct7("aSmallTestStruct7")
}

val MediumTestStruct1 = struct(Module.ASSIMP, "MediumTestStruct1") {
    int64_t("aLong")
    int64_t("aSecondLong")
    int64_t("aThirdLong")
    int32_t("aInt4")[4]
    int16_t("aShort")
    SmallTestStruct1("aSubStruct")
    SmallTestStruct2("aSecondSubStruct")
    int8_t("aByteArray")[20]
}

val MediumTestStruct2 = struct(Module.ASSIMP, "MediumTestStruct2") {
    int64_t("aLong")
    int8_t("aByte")
    double("aSecondLong")
    int8_t("aByteArray")[20]
    SmallTestStruct1("aSubStruct")
    int64_t("aThirdLong")
    int32_t("aInt4")[4]
    int16_t("aShort")
    SmallTestStruct3("aSecondSubStruct")
    int64_t("aPointer")
}

val MediumTestStruct3 = struct(Module.ASSIMP, "MediumTestStruct3") {
    SmallTestStruct1("aSmallTestStruct1")
    SmallTestStruct2("aSmallTestStruct2")
    SmallTestStruct3("aSmallTestStruct3")
    SmallTestStruct4("aSmallTestStruct4")
    SmallTestStruct5("aSmallTestStruct5")
    SmallTestStruct6("aSmallTestStruct6")
    SmallTestStruct7("aSmallTestStruct7")
    SmallTestStruct8("aSmallTestStruct8")
    SmallTestStruct9("aSmallTestStruct9")
    SmallTestStruct10("aSmallTestStruct10")
}

val MediumTestStruct4 = struct(Module.ASSIMP, "MediumTestStruct4") {
    MediumTestStruct1("aMediumTestStruct1")
    MediumTestStruct2("aMediumTestStruct2")
    double("aFloat64Array")[13]
    int8_t("aByte")
    SmallTestStruct6("aSmallTestStruct6")
    int16_t("aShort")
    SmallTestStruct7("aSmallTestStruct7")
}

val MediumTestStruct5 = struct(Module.ASSIMP, "MediumTestStruct5") {
    int8_t("aFloat64Array")[21]
    MediumTestStruct3("aMediumTestStruct3")
    SmallTestStruct2("aSmallTestStruct2")
    int64_t("aPointer64")
    SmallTestStruct7("aStructArray")[5]
}

val LargeTestStruct1 = struct(Module.ASSIMP, "LargeTestStruct1") {
    MediumTestStruct1("mediumTestStruct1Array")[600]
    SmallTestStruct3("smallTestStruct3Array")[1200]
    int32_t("intArray")[100000]
}

val LargeTestStruct2 = struct(Module.ASSIMP, "LargeTestStruct2") {
    int8_t("nativeInt8Array")[500000]
}

val LargeTestStruct3 = struct(Module.ASSIMP, "LargeTestStruct3") {
    MediumTestStruct1("mediumTestStruct1Array")[1200]
    MediumTestStruct5("mediumTestStruct5Array")[1200]
    SmallTestStruct8("smallTestStruct8Array")[1200]
    SmallTestStruct10("smallTestStruct10Array")[1200]
}

val LargeTestStruct4 = struct(Module.ASSIMP, "LargeTestStruct4") {
    MediumTestStruct1("mediumTestStruct1Array")[400]
    MediumTestStruct2("mediumTestStruct2Array")[500]
    MediumTestStruct3("mediumTestStruct3Array")[600]
    MediumTestStruct4("mediumTestStruct4Array")[300]
    MediumTestStruct5("mediumTestStruct5Array")[700]
}

val LargeTestStruct5 = struct(Module.ASSIMP, "LargeTestStruct5") {
    LargeTestStruct1("largeTestStruct1")
    LargeTestStruct4("largeTestStruct4")
}

