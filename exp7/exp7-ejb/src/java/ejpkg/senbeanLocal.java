/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpkg;

import javax.ejb.Local;

/**
 *
 * @author SAYANDIP PAUL
 */
@Local
public interface senbeanLocal {

    void add(int amt);

    void remove(int amt);

    Integer check();
    
}
