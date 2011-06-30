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
     private Character tamanho;

     public AssentoInfantil(){
    	 super();
     }
     public enum Tamanho{
         P,M,G;
     }

    public AssentoInfantil(Automovel a,double preco,char tamanho){
        this.setAutomovelDecorado(a);
        this.getAutomovelDecorado().addAdicionais(this);
        this.preco = preco;
        this.tamanho = tamanho; 
        System.out.println("Assento Infantil adicionado, tamanho: " + this.tamanho.toString());
    }

    public double getPreco() {
        return this.preco + getAutomovelDecorado().getPreco();
    }

	public Character getTamanho() {
		return tamanho;
	}

	public void setTamanho(Character tamanho) {
		this.tamanho = tamanho;
	}

	public void setPreco(double preco) {
		this.preco = preco;
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
