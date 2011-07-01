/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.desconto;

/**
 *
 * @author Emerson
 */
public abstract class Desconto {
	
	private Long id;
	
    public abstract double desconto();
    
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	
	
}
