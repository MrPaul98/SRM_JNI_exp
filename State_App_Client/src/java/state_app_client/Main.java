/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state_app_client;

import javax.ejb.EJB;
import mypackage.StateFullSessionBeanRemote;

/**
 *
 * @author SAYANDIP PAUL
 */
public class Main {

    @EJB
    private static StateFullSessionBeanRemote stateFullSessionBean1;
    @EJB
    private static StateFullSessionBeanRemote stateFullSessionBean2;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(stateFullSessionBean1.nextval());
        System.out.println(stateFullSessionBean1.nextval());
        System.out.println(stateFullSessionBean2.nextval());
        System.out.println(stateFullSessionBean2.nextval());
    }
    
}
