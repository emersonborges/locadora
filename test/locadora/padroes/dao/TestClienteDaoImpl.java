package locadora.padroes.dao;

import java.util.List;

import org.junit.Test;

import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.persistence.hibernate.ClienteDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import static org.junit.Assert.*;

public class TestClienteDaoImpl {

	
	@Test
	public void inserirTest() throws Exception{
		
		ClienteDaoImpl daoImpl = (ClienteDaoImpl) DaoFactory.getInstance().createDao("ClienteDao");
		assertNotNull(daoImpl);
		ClienteNormal  cliente = new ClienteNormal("Jefferson","Uberlândia");
		assertNotNull(cliente);
		daoImpl.inserir(cliente);
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
