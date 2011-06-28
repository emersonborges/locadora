package locadora.padroes.dao;

import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestDescontoDaoImpl {
	@Test
	public void inserirTest(){
		DaoFactory.getInstance().createDao("DescontoDao");
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
