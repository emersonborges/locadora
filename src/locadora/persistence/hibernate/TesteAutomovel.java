package locadora.persistence.hibernate;

import org.hibernate.*;
import locadora.model.automovel.Carro;

public class TesteAutomovel {

    public static void main(String[] args) {
        
    	Session sessao = MyHibernateSingleton.getInstance().openSession(); //Abrindo uma sess�o
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transa��o
        
     //   Automovel astra = FactoryChevrolet.getInstance().createAutomovel("Astra");
        
        Carro carro = new Carro(2011,20000);      
        carro.setChassi("Chassi");
        carro.setCor("Branco");
        carro.estaDisponivel();
        carro.setStatus("disponivel"); 
        carro.setPlaca("placa A");
                
        sessao.save(carro);
        
        transaction.commit(); //Finalizando a transa��o                
        sessao.close(); //Fechando a sess�o
    }
}