/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.ejb.Stateful;

/**
 *
 * @author SAYANDIP PAUL
 */
@Stateful
public class StateFullSessionBean implements StateFullSessionBeanRemote {

    private int val = 1001;
    @Override
    public int nextval() {
        
        return val++;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
