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
public class GPS extends Adicional{

    private double preco;
    private String descricao;
    
    

    public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescircao() {
        return descricao;
    }

    public void setDescircao(String descircao) {
        this.descricao = descircao;
    }

    public GPS(Automovel a,double preco){
        this.setAutomovelDecorado(a);
        this.getAutomovelDecorado().addAdicionais(this);
        this.preco=preco;
        this.descricao = "GPS automotivo!";

        System.out.println("GPS adicionado, valor: "+ this.preco+", descricao : "+ this.descricao);
    }

    @Override
    public double getPreco() {
        return this.preco + getAutomovelDecorado().getPreco();
    }

    @Override
    public void setPreco(double preco){
        this.preco=preco;
    }

}
