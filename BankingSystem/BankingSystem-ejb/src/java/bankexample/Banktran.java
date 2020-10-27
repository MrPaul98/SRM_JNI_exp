/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankexample;

import javax.ejb.Stateful;

/**
 *
 * @author SAYANDIP PAUL
 */
@Stateful
public class Banktran implements BanktranLocal {

    int Balance =1000;
    @Override
    public void deposit(int amount) {
        Balance = Balance+amount;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int withdraw(int amount) {
        
        Balance = Balance - amount;
        return Balance;
    }
    
}
