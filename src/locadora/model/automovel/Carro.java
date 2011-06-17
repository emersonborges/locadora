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
public class Carro extends Automovel {

    private boolean airbag;
    private boolean som;
    private boolean arcondicionado;
    private int nportas;

   

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public int getNportas() {
        return nportas;
    }

    public void setNportas(int nportas) {
        this.nportas = nportas;
    }

    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }



}
