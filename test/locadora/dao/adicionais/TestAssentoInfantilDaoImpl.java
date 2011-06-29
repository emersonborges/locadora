package locadora.dao.adicionais;

import locadora.model.adicional.AssentoInfantil;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.persistence.hibernate.AssentoInfantilDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestAssentoInfantilDaoImpl {
	@Test
	public void inserirTest() throws Exception {
			
			AssentoInfantilDaoImpl asDaoImpl = (AssentoInfantilDaoImpl) DaoFactory.getInstance().createDao("AssentoDao");
		    Automovel automovel = new Carro();
		    automovel.setId((long) 1);
			AssentoInfantil assentoInfantil = new AssentoInfantil(automovel, 30,'p');
			assentoInfantil.setDecricao("Assento Infantil");
			asDaoImpl.inserir(assentoInfantil);
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
