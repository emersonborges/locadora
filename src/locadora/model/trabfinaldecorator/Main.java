/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.trabfinaldecorator;

import locadora.model.adicional.*;
import locadora.model.automovel.*;

/**
 *
 * @author a90633
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovel a= new Carro();
        a.setPreco(500);
        a = new GPS(a,50);
        a = new AssentoInfantil(a, 100,'m');
        a = new Seguro(a, 300, 't');
        double valor = a.getPreco();
        System.out.println(valor);

        //teste 2
         Automovel b = new Caminhao();
         b.setPreco(800);
         b = new tanqueCheio(b, 2.58, 200);
         b = new Seguro(b, 300, 'p');
         System.out.println(b.getPreco());
         //teste 3
         Automovel c = new Moto();
         c.setPreco(800);
         c = new tanqueCheio(c, 2.58, 20);
         c = new Seguro(c, 300, 'p');
         c = new GPS(c, 70);
         c = new AssentoInfantil(c, 50, 'g');
         System.out.println(c.getPreco());


    }

}
