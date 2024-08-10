#include <jni.h>
#include <stdio.h>
#include "native.h"

JNIEXPORT
void
JNICALL
Java_org_tr0nscendence_clipong_Main_sayHello(
	JNIEnv *env,
	jclass class
	)
{
	printf("Hello world !\n");
}
