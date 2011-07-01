/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.desconto;

/**
 *
 * @author Emerson
 */
public class DescontoVIP extends Desconto{
	
	private double desconto;
	
	public DescontoVIP(double desconto){
		this.desconto = desconto;
	}
	
	public DescontoVIP(){
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
