/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptiondemo;
import java.util.Scanner;
/* * @author RAJAT SINGH
 */
public class Exceptiondemo {
 /* * @param args the command line arguments
     */
    static
    {
        System.load("E:\\javaproject\\exceptiondemoC\\out\\exceptiondemoc.dll");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c;
Exceptiondemo ed=new Exceptiondemo();
try
{
c=ed.divide(a, b);
System.out.println("c="+ c);
}
catch(Exception e)
{
System.out.println("Exception Occurred:"+e);
}
    }
    private native int divide(int a,int b);
}
