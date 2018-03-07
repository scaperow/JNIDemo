#include <jni.h>
#include <stdio.h>
#include <stdlib.h>
#include <strings.h>
JNIEXPORT jstring JNICALL Java_com_example_jnidemo_MainActivity_GetCString(
		JNIEnv* env, jobject obj) {
	//String s=gcnew String();
	//com.example.jnidemo
	//Java_com_example_jnidemo_MainActivity_
	char* str;
	str = "Hello JNI,There is C Langugae";

	return  (*env)->NewStringUTF(env, (char *)str);

}

