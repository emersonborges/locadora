package locadora.persistence.hibernate;

import locadora.model.adicional.Adicional;
import locadora.model.adicional.GPS;
import locadora.model.adicional.Seguro;
import locadora.model.adicional.TanqueCheio;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestAdicional {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session sessao = MyHibernateSingleton.getInstance().openSession(); //Abrindo uma sess�o
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transa��o
        
   
        Automovel carro = new Carro(2011,20000);      
        carro.setChassi("Chassi");
        carro.setCor("Branco");
        carro.estaDisponivel();
        carro.setStatus("disponivel"); 
        carro.setPlaca("placa A");
        Adicional adicional = new GPS(carro, 10);
        
        Seguro seguro = new Seguro(carro, 20,'p');   
        TanqueCheio tanqueCheio = new TanqueCheio(carro, 30, 50);
        
        
        sessao.save(adicional);
        sessao.save(seguro);
        sessao.save(tanqueCheio);
         
        
        transaction.commit();
        sessao.close();
	}

}
