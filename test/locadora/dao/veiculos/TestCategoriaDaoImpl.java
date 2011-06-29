package locadora.dao.veiculos;

import java.util.HashSet;
import java.util.Set;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.model.automovel.Categoria;
import locadora.persistence.hibernate.CategoriaDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestCategoriaDaoImpl{
	
	@Test
	public void inserirTest() throws Exception {
		
		CategoriaDaoImpl categoriaDaoImpl = (CategoriaDaoImpl) DaoFactory.getInstance().createDao("CategoriaDao");
		Categoria categoria = new Categoria();
		categoria.setPrecoDiario(10);
		categoria.setPrecoMensal(20);
		categoria.setPrecoSemanal(15);
		Set<Automovel> automoveis = new HashSet<Automovel>();
		Automovel automovel = new Carro();
		automovel.setId((long) 1);
		automoveis.add(automovel);
		categoria.setQuantidade((long) automoveis.size());
		categoria.setAutomoveis(automoveis);
		categoriaDaoImpl.inserir(categoria);
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
