/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jni_app;

/**
 *
 * @author RAJAT SINGH
 */
public class JNI_App {
   
     private native void display();
     static{
         System.load("E:\\javaproject\\JNI_C_App\\output\\JNI_App.dll");
     }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JNI_App ja=new JNI_App();
        ja.display();
    }
    
}
