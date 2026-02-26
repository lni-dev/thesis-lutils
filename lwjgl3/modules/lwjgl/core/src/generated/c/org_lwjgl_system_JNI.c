/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
#include "common_tools.h"

#ifdef LWJGL_WINDOWS
    #define APIENTRY __stdcall
#else
    #define APIENTRY
#endif

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeC__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeC__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePC__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCC__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCC__SZJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, jboolean))(uintptr_t)__functionAddress)((uint16_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePC__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeJC__IIJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCUC__SBJ(JNIEnv *__env, jclass clazz, jshort param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint8_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCC__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCC__SSZJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, jboolean))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCC__IJSJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, uintptr_t, uint16_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCC__JISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeUPC__BJZJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint8_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCJC__IZSIJJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jshort param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (jint, jboolean, uint16_t, jint, jlong))(uintptr_t)__functionAddress)(param0, param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCPCC__SJSJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePPCC__JJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCJC__SSIJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, jint, jlong))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCCC__JSSIIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uint16_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCCCC__SSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePJUPC__JJBJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jbyte param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, jlong, uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint8_t)param2, (uintptr_t)param3);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCJPC__SZSIJJJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jshort param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, jboolean, uint16_t, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, param1, (uint16_t)param2, param3, param4, (uintptr_t)param5);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokePCCCCC__JSSSSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uintptr_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, (uint16_t)param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCCJPC__SSSZIJJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jboolean param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, uint16_t, jboolean, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCCCJPC__SSZSIJJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jboolean param2, jshort param3, jint param4, jlong param5, jlong param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jshort)((uint16_t (*) (uint16_t, uint16_t, jboolean, uint16_t, jint, jlong, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, (uint16_t)param3, param4, param5, (uintptr_t)param6);
}
JNIEXPORT jdouble JNICALL Java_org_lwjgl_system_JNI_invokePD__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jdouble (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePF__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jfloat JNICALL Java_org_lwjgl_system_JNI_invokePPF__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jfloat (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeI__IZJ(JNIEnv *__env, jclass clazz, jint param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, jboolean))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCI__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePI__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPI__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePCI__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePJI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__IJJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__IJIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (jint, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__SJBJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uint16_t, uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uint8_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPCI__JJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI__JJJIZFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jboolean param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPI__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, jint, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2, (long)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPPPI__JJJIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jlong param5, jlong param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, long, long, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, param3, param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JIIJJJJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong param6, jlong param7, jlong param8, jlong param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, (uintptr_t)param6, (uintptr_t)param7, (uintptr_t)param8, (uintptr_t)param9);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJ__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJ__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJ__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jlong (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePN__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePN__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNPN__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, long, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNPNPN__JJIIIIIIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jint param5, jint param6, jint param7, jint param8, jlong param9, jlong param10, jlong param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((long (*) (uintptr_t, long, jint, jint, jint, jint, jint, jint, jint, uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, param2, param3, param4, param5, param6, param7, param8, (uintptr_t)param9, (long)param10, (uintptr_t)param11);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeP__ZJ(JNIEnv *__env, jclass clazz, jboolean param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jboolean))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCP__SJ(JNIEnv *__env, jclass clazz, jshort param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP__JIIIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCPP__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePUP__JBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePCP__JSZJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uint16_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JJZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jboolean param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPP__JZZJJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jboolean param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jboolean, jboolean, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePUP__JIBIZZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jbyte param2, jint param3, jboolean param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uint8_t, jint, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint8_t)param2, param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPP__JIIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeJPPP__IIIJJJJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (jint, jint, jint, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPP__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePJPPP__JIIJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, jint, jint, jlong, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePNNNPP__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, long, long, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, (long)param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokeCCCUJP__SSSBIJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jbyte param3, jint param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uint16_t, uint16_t, uint16_t, uint8_t, jint, jlong))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint8_t)param3, param4, param5);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePPPPPP__JJJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokeUPU__BJJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jbyte)((uint8_t (*) (uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeV__IIIIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, jint, jint, jint))(uintptr_t)__functionAddress)(param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SJ(JNIEnv *__env, jclass clazz, jshort param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t))(uintptr_t)__functionAddress)((uint8_t)param0);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__ISJ(JNIEnv *__env, jclass clazz, jint param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uint16_t))(uintptr_t)__functionAddress)(param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SIJ(JNIEnv *__env, jclass clazz, jshort param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jint))(uintptr_t)__functionAddress)((uint16_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SZJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jboolean))(uintptr_t)__functionAddress)((uint16_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeJV__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jlong, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__IJJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JZJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BIJ(JNIEnv *__env, jclass clazz, jbyte param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, jint))(uintptr_t)__functionAddress)((uint8_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BZJ(JNIEnv *__env, jclass clazz, jbyte param0, jboolean param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, jboolean))(uintptr_t)__functionAddress)((uint8_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCV__SIIJ(JNIEnv *__env, jclass clazz, jshort param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jint, jint))(uintptr_t)__functionAddress)((uint16_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIDJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jdouble param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jdouble))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JFFFJ(JNIEnv *__env, jclass clazz, jlong param0, jfloat param1, jfloat param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUV__BFFFFJ(JNIEnv *__env, jclass clazz, jbyte param0, jfloat param1, jfloat param2, jfloat param3, jfloat param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, jfloat, jfloat, jfloat, jfloat))(uintptr_t)__functionAddress)((uint8_t)param0, param1, param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePV__JIIIIZJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jint param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jint, jint, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCV__SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPV__SJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUV__JBJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPV__BJJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPV__SIJJ(JNIEnv *__env, jclass clazz, jshort param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPV__SJIJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JISJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uint16_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSZJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, jlong))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJV__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JIJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jfloat param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCV__BSIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCV__JSIIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPV__JJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCV__BSIIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPV__BJIIJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jint param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1, param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCPV__SSJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__SJSJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uint16_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPPV__SJJJ(JNIEnv *__env, jclass clazz, jshort param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCV__SSSIJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUV__SSIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jbyte param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, (uint8_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePJPV__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJFJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloat param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jfloat))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCV__JBSIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCCV__BSSIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jshort param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, (uint16_t)param2, param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUV__SSIFBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jfloat param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jint, jfloat, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jboolean param3, jboolean param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCV__JBSIIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUPV__JBJIIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uintptr_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uintptr_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCCV__BSIISJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jint param2, jint param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, param2, param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUCUV__BSBIIJ(JNIEnv *__env, jclass clazz, jbyte param0, jshort param1, jbyte param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uint16_t, uint8_t, jint, jint))(uintptr_t)__functionAddress)((uint8_t)param0, (uint16_t)param1, (uint8_t)param2, param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPCV__BJIISJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jint param2, jint param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint8_t, uintptr_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1, param2, param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUV__SSIIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jint param2, jint param3, jint param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, param3, param4, (uint8_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJJIZZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jboolean param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JZIJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jboolean, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV__JJIIIJIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong param5, jint param6, jboolean param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, jint, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4, (uintptr_t)param5, param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUPV__SSBJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JSJSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlong param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uintptr_t)param2, (uint16_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCUV__SSSIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCUV__JSSIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jbyte param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3, (uint8_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPCPV__JJSIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uint16_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPCV__JJIJSJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, jint, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPV__JJJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCCV__JBSSIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jshort param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, (uint16_t)param3, param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCUV__SSSIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jint param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, (uint8_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCCV__JBSIISJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jint param3, jint param4, jshort param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, param3, param4, (uint16_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUCUV__JBSBIIJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jshort param2, jbyte param3, jint param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uint16_t, uint8_t, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uint16_t)param2, (uint8_t)param3, param4, param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePUPCV__JBJIISJ(JNIEnv *__env, jclass clazz, jlong param0, jbyte param1, jlong param2, jint param3, jint param4, jshort param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint8_t, uintptr_t, jint, jint, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint8_t)param1, (uintptr_t)param2, param3, param4, (uint16_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCUV__SSSIIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jint param4, jint param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCUV__JSSIIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jint param3, jint param4, jint param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, param3, param4, param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCCCV__SSSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jshort param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, (uint16_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUPPV__SSBJJJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPCPPV__JJSJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshort param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uint16_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uint16_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCUV__JSSSIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jbyte param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, (uint8_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIJJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCUV__JSSSIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jint param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCCV__JSSSZZSIJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jboolean param4, jboolean param5, jshort param6, jint param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jboolean, jboolean, uint16_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, param5, (uint16_t)param6, param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCUV__JSSSIIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jint param5, jint param6, jbyte param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, param5, param6, (uint8_t)param7);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCCUV__SSSISIIIBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jint param3, jshort param4, jint param5, jint param6, jint param7, jbyte param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, jint, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, param3, (uint16_t)param4, param5, param6, param7, (uint8_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__IJIJJJIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong param3, jlong param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCCCPCV__SSSSJSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshort param2, jshort param3, jlong param4, jshort param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, (uintptr_t)param4, (uint16_t)param5);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCCUV__JSISSSBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jint param2, jshort param3, jshort param4, jshort param5, jbyte param6, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, jint, uint16_t, uint16_t, uint16_t, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint8_t)param6);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCCCUV__JSSSISIIIBJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jshort param3, jint param4, jshort param5, jint param6, jint param7, jint param8, jbyte param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint16_t, jint, uint16_t, jint, jint, jint, uint8_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint16_t)param3, param4, (uint16_t)param5, param6, param7, param8, (uint8_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUCCCCPCV__SSBSSSSJSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jshort param3, jshort param4, jshort param5, jshort param6, jlong param7, jshort param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uintptr_t)param7, (uint16_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCUCCCCCCPV__SBSSSSSSJJ(JNIEnv *__env, jclass clazz, jshort param0, jbyte param1, jshort param2, jshort param3, jshort param4, jshort param5, jshort param6, jshort param7, jlong param8, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint8_t)param1, (uint16_t)param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint16_t)param7, (uintptr_t)param8);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUUCCCCPCV__SSBBSSSSJSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jbyte param3, jshort param4, jshort param5, jshort param6, jshort param7, jlong param8, jshort param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uintptr_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uint8_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint16_t)param7, (uintptr_t)param8, (uint16_t)param9);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUUUUUUUUUV__SSFBBBBBBBBBJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jfloat param2, jbyte param3, jbyte param4, jbyte param5, jbyte param6, jbyte param7, jbyte param8, jbyte param9, jbyte param10, jbyte param11, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, jfloat, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, param2, (uint8_t)param3, (uint8_t)param4, (uint8_t)param5, (uint8_t)param6, (uint8_t)param7, (uint8_t)param8, (uint8_t)param9, (uint8_t)param10, (uint8_t)param11);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCUCCCCUCCCCCCV__SSBSSSSBSSSSSSJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jbyte param2, jshort param3, jshort param4, jshort param5, jshort param6, jbyte param7, jshort param8, jshort param9, jshort param10, jshort param11, jshort param12, jshort param13, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uint16_t)param0, (uint16_t)param1, (uint8_t)param2, (uint16_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint8_t)param7, (uint16_t)param8, (uint16_t)param9, (uint16_t)param10, (uint16_t)param11, (uint16_t)param12, (uint16_t)param13);
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCCUCCCCUCCCCCCV__JSSBSSSSBSSSSSSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshort param2, jbyte param3, jshort param4, jshort param5, jshort param6, jshort param7, jbyte param8, jshort param9, jshort param10, jshort param11, jshort param12, jshort param13, jshort param14, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    ((void (*) (uintptr_t, uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint8_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t, uint16_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uint16_t)param1, (uint16_t)param2, (uint8_t)param3, (uint16_t)param4, (uint16_t)param5, (uint16_t)param6, (uint16_t)param7, (uint8_t)param8, (uint16_t)param9, (uint16_t)param10, (uint16_t)param11, (uint16_t)param12, (uint16_t)param13, (uint16_t)param14);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePZ__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPZ__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeUPZ__BJJ(JNIEnv *__env, jclass clazz, jbyte param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uint8_t)param0, (uintptr_t)param1);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePJPZ__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, jlong, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJJIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokeCCJZ__SZSIJJ(JNIEnv *__env, jclass clazz, jshort param0, jboolean param1, jshort param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uint16_t, jboolean, uint16_t, jint, jlong))(uintptr_t)__functionAddress)((uint16_t)param0, param1, (uint16_t)param2, param3, param4);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPZ__JJIJIZJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, param4, param5);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPPZ__JJJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jboolean JNICALL Java_org_lwjgl_system_JNI_invokePPPUPZ__JJJBJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jbyte param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jboolean (*) (uintptr_t, uintptr_t, uintptr_t, uint8_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uint8_t)param3, (uintptr_t)param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callI__IIJ(JNIEnv *__env, jclass clazz, jint param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, jint))(uintptr_t)__functionAddress)(param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPI__IJIJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (jint, uintptr_t, jint))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JIJIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jint param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, jint, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, param3);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__JJIIIJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, jint, jint, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, param4);
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPPPI__JJJIJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jint (APIENTRY *) (uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, param3, (uintptr_t)param4);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callP__J(JNIEnv *__env, jclass clazz, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (void))(uintptr_t)__functionAddress)();
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__JJ(JNIEnv *__env, jclass clazz, jlong param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPP__JIJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)param0, param1);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPP__JIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jlong param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)param3);
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_callPPPPP__JJIJJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jlong param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return (jlong)((uintptr_t (APIENTRY *) (uintptr_t, uintptr_t, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, (uintptr_t)param3, (uintptr_t)param4);
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_callS__IJ(JNIEnv *__env, jclass clazz, jint param0, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    return ((jshort (APIENTRY *) (jint))(uintptr_t)__functionAddress)(param0);
}

JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeUPC__B_3SZJ(JNIEnv *__env, jclass clazz, jbyte param0, jshortArray param1, jboolean param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    jshort __result = (jshort)((uint16_t (*) (jbyte, uintptr_t, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jshort JNICALL Java_org_lwjgl_system_JNI_invokeCPCC__S_3SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshortArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    jshort __result = (jshort)((uint16_t (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPI__S_3IJ(JNIEnv *__env, jclass clazz, jshort param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePCI___3FSJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jshort param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    jint __result = ((jint (*) (uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__IJ_3IJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jintArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    jint __result = ((jint (*) (jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__I_3II_3IIZJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jintArray param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    jint __result = ((jint (*) (jint, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPI__I_3SI_3SIZJ(JNIEnv *__env, jclass clazz, jint param0, jshortArray param1, jint param2, jshortArray param3, jint param4, jboolean param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    jint __result = ((jint (*) (jint, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, param4, param5);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__S_3FBJ(JNIEnv *__env, jclass clazz, jshort param0, jfloatArray param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t, jbyte))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__S_3IBJ(JNIEnv *__env, jclass clazz, jshort param0, jintArray param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t, jbyte))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokeCPUI__S_3SBJ(JNIEnv *__env, jclass clazz, jshort param0, jshortArray param1, jbyte param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (jshort, uintptr_t, jbyte))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPCI__J_3FSJ(JNIEnv *__env, jclass clazz, jlong param0, jfloatArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI___3IJJIZFJ(JNIEnv *__env, jclass clazz, jintArray param0, jlong param1, jlong param2, jint param3, jboolean param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jfloat))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPI___3SJJIZFJ(JNIEnv *__env, jclass clazz, jshortArray param0, jlong param1, jlong param2, jint param3, jboolean param4, jfloat param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param0, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, uintptr_t, jint, jboolean, jfloat))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, (uintptr_t)param1, (uintptr_t)param2, param3, param4, param5);
    if (param0 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJII_3F_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jfloatArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPI__JJII_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jint param2, jint param3, jintArray param4, jintArray param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    jint __result = ((jint (*) (uintptr_t, uintptr_t, jint, jint, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, param2, param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5);
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePNNPPPI__JJJII_3I_3IJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jint param3, jint param4, jintArray param5, jintArray param6, jlong param7, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param6, NULL);
    jint __result = ((jint (*) (uintptr_t, long, long, jint, jint, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (long)param2, param3, param4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)param7);
    if (param6 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    return __result;
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_invokePPPPPPPPI__JIIJ_3I_3I_3F_3I_3I_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jint param2, jlong param3, jintArray param4, jintArray param5, jfloatArray param6, jintArray param7, jintArray param8, jintArray param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param4, NULL);
    void *paramArray5 = param5 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param5, NULL);
    void *paramArray6 = param6 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param6, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    void *paramArray8 = param8 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param8, NULL);
    void *paramArray9 = param9 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param9, NULL);
    jint __result = ((jint (*) (uintptr_t, jint, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, param2, (uintptr_t)param3, (uintptr_t)paramArray4, (uintptr_t)paramArray5, (uintptr_t)paramArray6, (uintptr_t)paramArray7, (uintptr_t)paramArray8, (uintptr_t)paramArray9);
    if (param9 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param9, paramArray9, 0); }
    if (param8 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param8, paramArray8, 0); }
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param6 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param6, paramArray6, 0); }
    if (param5 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param5, paramArray5, 0); }
    if (param4 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param4, paramArray4, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3DIJ(JNIEnv *__env, jclass clazz, jdoubleArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3FIJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3IIJ(JNIEnv *__env, jclass clazz, jintArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3JIJ(JNIEnv *__env, jclass clazz, jlongArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jlong JNICALL Java_org_lwjgl_system_JNI_invokePP___3SIJ(JNIEnv *__env, jclass clazz, jshortArray param0, jint param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param0, NULL);
    jlong __result = (jlong)((uintptr_t (*) (uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1);
    if (param0 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param0, paramArray0, 0); }
    return __result;
}
JNIEXPORT jbyte JNICALL Java_org_lwjgl_system_JNI_invokeUPU__B_3IJ(JNIEnv *__env, jclass clazz, jbyte param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jbyte __result = (jbyte)((uint8_t (*) (jbyte, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeUPV__B_3FJ(JNIEnv *__env, jclass clazz, jbyte param0, jfloatArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (*) (jbyte, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCCPV__SS_3SJ(JNIEnv *__env, jclass clazz, jshort param0, jshort param1, jshortArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (jshort, jshort, uintptr_t))(uintptr_t)__functionAddress)(param0, param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3DSJ(JNIEnv *__env, jclass clazz, jshort param0, jdoubleArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3FSJ(JNIEnv *__env, jclass clazz, jshort param0, jfloatArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3ISJ(JNIEnv *__env, jclass clazz, jshort param0, jintArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3JSJ(JNIEnv *__env, jclass clazz, jshort param0, jlongArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPCV__S_3SSJ(JNIEnv *__env, jclass clazz, jshort param0, jshortArray param1, jshort param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    ((void (*) (jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2);
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokeCPPV__S_3F_3FJ(JNIEnv *__env, jclass clazz, jshort param0, jfloatArray param1, jfloatArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param1, NULL);
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (jshort, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
    if (param1 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPV__JJ_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jshortArray param2, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, long, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)paramArray2);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV___3FIJJIJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jint param1, jlong param2, jlong param3, jint param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1, (uintptr_t)param2, (uintptr_t)param3, param4);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPV___3FZIJJIJ(JNIEnv *__env, jclass clazz, jfloatArray param0, jboolean param1, jint param2, jlong param3, jlong param4, jint param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray0 = param0 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param0, NULL);
    ((void (*) (uintptr_t, jboolean, jint, uintptr_t, uintptr_t, jint))(uintptr_t)__functionAddress)((uintptr_t)paramArray0, param1, param2, (uintptr_t)param3, (uintptr_t)param4, param5);
    if (param0 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param0, paramArray0, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3DSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jdoubleArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetDoubleArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseDoubleArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3FSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jfloatArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3ISJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jintArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3JSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jlongArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetLongArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseLongArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePCPCV__JS_3SSJ(JNIEnv *__env, jclass clazz, jlong param0, jshort param1, jshortArray param2, jshort param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray2 = param2 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param2, NULL);
    ((void (*) (uintptr_t, jshort, uintptr_t, jshort))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)paramArray2, param3);
    if (param2 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param2, paramArray2, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePNPPV__JJJ_3SJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jshortArray param3, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, long, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (long)param1, (uintptr_t)param2, (uintptr_t)paramArray3);
    if (param3 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JJJ_3FJJ(JNIEnv *__env, jclass clazz, jlong param0, jlong param1, jlong param2, jfloatArray param3, jlong param4, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4);
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__JIJ_3IJJJ(JNIEnv *__env, jclass clazz, jlong param0, jint param1, jlong param2, jintArray param3, jlong param4, jlong param5, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param3, NULL);
    ((void (*) (uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, param1, (uintptr_t)param2, (uintptr_t)paramArray3, (uintptr_t)param4, (uintptr_t)param5);
    if (param3 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__IJI_3F_3FJIJIZJ(JNIEnv *__env, jclass clazz, jint param0, jlong param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jlong param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)param1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5, param6, (uintptr_t)param7, param8, param9);
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__I_3II_3F_3FJI_3IIZJ(JNIEnv *__env, jclass clazz, jint param0, jintArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jintArray param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param7, NULL);
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, param8, param9);
    if (param7 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param7, paramArray7, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT void JNICALL Java_org_lwjgl_system_JNI_invokePPPPPV__I_3SI_3F_3FJI_3SIZJ(JNIEnv *__env, jclass clazz, jint param0, jshortArray param1, jint param2, jfloatArray param3, jfloatArray param4, jlong param5, jint param6, jshortArray param7, jint param8, jboolean param9, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param1, NULL);
    void *paramArray3 = param3 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param3, NULL);
    void *paramArray4 = param4 == NULL ? NULL : (*__env)->GetFloatArrayElements(__env, param4, NULL);
    void *paramArray7 = param7 == NULL ? NULL : (*__env)->GetShortArrayElements(__env, param7, NULL);
    ((void (*) (jint, uintptr_t, jint, uintptr_t, uintptr_t, uintptr_t, jint, uintptr_t, jint, jboolean))(uintptr_t)__functionAddress)(param0, (uintptr_t)paramArray1, param2, (uintptr_t)paramArray3, (uintptr_t)paramArray4, (uintptr_t)param5, param6, (uintptr_t)paramArray7, param8, param9);
    if (param7 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param7, paramArray7, 0); }
    if (param4 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param4, paramArray4, 0); }
    if (param3 != NULL) { (*__env)->ReleaseFloatArrayElements(__env, param3, paramArray3, 0); }
    if (param1 != NULL) { (*__env)->ReleaseShortArrayElements(__env, param1, paramArray1, 0); }
}
JNIEXPORT jint JNICALL Java_org_lwjgl_system_JNI_callPPI__J_3IJ(JNIEnv *__env, jclass clazz, jlong param0, jintArray param1, jlong __functionAddress) {
    UNUSED_PARAMS(__env, clazz)
    void *paramArray1 = param1 == NULL ? NULL : (*__env)->GetIntArrayElements(__env, param1, NULL);
    jint __result = ((jint (APIENTRY *) (uintptr_t, uintptr_t))(uintptr_t)__functionAddress)((uintptr_t)param0, (uintptr_t)paramArray1);
    if (param1 != NULL) { (*__env)->ReleaseIntArrayElements(__env, param1, paramArray1, 0); }
    return __result;
}

EXTERN_C_EXIT
