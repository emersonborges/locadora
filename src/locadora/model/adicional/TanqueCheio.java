/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;

/**
 *
 * @author Rafael
 */
public class TanqueCheio extends Adicional {

    private int capacidade;
    

    public TanqueCheio(){
    	super();
    }
    
    public TanqueCheio(IAutomovelComponente a,double preco,int capacidade){
        this.setAutomovelDecorado(a);
        //this.getAutomovelDecorado().addAdicionais(this);
        setPreco(preco);
        this.capacidade=capacidade;
        System.out.println("Tanque cheio adicionado, valor: "+ getPreco());
    }

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
}
