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

	private Desconto desconto;
	
    public ClienteGOLD(){
        this.setDesconto(new DescontoGOLD());
    }

    @Override
    public void update(Subject s) {
    	System.out.println("Mandando email - cliente GOLD");
        this.setUpdateStatus("GOLD");
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
