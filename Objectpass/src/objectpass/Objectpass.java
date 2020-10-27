/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectpass;

/**
 *
 * @author RAJAT SINGH
 */
public class Objectpass {

    /**
     * @param args the command line arguments
     */
    static
    {
        System.load("E:\\javaproject\\ObjectpassC\\objectpassc.dll");
    }
    public static void main(String[] args) {
        // TODO code application logic here
          SimpleClass sc=new SimpleClass();
          sc.count=10;
          sc.increment();
          System.out.println("Count="+sc.count);
          modify(sc);
          System.out.println("Count="+sc.count);
    }
    private static native void modify(SimpleClass sc);
}
