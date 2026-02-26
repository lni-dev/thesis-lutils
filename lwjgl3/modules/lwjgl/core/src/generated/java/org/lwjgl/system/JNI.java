/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system;

import org.jspecify.annotations.*;

/**
 * This class contains native methods that can be used to call dynamically loaded functions. It is used internally by the LWJGL bindings, but can also
 * be used to call other dynamically loaded functions. Not all possible signatures are available, only those needed by the LWJGL bindings. To call a
 * function that does not have a matching JNI method, {@link org.lwjgl.system.libffi.LibFFI LibFFI} can used.
 * 
 * <p>All JNI methods in this class take an extra parameter, called {@code __functionAddress}. This must be a valid pointer to a native function with a
 * matching signature. Due to overloading, method names are partially mangled:</p>
 * 
 * <ul>
 * <li>{@code call} or {@code invoke}
 * 
 * <p>Methods with the {@code invoke} prefix will invoke the native function with the default calling convention. Methods with the {@code call}
 * prefix will invoke the native function with the {@code __stdcall} calling convention on Windows and the default calling convention on other
 * systems.</p></li>
 * <li>a {@code U} (unsigned) or a {@code B} (signed) for each {@code byte} parameter</li>
 * <li>a {@code C} (unsigned) or an {@code S} (signed) for each {@code short} parameter</li>
 * <li>a {@code J}, a {@code N} or a {@code P} for each {@code long} parameter
 * 
 * <p>{@code J} parameters represent 64-bit integer values. {@code N} parameters represent C long values, which may be 32-bit or 64-bit integers
 * depending on the platform. {@code P} parameters represent pointer addresses, which maybe 32-bit or 64-bit values depending on the JVM.</p></li>
 * <li>the return value <a href="https://docs.oracle.com/javase/8/docs/technotes/guides/jni/spec/types.html#type_signatures">JNI type signature</a></li>
 * </ul>
 */
public final class JNI {

    static {
        Library.initialize();
    }

    private JNI() {}

    // Pointer API

