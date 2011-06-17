/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.automovel;

import locadora.model.automovel.Automovel;

/**
 *
 * @author a90633
 */
public class Moto extends Automovel{

    private int cilindradas;
    
    public Moto(int cili){
    	this.cilindradas = cili;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }



}
