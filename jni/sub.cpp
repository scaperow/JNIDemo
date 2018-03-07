#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <strings.h>

extern "C" {
JNIEXPORT jstring JNICALL Java_com_example_jnidemo_MainActivity_GetString(
		JNIEnv* env, jobject obj) {
	//String s=gcnew String();
	//com.example.jnidemo
	//Java_com_example_jnidemo_MainActivity_
	char* str;
	str = "Hello JNI,There is C++ Langugae";

	jstring jstrBuf = env->NewStringUTF(str);

	return jstrBuf;
}
}