    public static native short invokeC(long __functionAddress);
    public static native short invokeC(int param0, long __functionAddress);
    public static native short invokePC(long param0, long __functionAddress);
    public static native short invokeCC(int param0, short param1, long __functionAddress);
    public static native short invokeCC(short param0, boolean param1, long __functionAddress);
    public static native short invokePC(long param0, int param1, long __functionAddress);
    public static native short invokeJC(int param0, int param1, long param2, long __functionAddress);
    public static native short invokeCUC(short param0, byte param1, long __functionAddress);
    public static native short invokePCC(long param0, short param1, long __functionAddress);
    public static native short invokeCCC(short param0, short param1, boolean param2, long __functionAddress);
    public static native short invokePCC(int param0, long param1, short param2, long __functionAddress);
    public static native short invokePCC(long param0, int param1, short param2, long __functionAddress);
    public static native short invokeUPC(byte param0, long param1, boolean param2, long __functionAddress);
    public static native short invokeCJC(int param0, boolean param1, short param2, int param3, long param4, long __functionAddress);
    public static native short invokeCPCC(short param0, long param1, short param2, long __functionAddress);
    public static native short invokePPCC(long param0, long param1, short param2, long __functionAddress);
    public static native short invokeCCJC(short param0, short param1, int param2, long param3, long __functionAddress);
    public static native short invokePCCC(long param0, short param1, short param2, int param3, int param4, long __functionAddress);
    public static native short invokeCCCCC(short param0, short param1, short param2, short param3, long __functionAddress);
    public static native short invokePJUPC(long param0, long param1, byte param2, long param3, long __functionAddress);
    public static native short invokeCCJPC(short param0, boolean param1, short param2, int param3, long param4, long param5, long __functionAddress);
    public static native short invokePCCCCC(long param0, short param1, short param2, short param3, short param4, long __functionAddress);
    public static native short invokeCCCJPC(short param0, short param1, short param2, boolean param3, int param4, long param5, long param6, long __functionAddress);
    public static native short invokeCCCJPC(short param0, short param1, boolean param2, short param3, int param4, long param5, long param6, long __functionAddress);
    public static native double invokePD(long param0, int param1, long __functionAddress);
    public static native float invokePF(long param0, long __functionAddress);
    public static native float invokePPF(long param0, long param1, long __functionAddress);
    public static native int invokeI(long __functionAddress);
    public static native int invokeI(int param0, long __functionAddress);
    public static native int invokeI(boolean param0, long __functionAddress);
    public static native int invokeI(int param0, boolean param1, long __functionAddress);
    public static native int invokePI(long param0, long __functionAddress);
    public static native int invokeCI(int param0, short param1, long __functionAddress);
    public static native int invokePI(int param0, long param1, long __functionAddress);
    public static native int invokePI(long param0, int param1, long __functionAddress);
    public static native int invokeCPI(short param0, long param1, long __functionAddress);
    public static native int invokePCI(long param0, short param1, long __functionAddress);
    public static native int invokePJI(long param0, long param1, long __functionAddress);
    public static native int invokePNI(long param0, long param1, long __functionAddress);
    public static native int invokePPI(long param0, long param1, long __functionAddress);
    public static native int invokePPI(int param0, long param1, long param2, long __functionAddress);
    public static native int invokePPI(long param0, long param1, float param2, long __functionAddress);
    public static native int invokePPI(long param0, long param1, int param2, long __functionAddress);
    public static native int invokePPI(int param0, long param1, int param2, long param3, int param4, boolean param5, long __functionAddress);
    public static native int invokeCPUI(short param0, long param1, byte param2, long __functionAddress);
    public static native int invokePPCI(long param0, long param1, short param2, long __functionAddress);
    public static native int invokePPPI(long param0, long param1, long param2, int param3, long __functionAddress);
    public static native int invokePPPI(long param0, long param1, int param2, int param3, long param4, long __functionAddress);
    public static native int invokePPPI(long param0, long param1, long param2, int param3, boolean param4, float param5, long __functionAddress);
    public static native int invokePNNPI(long param0, long param1, int param2, long param3, long param4, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, long param2, long param3, int param4, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, int param2, int param3, long param4, long param5, long __functionAddress);
    public static native int invokePNNPPPI(long param0, long param1, long param2, int param3, int param4, long param5, long param6, long param7, long __functionAddress);
    public static native int invokePPPPPPPPI(long param0, int param1, int param2, long param3, long param4, long param5, long param6, long param7, long param8, long param9, long __functionAddress);
    public static native long invokeJ(long __functionAddress);
    public static native long invokePJ(long param0, long __functionAddress);
    public static native long invokePJ(long param0, int param1, long __functionAddress);
    public static native long invokePN(long param0, long __functionAddress);
    public static native long invokePN(long param0, int param1, long __functionAddress);
    public static native long invokePNPN(long param0, long param1, long param2, int param3, long __functionAddress);
    public static native long invokePNPNPN(long param0, long param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, long param9, long param10, long param11, long __functionAddress);
    public static native long invokeP(long __functionAddress);
    public static native long invokeP(int param0, long __functionAddress);
    public static native long invokeP(boolean param0, long __functionAddress);
    public static native long invokeCP(short param0, long __functionAddress);
    public static native long invokePP(long param0, long __functionAddress);
    public static native long invokePP(long param0, int param1, long __functionAddress);
    public static native long invokePP(long param0, int param1, int param2, int param3, long __functionAddress);
    public static native long invokePP(long param0, int param1, int param2, int param3, int param4, int param5, long __functionAddress);
    public static native long invokeCPP(short param0, long param1, long __functionAddress);
    public static native long invokePPP(long param0, long param1, long __functionAddress);
    public static native long invokePUP(long param0, byte param1, long __functionAddress);
    public static native long invokePCP(long param0, short param1, boolean param2, long __functionAddress);
    public static native long invokePPP(long param0, int param1, long param2, long __functionAddress);
    public static native long invokePPP(long param0, long param1, int param2, long __functionAddress);
    public static native long invokePPP(long param0, int param1, int param2, long param3, long __functionAddress);
    public static native long invokePPP(long param0, int param1, long param2, int param3, long __functionAddress);
    public static native long invokePPP(long param0, long param1, boolean param2, boolean param3, long __functionAddress);
    public static native long invokePPP(long param0, boolean param1, boolean param2, long param3, long __functionAddress);
    public static native long invokePUP(long param0, int param1, byte param2, int param3, boolean param4, boolean param5, long __functionAddress);
    public static native long invokePPPP(long param0, long param1, long param2, long __functionAddress);
    public static native long invokePPPP(long param0, int param1, long param2, long param3, long __functionAddress);
    public static native long invokePPPP(long param0, int param1, int param2, long param3, long param4, long __functionAddress);
    public static native long invokeJPPP(int param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);
    public static native long invokePPPPP(long param0, long param1, long param2, long param3, long __functionAddress);
    public static native long invokePJPPP(long param0, int param1, int param2, long param3, long param4, long param5, long __functionAddress);
    public static native long invokePNNNPP(long param0, long param1, long param2, long param3, long param4, long __functionAddress);
    public static native long invokeCCCUJP(short param0, short param1, short param2, byte param3, int param4, long param5, long __functionAddress);
    public static native long invokePPPPPP(long param0, long param1, long param2, long param3, long param4, int param5, long __functionAddress);
    public static native byte invokeUPU(byte param0, long param1, long __functionAddress);
    public static native void invokeV(long __functionAddress);
    public static native void invokeV(int param0, long __functionAddress);
    public static native void invokeV(int param0, int param1, long __functionAddress);
    public static native void invokeV(int param0, int param1, int param2, int param3, long __functionAddress);
    public static native void invokeCV(short param0, long __functionAddress);
    public static native void invokePV(long param0, long __functionAddress);
    public static native void invokeUV(byte param0, long __functionAddress);
    public static native void invokeCV(int param0, short param1, long __functionAddress);
    public static native void invokeCV(short param0, int param1, long __functionAddress);
    public static native void invokeCV(short param0, boolean param1, long __functionAddress);
    public static native void invokeJV(long param0, int param1, long __functionAddress);
    public static native void invokePV(int param0, long param1, long __functionAddress);
    public static native void invokePV(long param0, float param1, long __functionAddress);
    public static native void invokePV(long param0, int param1, long __functionAddress);
    public static native void invokePV(long param0, boolean param1, long __functionAddress);
    public static native void invokeUV(byte param0, int param1, long __functionAddress);
    public static native void invokeUV(byte param0, boolean param1, long __functionAddress);
    public static native void invokeCV(short param0, int param1, int param2, long __functionAddress);
    public static native void invokePV(long param0, int param1, double param2, long __functionAddress);
    public static native void invokePV(long param0, int param1, int param2, long __functionAddress);
    public static native void invokePV(long param0, int param1, boolean param2, long __functionAddress);
    public static native void invokePV(long param0, float param1, float param2, float param3, long __functionAddress);
    public static native void invokeUV(byte param0, float param1, float param2, float param3, float param4, long __functionAddress);
    public static native void invokePV(long param0, int param1, int param2, int param3, int param4, boolean param5, long __functionAddress);
    public static native void invokeCCV(short param0, short param1, long __functionAddress);
    public static native void invokeCPV(short param0, long param1, long __functionAddress);
    public static native void invokePCV(long param0, short param1, long __functionAddress);
    public static native void invokePJV(long param0, long param1, long __functionAddress);
    public static native void invokePPV(long param0, long param1, long __functionAddress);
    public static native void invokePUV(long param0, byte param1, long __functionAddress);
    public static native void invokeUPV(byte param0, long param1, long __functionAddress);
    public static native void invokeCPV(short param0, int param1, long param2, long __functionAddress);
    public static native void invokeCPV(short param0, long param1, int param2, long __functionAddress);
    public static native void invokePCV(long param0, int param1, short param2, long __functionAddress);
    public static native void invokePCV(long param0, short param1, boolean param2, long __functionAddress);
    public static native void invokePJV(long param0, int param1, long param2, long __functionAddress);
    public static native void invokePJV(long param0, long param1, int param2, long __functionAddress);
    public static native void invokePPV(long param0, int param1, long param2, long __functionAddress);
    public static native void invokePPV(long param0, long param1, float param2, long __functionAddress);
    public static native void invokePPV(long param0, long param1, int param2, long __functionAddress);
    public static native void invokePPV(long param0, long param1, boolean param2, long __functionAddress);
    public static native void invokeUCV(byte param0, short param1, int param2, long __functionAddress);
    public static native void invokePCV(long param0, short param1, int param2, int param3, long __functionAddress);
    public static native void invokePPV(long param0, long param1, int param2, int param3, long __functionAddress);
    public static native void invokeUCV(byte param0, short param1, int param2, int param3, long __functionAddress);
    public static native void invokeUPV(byte param0, long param1, int param2, int param3, long __functionAddress);
    public static native void invokeCCPV(short param0, short param1, long param2, long __functionAddress);
    public static native void invokeCPCV(short param0, long param1, short param2, long __functionAddress);
    public static native void invokeCPPV(short param0, long param1, long param2, long __functionAddress);
    public static native void invokePNPV(long param0, long param1, long param2, long __functionAddress);
    public static native void invokePPPV(long param0, long param1, long param2, long __functionAddress);
    public static native void invokeCCCV(short param0, short param1, short param2, int param3, long __functionAddress);
    public static native void invokeCCUV(short param0, short param1, int param2, byte param3, long __functionAddress);
    public static native void invokePJPV(long param0, long param1, long param2, int param3, long __functionAddress);
    public static native void invokePPPV(long param0, int param1, long param2, long param3, long __functionAddress);
    public static native void invokePPPV(long param0, long param1, long param2, float param3, long __functionAddress);
    public static native void invokePPPV(long param0, long param1, long param2, int param3, long __functionAddress);
    public static native void invokePUCV(long param0, byte param1, short param2, int param3, long __functionAddress);
    public static native void invokeUCCV(byte param0, short param1, short param2, int param3, long __functionAddress);
    public static native void invokeCCUV(short param0, short param1, int param2, float param3, byte param4, long __functionAddress);
    public static native void invokePPPV(long param0, int param1, long param2, long param3, int param4, long __functionAddress);
    public static native void invokePPPV(long param0, long param1, long param2, boolean param3, boolean param4, long __functionAddress);
    public static native void invokePUCV(long param0, byte param1, short param2, int param3, int param4, long __functionAddress);
    public static native void invokePUPV(long param0, byte param1, long param2, int param3, int param4, long __functionAddress);
    public static native void invokeUCCV(byte param0, short param1, int param2, int param3, short param4, long __functionAddress);
    public static native void invokeUCUV(byte param0, short param1, byte param2, int param3, int param4, long __functionAddress);
    public static native void invokeUPCV(byte param0, long param1, int param2, int param3, short param4, long __functionAddress);
    public static native void invokeCCUV(short param0, short param1, int param2, int param3, int param4, byte param5, long __functionAddress);
    public static native void invokePPPV(long param0, long param1, long param2, int param3, boolean param4, boolean param5, long __functionAddress);
    public static native void invokePPPV(long param0, boolean param1, int param2, long param3, long param4, int param5, long __functionAddress);
    public static native void invokePPPV(long param0, long param1, int param2, int param3, int param4, long param5, int param6, boolean param7, long __functionAddress);
    public static native void invokeCCUPV(short param0, short param1, byte param2, long param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, long param2, short param3, long __functionAddress);
    public static native void invokePNPPV(long param0, long param1, long param2, long param3, long __functionAddress);
    public static native void invokePPPPV(long param0, long param1, long param2, long param3, long __functionAddress);
    public static native void invokeCCCUV(short param0, short param1, short param2, int param3, byte param4, long __functionAddress);
    public static native void invokePCCUV(long param0, short param1, short param2, int param3, byte param4, long __functionAddress);
    public static native void invokePPCPV(long param0, long param1, short param2, int param3, long param4, long __functionAddress);
    public static native void invokePPPCV(long param0, long param1, int param2, long param3, short param4, long __functionAddress);
    public static native void invokePPPPV(long param0, long param1, long param2, long param3, int param4, long __functionAddress);
    public static native void invokePUCCV(long param0, byte param1, short param2, short param3, int param4, long __functionAddress);
    public static native void invokeCCCUV(short param0, short param1, short param2, int param3, int param4, byte param5, long __functionAddress);
    public static native void invokePUCCV(long param0, byte param1, short param2, int param3, int param4, short param5, long __functionAddress);
    public static native void invokePUCUV(long param0, byte param1, short param2, byte param3, int param4, int param5, long __functionAddress);
    public static native void invokePUPCV(long param0, byte param1, long param2, int param3, int param4, short param5, long __functionAddress);
    public static native void invokeCCCUV(short param0, short param1, short param2, int param3, int param4, int param5, byte param6, long __functionAddress);
    public static native void invokePCCUV(long param0, short param1, short param2, int param3, int param4, int param5, byte param6, long __functionAddress);
    public static native void invokeCCCCCV(short param0, short param1, short param2, short param3, short param4, long __functionAddress);
    public static native void invokeCCUPPV(short param0, short param1, byte param2, long param3, long param4, long __functionAddress);
    public static native void invokePPCPPV(long param0, long param1, short param2, long param3, long param4, long __functionAddress);
    public static native void invokePPPPPV(long param0, long param1, long param2, long param3, long param4, long __functionAddress);
    public static native void invokePCCCUV(long param0, short param1, short param2, short param3, int param4, byte param5, long __functionAddress);
    public static native void invokePPPPPV(long param0, int param1, long param2, long param3, long param4, long param5, long __functionAddress);
    public static native void invokePCCCUV(long param0, short param1, short param2, short param3, int param4, int param5, byte param6, long __functionAddress);
    public static native void invokePCCCCV(long param0, short param1, short param2, short param3, boolean param4, boolean param5, short param6, int param7, long __functionAddress);
    public static native void invokePCCCUV(long param0, short param1, short param2, short param3, int param4, int param5, int param6, byte param7, long __functionAddress);
    public static native void invokeCCCCUV(short param0, short param1, short param2, int param3, short param4, int param5, int param6, int param7, byte param8, long __functionAddress);
    public static native void invokePPPPPV(int param0, long param1, int param2, long param3, long param4, long param5, int param6, long param7, int param8, boolean param9, long __functionAddress);
    public static native void invokeCCCCPCV(short param0, short param1, short param2, short param3, long param4, short param5, long __functionAddress);
    public static native void invokePCCCCUV(long param0, short param1, int param2, short param3, short param4, short param5, byte param6, long __functionAddress);
    public static native void invokePCCCCUV(long param0, short param1, short param2, short param3, int param4, short param5, int param6, int param7, int param8, byte param9, long __functionAddress);
    public static native void invokeCCUCCCCPCV(short param0, short param1, byte param2, short param3, short param4, short param5, short param6, long param7, short param8, long __functionAddress);
    public static native void invokeCUCCCCCCPV(short param0, byte param1, short param2, short param3, short param4, short param5, short param6, short param7, long param8, long __functionAddress);
    public static native void invokeCCUUCCCCPCV(short param0, short param1, byte param2, byte param3, short param4, short param5, short param6, short param7, long param8, short param9, long __functionAddress);
    public static native void invokeCCUUUUUUUUUV(short param0, short param1, float param2, byte param3, byte param4, byte param5, byte param6, byte param7, byte param8, byte param9, byte param10, byte param11, long __functionAddress);
    public static native void invokeCCUCCCCUCCCCCCV(short param0, short param1, byte param2, short param3, short param4, short param5, short param6, byte param7, short param8, short param9, short param10, short param11, short param12, short param13, long __functionAddress);
    public static native void invokePCCUCCCCUCCCCCCV(long param0, short param1, short param2, byte param3, short param4, short param5, short param6, short param7, byte param8, short param9, short param10, short param11, short param12, short param13, short param14, long __functionAddress);
    public static native boolean invokePZ(long param0, long __functionAddress);
    public static native boolean invokePZ(long param0, int param1, long __functionAddress);
    public static native boolean invokePPZ(long param0, long param1, long __functionAddress);
    public static native boolean invokeUPZ(byte param0, long param1, long __functionAddress);
    public static native boolean invokePJPZ(long param0, long param1, long param2, int param3, long __functionAddress);
    public static native boolean invokePPPZ(long param0, long param1, long param2, int param3, long __functionAddress);
    public static native boolean invokeCCJZ(short param0, boolean param1, short param2, int param3, long param4, long __functionAddress);
    public static native boolean invokePPPZ(long param0, long param1, int param2, long param3, int param4, boolean param5, long __functionAddress);
    public static native boolean invokePPPPZ(long param0, long param1, long param2, long param3, long __functionAddress);
    public static native boolean invokePPPUPZ(long param0, long param1, long param2, byte param3, long param4, long __functionAddress);
    public static native int callI(long __functionAddress);
    public static native int callI(int param0, long __functionAddress);
    public static native int callI(int param0, int param1, long __functionAddress);
    public static native int callPI(long param0, long __functionAddress);
    public static native int callPI(long param0, int param1, long __functionAddress);
    public static native int callPI(int param0, long param1, int param2, long __functionAddress);
    public static native int callPPI(long param0, long param1, long __functionAddress);
    public static native int callPPI(long param0, int param1, long param2, int param3, long __functionAddress);
    public static native int callPPI(long param0, long param1, int param2, int param3, int param4, long __functionAddress);
    public static native int callPPPPI(long param0, long param1, long param2, int param3, long param4, long __functionAddress);
    public static native long callP(long __functionAddress);
    public static native long callPP(long param0, long __functionAddress);
    public static native long callPP(long param0, int param1, long __functionAddress);
    public static native long callPPPP(long param0, int param1, long param2, long param3, long __functionAddress);
    public static native long callPPPPP(long param0, long param1, int param2, long param3, long param4, long __functionAddress);
    public static native short callS(int param0, long __functionAddress);

