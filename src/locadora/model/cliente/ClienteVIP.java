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
	
	private Desconto desconto;
	
    public ClienteVIP(){
        this.setDesconto(new DescontoVIP());
    }

    @Override
    public void update(Subject s) {
    	System.out.println("Mandando email - cliente VIP");
    	this.setUpdateStatus("VIP");
    }

	/**
	 * @param desconto the desconto to set
	 */
	public void setDesconto(Desconto desconto) {
		this.desconto = desconto;
	}

	/**
	 * @return the desconto
	 */
	public Desconto getDesconto() {
		return desconto;
	}

}
