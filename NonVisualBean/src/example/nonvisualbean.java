/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example;

import java.util.Scanner;

/**
 *
 * @author SAYANDIP PAUL
 */
public class nonvisualbean {
    private String name;
    
    public String getName() {
        Scanner s=new Scanner(System.in);
        name=s.next();
        return name;
        
       
    }
    
    public void setName(String name){
        this.name=name;
        System.out.println(name);
    }
    
}
