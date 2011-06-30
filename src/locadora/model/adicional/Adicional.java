/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;


/**
 *
 * @author a90633
 */
public abstract class Adicional implements IAutomovelComponente {

	private Long id;   
	private IAutomovelComponente automovelDecorado;    
    private String descricao;
    private double preco;
    
  	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


    public String getDecricao() {
        return descricao;
    }

    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }    

	/**
	 * @param automovelDecorado the automovelDecorado to set
	 */
	public void setAutomovelDecorado(IAutomovelComponente automovelDecorado) {
		this.automovelDecorado = automovelDecorado;
	}

	/**
	 * @return the automovelDecorado
	 */
	public IAutomovelComponente getAutomovelDecorado() {
		return automovelDecorado;
	}

	@Override
	public String toString() {
		return "Adicional [id=" + id + ", decricao=" + descricao + "]";
	}
	
    @Override
    public double getPreco() {
        return this.preco + getAutomovelDecorado().getPreco();
    }

    public void setPrecoTotal(double p){
    	this.preco = p;
    }
    
    public double getPrecoAdicional() {
        return this.preco;
    }
    
    public void setPreco(double p){
    	this.preco = p;
    }
	
    
    
	
	

}
