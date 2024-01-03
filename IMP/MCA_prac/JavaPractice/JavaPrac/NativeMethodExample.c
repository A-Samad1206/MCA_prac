#include <jni.h>
#include <stdio.h>

JNIEXPORT void JNICALL Java_NativeMethodExample_callNativeMethod(JNIEnv *env, jobject obj) {
    printf("Native method: Performing native operation\n");
    // Perform native operation here
}
