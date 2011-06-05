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
public class AssentoInfantil extends Adicional{

     private double preco;
     private Enum<Tamanho> tamanho;


     public enum Tamanho{
         P,M,G;
     }

     public void setTamanho(char tamanho){

        if(tamanho=='p')
            this.tamanho=Tamanho.P;
        else if (tamanho=='m')
            this.tamanho=Tamanho.M;
        else if (tamanho=='g')
            this.tamanho=Tamanho.G;
    }

    public AssentoInfantil(Automovel a,double preco,char tamanho){
        this.automovelDecorado = a;
        this.automovelDecorado.addAdicionais(this);
        this.preco = preco;
         if(tamanho=='p')
            this.tamanho=Tamanho.P;
        else if (tamanho=='m')
            this.tamanho=Tamanho.M;
        else if (tamanho=='g')
            this.tamanho=Tamanho.G;
        System.out.println("Assento Infantil adicionado, tamanho: " + this.tamanho.toString());
    }

    public double getPreco() {
        return this.preco + automovelDecorado.getPreco();
    }

    /*@Override

    @Override
    public void setPreco(double preco){
        this.preco=preco;
    }

    public String getTamanho(){
        return this.tamanho.toString();
    }*/

}
