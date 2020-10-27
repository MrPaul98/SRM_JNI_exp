/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author RAJAT SINGH
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    static
    {
        System.load("E:\\javaproject\\factorialc\\output\\fac.dll");
    }
    native int fact(int num);
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Factorial ob = new Factorial();
        System.out.println("The factorial of "+num+" is "+ob.fact(num));
    }
    
}
