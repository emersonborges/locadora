package locadora.padroes.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import locadora.model.Pessoa;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.model.desconto.SemDesconto;
import locadora.persistence.hibernate.MyHibernateSingleton;
import locadora.persistence.hibernate.ClienteDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import static org.junit.Assert.*;

public class TestPessoaDaoImpl {

	
	@Test
	public void inserirTest() throws Exception{
		
	
	
		
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();
		
		ClienteNormal clienteNormal = new ClienteNormal("Pedro","BH");
		clienteNormal.setCep("38408064");
		
		SemDesconto semDesconto = new SemDesconto(2);
		
		session.save(semDesconto);
		
		clienteNormal.setDesconto(semDesconto);
		
		
		session.save(clienteNormal);
		transaction.commit();
		session.close();
	
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
