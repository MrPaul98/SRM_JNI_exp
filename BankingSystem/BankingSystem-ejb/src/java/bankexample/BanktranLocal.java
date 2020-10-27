/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexample;

import javax.ejb.Local;

/**
 *
 * @author SAYANDIP PAUL
 */
@Local
public interface BanktranLocal {

    void deposit(int amount);

    int withdraw(int amount);
    
}
