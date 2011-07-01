package locadora.dao.adicionais;

import locadora.model.adicional.Seguro;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.persistence.dao.hibernate.SeguroDaoImpl;
import locadora.persistence.dao.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestSeguroDaoImpl {
	@Test
	public void inserirTest() throws Exception {
		 SeguroDaoImpl seguroDaoImpl = (SeguroDaoImpl) DaoFactory.getInstance().createDao("SeguroDao");		 
		 Automovel automovel = new Carro();
		 automovel.setId((long) 1);
		 Seguro seguro = new Seguro(automovel, 200,'A');
		 seguroDaoImpl.inserir(seguro);
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
