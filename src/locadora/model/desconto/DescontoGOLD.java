/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.desconto;

/**
 *
 * @author Emerson
 */
public class DescontoGOLD extends Desconto{
	
	private double desconto;
	
	public DescontoGOLD(double desconto){
		this.desconto = desconto;
	}
		
	public DescontoGOLD(){
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

	@Override
	public String toString() {
		return "DescontoGOLD [id  "+getId()+" desconto=" + desconto + "]";
	}
    

}
