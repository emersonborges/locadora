package locadora.padroes.dao;

import java.util.List;

import locadora.model.adicional.Adicional;
import locadora.model.adicional.GPS;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.persistence.hibernate.AdicionalDaoImpl;
import locadora.persistence.hibernate.MyHibernateSingleton;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAdicionalDaoImpl {

	
/*	@BeforeClass
	public void setUp() throws Exception {
		session = MyHibernateSingleton.getInstance().openSession();
		transaction = session.beginTransaction();
	}

	@AfterClass
	public void tearDown() throws Exception {
		transaction.commit();
		session.close();
	}*/
	
	@Test
	public void testInserir() throws Exception{
		
		Automovel carro = new Carro(2011,20000);   
		carro.setId((long) 1);
        carro.setChassi("Chassi");
        carro.setCor("Branco");
        carro.estaDisponivel();
        carro.setStatus("disponivel"); 
        carro.setPlaca("placa A");
        
        Adicional adicional = new GPS(carro, 1023);
        adicional.setDecricao("GPS");
        
        
		AdicionalDaoImpl adicionalDaoImpl = (AdicionalDaoImpl) DaoFactory.getInstance().createDao("AdicionalDao");
		adicionalDaoImpl.inserir(adicional);
		
		
	}
	@Test
	public void testEditar(){
		
	}
	@Test
	public void testListAll(){
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();
		AdicionalDaoImpl adicionalDaoImpl = new AdicionalDaoImpl();
		List list = adicionalDaoImpl.listar();
		assertNotNull(list);
	}
	@Test 
	public void testRemove(){
		
	}
	@Test
	public void testRetrieveAdicional(){
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();
		
		transaction.commit();
		session.close();
		
		
	}
	
	
}
