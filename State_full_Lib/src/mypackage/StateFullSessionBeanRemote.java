/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.ejb.Remote;

/**
 *
 * @author SAYANDIP PAUL
 */
@Remote
public interface StateFullSessionBeanRemote {

    int nextval();
    
}
