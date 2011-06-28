/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.desconto;


/**
 *
 * @author Emerson
 */
public class SemDesconto extends Desconto{
	
	private double desconto;
	
	public SemDesconto(double desconto){
		this.desconto = desconto;
	}
    
	public SemDesconto(){
		super();
	}
	
	public double desconto() {
        return desconto;
    }

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	
	

}
