/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package annotation;

/**
 *
 * @author SAYANDIP PAUL
 */
public class AnnotationB extends AnnotationA{
     
    @Override
    void show()
    {
        System.out.println("hello this is AnnotationB class");
    }
    @Deprecated
    void Show()
    {
        System.out.println("This function cannot be used");
    }
    
}
