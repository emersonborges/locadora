/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;

import locadora.model.automovel.*;

/**
 *
 * @author a90633
 */
public abstract class Adicional extends Automovel {

    Automovel automovelDecorado;
    private String decricao;
    

    public String getDecricao() {
        return decricao;
    }

    public void setDecricao(String decricao) {
        this.decricao = decricao;
    }

    
    @Override
    public abstract double getPreco();

}
