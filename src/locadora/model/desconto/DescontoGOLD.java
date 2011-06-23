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
	
	public static final double desconto = 10;
		
	public DescontoGOLD(){
		super();		
	}
    public double desconto() {
        return desconto;
    }

}
