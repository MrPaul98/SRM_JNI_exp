/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: SAYANDIP PAUL
 *
 * Created on August 21, 2020, 12:21 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "head.h"

/*
 * 
 */
JNIEXPORT jint JNICALL Java_exceptiondemo_Exceptiondemo_divide
  (JNIEnv *env, jobject job, jint a, jint b) 
        {
if(b==0)
{
jclass jc=(*env)->FindClass(env,"java/lang/ArithmeticException");
(*env)->ThrowNew(env,jc,"Thrown from c");
}
else
{
return a/b;
}

    
}

