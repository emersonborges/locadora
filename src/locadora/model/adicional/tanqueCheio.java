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
public class tanqueCheio extends Adicional {

    private double capacidade;
    private double preco;

     public tanqueCheio(Automovel a,double preco,double capacidade){
        this.automovelDecorado = a;
        this.automovelDecorado.addAdicionais(this);
        this.preco = preco;
        this.capacidade=capacidade;

        System.out.println("Tanque cheio adicionado, valor: "+ this.preco);

    }

     public double getPreco() {
        return preco + automovelDecorado.getPreco();
    }
/*
    public double getTotal(){
        return preco*capacidade;
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
*/

}
