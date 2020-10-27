/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: SAYANDIP PAUL
 *
 * Created on August 13, 2020, 3:43 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "head.h"
/*
 * 
 */
JNIEXPORT void JNICALL Java_objectpass_Objectpass_modify
  (JNIEnv *env, jclass jc, jobject job) {
   
    jclass jcls=(*env)->GetObjectClass(env,job);
    jfieldID fid=(*env)->GetFieldID(env,jcls,"count","I");
    jint num=(*env)->GetIntField(env,job,fid);
    num=100;
    (*env)->SetIntField(env,job,fid,num);
    
}

