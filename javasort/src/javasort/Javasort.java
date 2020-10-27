/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasort;

import java.util.Scanner;

/**
 *
 * @author VIRENDRA SINGH RATHORE
 */
public class Javasort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final long startTime = System.currentTimeMillis();
                Scanner in = new Scanner(System.in);
      //  int a=in.nextInt();
        int arr[]=new int[]{1,2,3,4,5,6,14,15,16,17,18,19,20,7,8,9,10,11,12,13}; 
       for(int k=0;k<arr.length;k++)
        {
            for(int j=k+1;j<arr.length;j++)
            {
                int temp;
                if(arr[k]>arr[j])
                {
                   temp= arr[k];
                   arr[k]=arr[j];
                   arr[j]=temp;
                }
            }
        } 
       
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " " );
        }System.out.println();
        final long endTime = System.currentTimeMillis();
        System.out.println("The time taken to run the program is " + (endTime-startTime) + "s");
    }
    
}
