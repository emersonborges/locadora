package locadora.padroes.dao;

import locadora.model.Locacao;
import locadora.persistence.hibernate.LocacaoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestLocacaoDaoImpl {
	@Test
	public void inserirTest(){
		LocacaoDaoImpl locacaoDaoImpl = (LocacaoDaoImpl) DaoFactory.getInstance().createDao("LocacaoDao");
		
		Locacao locacao = new Locacao();
		//locacaoDaoImpl.inserir(locacao);
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
