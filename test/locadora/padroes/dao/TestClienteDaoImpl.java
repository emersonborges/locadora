package locadora.padroes.dao;

import locadora.model.cliente.ClienteNormal;
import locadora.persistence.hibernate.ClienteDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestClienteDaoImpl {
	@Test
	public void inserirTest() throws Exception{
		ClienteDaoImpl clienteDaoImpl = (ClienteDaoImpl) DaoFactory.getInstance().createDao("ClienteDao");
		ClienteNormal clienteNormal = new ClienteNormal("Jefferson","UDI");
		clienteDaoImpl.inserir(clienteNormal);
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
