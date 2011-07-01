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
	
	private Desconto desconto;
	
	public ClienteNormal(String n, String c){
		setNome(n);
		setCidade(c);
	}
	
    public ClienteNormal(){
         super();
    }
    @Override
    public void update(Subject s) {
    	System.out.println("Mandando email - cliente Normal");
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
