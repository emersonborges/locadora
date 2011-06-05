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
public class Seguro extends Adicional{

    private double preco;
    private Enum<Tipo> tipo;

    public enum Tipo{
        parcial,total;
    }

    public Seguro(Automovel a,double preco, char tipo){
        this.automovelDecorado = a;
        this.automovelDecorado.addAdicionais(this);
        this.preco = preco;
        if(tipo=='p')
            this.tipo = Tipo.parcial;
        else this.tipo = Tipo.total;

        System.out.println("Seguro adicionado do tipo : " + this.getTipo());
    }

    @Override
    public double getPreco() {
             return this.preco + automovelDecorado.getPreco();
    }
/*
    @Override
    public void setPreco(double preco){
        this.preco=preco;
    }

    public void setTipo(int tipo){

        if(tipo==2)
            this.tipo=Tipo.total;
        else if(tipo==1)
            this.tipo=Tipo.parcial;
    }
*/
    public String getTipo(){
        return this.tipo.toString();
    }

}
