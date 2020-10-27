/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: SAYANDIP PAUL
 *
 * Created on August 20, 2020, 6:04 PM
 */

#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "head.h"

/*
 * 
 */
JNIEXPORT jintArray JNICALL Java_jnisort_Jnisort_sorting
  (JNIEnv *env, jobject job, jintArray b, jint n) {

    int i,j,temp;
jint *p=(*env)->GetIntArrayElements(env,b,NULL);
for(i=0;i<n-1;i++)
{
for(j=i+1;j<n;j++)
{
if(p[i]>p[j])
{
temp=p[i];
p[i]=p[j];
p[j]=temp;
}
}
}
jintArray array=(*env)->NewIntArray(env,n);
(*env)->SetIntArrayRegion(env,array,0,n,p);
return array;
}

