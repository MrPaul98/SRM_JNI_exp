/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jnisort;
import java.io.*;
import java.util.*;
/**
 *
 * @author RAJAT SINGH
 */
public class Jnisort {
static
{
    System.load("E:\\javaproject\\jnisortc\\out\\jnisortc.dll");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final long startTime = System.currentTimeMillis();
        
        Scanner s=new Scanner(System.in);

int n;
n=s.nextInt();
int[] b=new int[]{2,1,3,4,5,6,8,7,9,11,20,13,14,16,15,17,19,18,10};
int[] c=new int[20];
//for(int i=0;i<n;i++)
//b[i]=s.nextInt();
Jnisort js=new Jnisort();
c=js.sorting(b,n);
// TODO code application logic here
for(int i=0;i<n;i++)
System.out.print(c[i] + " ");
System.out.println();
final long endTime = System.currentTimeMillis();
        System.out.println("The time taken to run the program is " + (endTime-startTime) + "s");

}
private native int[] sorting(int[] b,int n);
    
    
}
