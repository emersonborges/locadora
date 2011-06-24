/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.cliente;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import locadora.model.Pessoa;
import locadora.model.desconto.*;
import locadora.model.observer.*;

/**
 *
 * @author Emerson
 */

public abstract class Cliente extends Pessoa{
	    
	
	private String updateStatus;
	private Date clienteDesde; // data de cadastro do cliente
	
	public String getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}	
	public Cliente(){
		super();
	}

	/**
	 * @param clienteDesde the clienteDesde to set
	 */
	public void setClienteDesde(Date clienteDesde) {
		this.clienteDesde = clienteDesde;
	}

	/**
	 * @return the clienteDesde
	 */
	public Date getClienteDesde() {
		return clienteDesde;
	}
	
	
}
