/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: RAJAT SINGH
 *
 * Created on August 9, 2020, 1:37 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "head.h"
#include <string.h>
/*
 * 
 */
JNIEXPORT void JNICALL Java_jni_1app_JNI_1App_display
  (JNIEnv *env, jobject obj)
{
    printf("hello world");
}

