package locadora.dao.veiculos;

import locadora.model.automovel.Moto;
import locadora.persistence.hibernate.MotoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestMotoDaoImpl {
	@Test
	public void inserirTest() throws Exception {
		MotoDaoImpl motoDaoImpl = (MotoDaoImpl) DaoFactory.getInstance().createDao("MotoDao");
		Moto  moto = new Moto();
		moto.setCilindradas(250);
		motoDaoImpl.inserir(moto);
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
