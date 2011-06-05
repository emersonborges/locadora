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
public class ClienteVIP extends Cliente{

    public ClienteVIP(){
        this.desconto = new DescontoVIP();
    }

    @Override
    public void update(Subject s) {
        System.out.println("mandando email pro cliente vip!");
    }

}
