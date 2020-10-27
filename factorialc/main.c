/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: SAYANDIP PAUL
 *
 * Created on August 19, 2020, 11:03 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "head.h"
/*
 * 
 */
JNIEXPORT jint JNICALL Java_factorial_Factorial_fact
  (JNIEnv *env, jobject job, jint num) {
  jint result=1;
  
  while(num)
  {
        result*=num;
        num--;
  }
  
return result;
}

