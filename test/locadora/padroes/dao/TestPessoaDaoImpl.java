package locadora.padroes.dao;

import java.util.List;

import org.junit.Test;

import locadora.model.Pessoa;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.persistence.hibernate.PessoaDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import static org.junit.Assert.*;

public class TestPessoaDaoImpl {

	
	@Test
	public void inserirTest() throws Exception{
		
		PessoaDaoImpl daoImpl = (PessoaDaoImpl) DaoFactory.getInstance().createDao("PessoaDao");
		assertNotNull(daoImpl);	    
		Pessoa clienteNormal = new ClienteNormal("Pedro","BH");
		daoImpl.inserir(clienteNormal);
	
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
