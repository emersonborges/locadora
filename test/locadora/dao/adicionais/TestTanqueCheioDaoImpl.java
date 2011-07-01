package locadora.dao.adicionais;

import locadora.model.adicional.TanqueCheio;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.persistence.dao.hibernate.TanqueCheioDaoImpl;
import locadora.persistence.dao.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestTanqueCheioDaoImpl {
	@Test
	public void inserirTest() throws Exception {
		 TanqueCheioDaoImpl  daoImpl = (TanqueCheioDaoImpl) DaoFactory.getInstance().createDao("TanqueCheioDao");
		 Automovel automovel = new Carro();
		 automovel.setId((long) 1);
		 TanqueCheio cheio = new TanqueCheio(automovel, 60, 50);
		 cheio.setDecricao("TanqueCheio");
		 daoImpl.inserir(cheio);
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
