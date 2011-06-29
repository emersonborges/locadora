package locadora.padroes.dao;

import locadora.model.automovel.Carro;
import locadora.persistence.hibernate.CarroDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestCarroDaoImpl {
	@Test
	public void inserirTest() throws Exception {
		
		CarroDaoImpl carroDaoImpl = (CarroDaoImpl) DaoFactory.getInstance().createDao("CarroDao");
		Carro carro = new Carro(2011, 50000);
		carroDaoImpl.inserir(carro);
	}

	@Test
	public void editarTest() {

	}

	@Test
	public void listarTest() {

	}

	@Test
	public void removerTest() {

	}
}
