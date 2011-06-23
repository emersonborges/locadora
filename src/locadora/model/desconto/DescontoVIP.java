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
	
	public static final double desconto = 20;
	
	public DescontoVIP(){
		super();
	}

    public double desconto() {
        return desconto;
    }

}
