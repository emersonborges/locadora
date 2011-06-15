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
public class ClienteNormal extends Cliente{

    public ClienteNormal(){
        this.desconto = new SemDesconto();
    }
    @Override
    public void update(Subject s) {
    	System.out.println("Mandando email - cliente Normal");
    	this.setUpdateStatus("NORMAL");
    }

}
