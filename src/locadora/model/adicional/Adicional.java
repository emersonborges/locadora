/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;

import java.util.HashSet;
import java.util.Set;

import locadora.model.automovel.*;

/**
 *
 * @author a90633
 */
public abstract class Adicional extends Automovel {

	private Long id;   
	private Automovel automovelDecorado;    
    private String decricao;
    
    
  	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    
    @Override
    public abstract double getPreco();

	/**
	 * @param automovelDecorado the automovelDecorado to set
	 */
	public void setAutomovelDecorado(Automovel automovelDecorado) {
		this.automovelDecorado = automovelDecorado;
	}

	/**
	 * @return the automovelDecorado
	 */
	public Automovel getAutomovelDecorado() {
		return automovelDecorado;
	}

	@Override
	public String toString() {
		return "Adicional [id=" + id + ", decricao=" + decricao + "]";
	}
	
	
	
	

}
