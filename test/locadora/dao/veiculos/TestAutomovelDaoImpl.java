package locadora.dao.veiculos;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.persistence.dao.hibernate.AutomovelDaoImpl;
import locadora.persistence.dao.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestAutomovelDaoImpl {
	
	@Test
	public void inserirTest(){
		
		AutomovelDaoImpl  automovelDaoImpl = (AutomovelDaoImpl) DaoFactory.getInstance().createDao("AutomovelDao");
		Automovel automovel = new Carro(2001, 2000);
		automovel.setCor("PRETO");		
		automovelDaoImpl.inserir(automovel);
	}
	@Test
	public void editarTest(){
		
	}
	@Test
	public void listarTest(){
		
	}
	@Test
	public void removerTest(){
		
	}
}
