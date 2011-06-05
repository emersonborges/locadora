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
    private String descircao;

    public String getDescircao() {
        return descircao;
    }

    public void setDescircao(String descircao) {
        this.descircao = descircao;
    }

    public GPS(Automovel a,double preco){
        this.automovelDecorado = a;
        this.automovelDecorado.addAdicionais(this);
        this.preco=preco;
        this.descircao = "GPS automotivo!";

        System.out.println("GPS adicionado, valor: "+ this.preco+", descricao : "+ this.descircao);
    }

    @Override
    public double getPreco() {
        return this.preco + automovelDecorado.getPreco();
    }

    @Override
    public void setPreco(double preco){
        this.preco=preco;
    }

}
