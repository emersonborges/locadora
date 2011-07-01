/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;


/**
 *
 * @author a90633
 */
public class GPS extends Adicional{
	
	private String marca;
    
    public GPS(){
    	super();
    }

    public GPS(IAutomovelComponente a,double preco){
        this.setAutomovelDecorado(a);
       // this.getAutomovelDecorado().addAdicionais(this);
        setPreco(preco);
        setDecricao("GPS!");
        System.out.println("GPS adicionado, valor: "+ getPreco()+", descricao : "+ getDecricao());
    }

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


    

}
