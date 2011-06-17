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
	    
	
	private String cidade;
	protected Desconto desconto;
	private String updateStatus;
	
	
    public double desconto(){
        return this.desconto.desconto();
    }
	
    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

	public String getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCidade() {
		return cidade;
	}	
}
