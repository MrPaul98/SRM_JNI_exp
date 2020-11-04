/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author SAYANDIP PAUL
 */
public class Student {
    
    String name;
String regno;
String gender;
String state;
int phy;
int che;
int mat;
int tot;
String status;
public Student(String name,String regno,String gender,String state,int phy,int che,int
mat,int tot,String status)
{
this.name=name;
this.regno=regno;
this.gender=gender;
this.state=state;
this.phy=phy;
this.che=che;
this.mat=mat;
this.tot=tot;
this.status=status;

}
public void print()

{
System.out.println("Name:"+name);
System.out.println("Reg no:"+regno);
System.out.println("Gender:"+gender);
System.out.println("State:"+state);
System.out.println("Physics:"+phy);
System.out.println("Chemistry:"+che);
System.out.println("maths:"+mat);
System.out.println("Total:"+tot);
System.out.println("Status:"+status);
}
}
