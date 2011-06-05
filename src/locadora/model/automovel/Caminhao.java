/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.automovel;

import locadora.model.automovel.Automovel;

/**
 *
 * @author Rafael
 */
public class Caminhao extends Automovel{

    private float altura;
    private double carga;
    private float peso;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    

}
