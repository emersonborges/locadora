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
    private char tipo;
    private String descricao;

    public Seguro(){
    	super();
    }
    
    public enum Tipo{
        parcial,total;
    }  
        

    public Seguro(Automovel a,double preco, char tipo){
        this.setAutomovelDecorado(a);
        this.getAutomovelDecorado().addAdicionais(this);
        this.preco = preco;
       /*
        if(tipo=='p')
            this.tipo = Tipo.parcial;
        else this.tipo = Tipo.total;
        
        */
        this.tipo = tipo;

        System.out.println("Seguro adicionado do tipo : " + this.getTipo());
    }

    @Override
    public double getPreco() {
             return this.preco + getAutomovelDecorado().getPreco();
    }
   

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public char getTipo() {
		return tipo;
	}

	/**
	 * @param descricao the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}
    

}
