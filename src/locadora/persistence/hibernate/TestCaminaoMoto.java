package locadora.persistence.hibernate;

import locadora.model.automovel.Caminhao;
import locadora.model.automovel.Moto;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestCaminaoMoto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session sessao = MyHibernateSingleton.getInstance().openSession(); //Abrindo uma sess�o
        Transaction transaction = sessao.beginTransaction(); //Iniciando uma transa��o
        
        Caminhao caminhao = new Caminhao(2,200,1000);
        caminhao.setAno(2010);
        caminhao.setCapacidade(5000);
        caminhao.setChassi("Chassi");
        caminhao.setCodCategoria(0);
        caminhao.setConsumo(50);
        caminhao.setCor("azul");
        caminhao.setModelo(2);
        caminhao.setPlaca("Placa A");
        caminhao.setPreco(50000);
        caminhao.setCombustivel("gasolina");
        caminhao.setStatus("disponivel");
        
        Moto moto = new Moto(200);
        moto.setAno(2010);
        moto.setCapacidade(5000);
        moto.setChassi("Chassi");
        moto.setCodCategoria(0);
        moto.setConsumo(50);
        moto.setCor("Preta");
        moto.setModelo(2);
        moto.setPlaca("Placa B");
        moto.setPreco(50000);
        moto.setCombustivel("gasolina");
        moto.setStatus("disponivel");
        
        
        sessao.save(caminhao);
        sessao.save(moto);
        
        transaction.commit();
        sessao.close();
		
		

	}

}
