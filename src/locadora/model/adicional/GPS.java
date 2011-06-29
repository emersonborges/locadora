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
 
    
    public GPS(){
    	super();
    }

    public GPS(Automovel a,double preco){
        this.setAutomovelDecorado(a);
        this.getAutomovelDecorado().addAdicionais(this);
        this.preco=preco;
        setDecricao("GPS!");
        System.out.println("GPS adicionado, valor: "+ this.preco+", descricao : "+ getDecricao());
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