    // Array API

    public static native short invokeUPC(byte param0, short @Nullable [] param1, boolean param2, long __functionAddress);
    public static native short invokeCPCC(short param0, short @Nullable [] param1, short param2, long __functionAddress);
    public static native int invokeCPI(short param0, int @Nullable [] param1, long __functionAddress);
    public static native int invokePCI(float @Nullable [] param0, short param1, long __functionAddress);
    public static native int invokePPI(int param0, long param1, int @Nullable [] param2, long __functionAddress);
    public static native int invokePPI(int param0, int @Nullable [] param1, int param2, int @Nullable [] param3, int param4, boolean param5, long __functionAddress);
    public static native int invokePPI(int param0, short @Nullable [] param1, int param2, short @Nullable [] param3, int param4, boolean param5, long __functionAddress);
    public static native int invokeCPUI(short param0, float @Nullable [] param1, byte param2, long __functionAddress);
    public static native int invokeCPUI(short param0, int @Nullable [] param1, byte param2, long __functionAddress);
    public static native int invokeCPUI(short param0, short @Nullable [] param1, byte param2, long __functionAddress);
    public static native int invokePPCI(long param0, float @Nullable [] param1, short param2, long __functionAddress);
    public static native int invokePPPI(int @Nullable [] param0, long param1, long param2, int param3, boolean param4, float param5, long __functionAddress);
    public static native int invokePPPI(short @Nullable [] param0, long param1, long param2, int param3, boolean param4, float param5, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, int param2, int param3, float @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int invokePPPPI(long param0, long param1, int param2, int param3, int @Nullable [] param4, int @Nullable [] param5, long __functionAddress);
    public static native int invokePNNPPPI(long param0, long param1, long param2, int param3, int param4, int @Nullable [] param5, int @Nullable [] param6, long param7, long __functionAddress);
    public static native int invokePPPPPPPPI(long param0, int param1, int param2, long param3, int @Nullable [] param4, int @Nullable [] param5, float @Nullable [] param6, int @Nullable [] param7, int @Nullable [] param8, int @Nullable [] param9, long __functionAddress);
    public static native long invokePP(double @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(float @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(int @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(long @Nullable [] param0, int param1, long __functionAddress);
    public static native long invokePP(short @Nullable [] param0, int param1, long __functionAddress);
    public static native byte invokeUPU(byte param0, int @Nullable [] param1, long __functionAddress);
    public static native void invokeUPV(byte param0, float @Nullable [] param1, long __functionAddress);
    public static native void invokeCCPV(short param0, short param1, short @Nullable [] param2, long __functionAddress);
    public static native void invokeCPCV(short param0, double @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, float @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, int @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, long @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPCV(short param0, short @Nullable [] param1, short param2, long __functionAddress);
    public static native void invokeCPPV(short param0, float @Nullable [] param1, float @Nullable [] param2, long __functionAddress);
    public static native void invokePNPV(long param0, long param1, short @Nullable [] param2, long __functionAddress);
    public static native void invokePPPV(float @Nullable [] param0, int param1, long param2, long param3, int param4, long __functionAddress);
    public static native void invokePPPV(float @Nullable [] param0, boolean param1, int param2, long param3, long param4, int param5, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, double @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, float @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, int @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, long @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePCPCV(long param0, short param1, short @Nullable [] param2, short param3, long __functionAddress);
    public static native void invokePNPPV(long param0, long param1, long param2, short @Nullable [] param3, long __functionAddress);
    public static native void invokePPPPPV(long param0, long param1, long param2, float @Nullable [] param3, long param4, long __functionAddress);
    public static native void invokePPPPPV(long param0, int param1, long param2, int @Nullable [] param3, long param4, long param5, long __functionAddress);
    public static native void invokePPPPPV(int param0, long param1, int param2, float @Nullable [] param3, float @Nullable [] param4, long param5, int param6, long param7, int param8, boolean param9, long __functionAddress);
    public static native void invokePPPPPV(int param0, int @Nullable [] param1, int param2, float @Nullable [] param3, float @Nullable [] param4, long param5, int param6, int @Nullable [] param7, int param8, boolean param9, long __functionAddress);
    public static native void invokePPPPPV(int param0, short @Nullable [] param1, int param2, float @Nullable [] param3, float @Nullable [] param4, long param5, int param6, short @Nullable [] param7, int param8, boolean param9, long __functionAddress);
    public static native int callPPI(long param0, int @Nullable [] param1, long __functionAddress);

}
