/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.desconto;


/**
 *
 * @author Emerson
 */
public class SemDesconto implements Desconto{
	
	public static final double desconto = 0;
    
	public SemDesconto(){
		super();
	}
	
	public double desconto() {
        return desconto;
    }

}
