/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.adicional;


/**
 *
 * @author a90633
 */
public class AssentoInfantil extends Adicional{
     
     private Character tamanho;

     public AssentoInfantil(){
    	 super();
     }
     public enum Tamanho{
         P,M,G;
     }

    public AssentoInfantil(IAutomovelComponente a,double preco,char tamanho){
        this.setAutomovelDecorado(a);
       // this.getAutomovelDecorado().addAdicionais(this);
        setPreco(preco);
        this.tamanho = tamanho; 
        System.out.println("Assento Infantil adicionado, tamanho: " + this.tamanho.toString());
    }

	public Character getTamanho() {
		return tamanho;
	}

	public void setTamanho(Character tamanho) {
		this.tamanho = tamanho;
	}   
}
