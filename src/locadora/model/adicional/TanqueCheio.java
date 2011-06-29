/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;
import locadora.model.automovel.*;

/**
 *
 * @author Rafael
 */
public class TanqueCheio extends Adicional {

    private int capacidade;
    private double preco;

    public TanqueCheio(){
    	super();
    }
    
    public TanqueCheio(Automovel a,double preco,int capacidade){
        this.setAutomovelDecorado(a);
        this.getAutomovelDecorado().addAdicionais(this);
        this.preco = preco;
        this.capacidade=capacidade;
        System.out.println("Tanque cheio adicionado, valor: "+ this.preco);
    }

     public double getPreco() {
        return preco + getAutomovelDecorado().getPreco();
    }

	

	

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
