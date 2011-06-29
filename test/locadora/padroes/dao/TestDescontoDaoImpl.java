package locadora.padroes.dao;

import locadora.model.desconto.Desconto;
import locadora.model.desconto.DescontoGOLD;
import locadora.model.desconto.DescontoVIP;
import locadora.persistence.hibernate.DescontoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestDescontoDaoImpl {
	@Test
	public void inserirTest() throws Exception{
		DescontoDaoImpl descontoDaoImpl = (DescontoDaoImpl) DaoFactory.getInstance().createDao("DescontoDao");
		DescontoVIP desconto = new DescontoVIP();
		desconto.setDesconto(10);
		descontoDaoImpl.inserir(desconto);
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
