/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.cliente;

import locadora.model.desconto.*;
import locadora.model.observer.*;


/**
 *
 * @author Emerson
 */
public class ClienteGOLD extends Cliente{

    public ClienteGOLD(){
        this.desconto = new DescontoGOLD();
    }

    @Override
    public void update(Subject s) {
    	System.out.println("Mandando email - cliente GOLD");
        this.setUpdateStatus("GOLD");
    }

}
