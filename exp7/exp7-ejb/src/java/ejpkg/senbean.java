/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpkg;

import javax.ejb.Stateful;

/**
 *
 * @author SAYANDIP PAUL
 */
@Stateful
public class senbean implements senbeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    private int cost;

    public senbean() {
        cost=0;
    }

    @Override
    public void add(int amt) {
        cost =cost + amt;
    }

    @Override
    public void remove(int amt) {
        cost = cost - amt;
    }

    @Override
    public Integer check() {
        return cost;
    }
    
    
    
}
