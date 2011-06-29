package locadora.dao.clientes;

import java.util.Iterator;
import java.util.List;

import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.model.desconto.SemDesconto;
import locadora.persistence.hibernate.ClienteDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestClienteDaoImpl {
	
	private ClienteDaoImpl clienteDaoImpl;
	@Before
	public void setUp(){
		clienteDaoImpl = (ClienteDaoImpl) DaoFactory.getInstance().createDao("ClienteDao");
	}
	@After
	public void tearDown(){
		clienteDaoImpl = null;
	}
	
	@Test
	public void inserirTest() throws Exception{		
		ClienteNormal clienteNormal = new ClienteNormal("Jefferson","UDI");
		SemDesconto desconto = new SemDesconto();
		desconto.setId((long) 1);
		clienteDaoImpl.inserir(clienteNormal);
	}
	@Test
	public void editarTest() throws Exception{
		Cliente cliente = new ClienteNormal();
		cliente.setId((long) 1);
		cliente.setNome("JUNIT4");
		clienteDaoImpl.editar(cliente);
	}
	@Test
	public void listarTest() throws Exception{
		List<Cliente> clientes = clienteDaoImpl.listar();
		assertNotNull(clientes);
		Iterator<Cliente> iterator = clientes.iterator();
		while(iterator.hasNext()){
			Cliente cliente = (Cliente) iterator.next();
			System.out.println(cliente.toString());
		}
	}
	@Test
	public void removerTest() throws Exception{
		Cliente cliente = new ClienteNormal();
		cliente.setId((long) 16);
		clienteDaoImpl.remover(cliente);		
	}
}
