/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;

/**
 *
 * @author a90633
 */
public class Seguro extends Adicional{

    private char tipo;

    public Seguro(){
    	super();
    }
    
    public enum Tipo{
        parcial,total;
    }  
        

    public Seguro(IAutomovelComponente a,double preco, char tipo){
        this.setAutomovelDecorado(a);
      //  this.getAutomovelDecorado().addAdicionais(this);
        setPreco(preco);
        this.tipo = tipo;
        System.out.println("Seguro adicionado do tipo : " + this.getTipo());
    }


	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public char getTipo() {
		return tipo;
	}

	
    

}
