package locadora.dao.veiculos;

import locadora.model.automovel.Caminhao;
import locadora.persistence.hibernate.CaminhaoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestCaminhaoDaoImpl {
	@Test
	public void inserirTest() throws Exception {
		
		CaminhaoDaoImpl  caminhaoDaoImpl = (CaminhaoDaoImpl) DaoFactory.getInstance().createDao("CaminhaoDao");
		Caminhao caminhao = new Caminhao(2, 1000, 5000);
		caminhaoDaoImpl.inserir(caminhao);
		
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
