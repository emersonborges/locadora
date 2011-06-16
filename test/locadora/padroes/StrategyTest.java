package locadora.padroes;

import junit.framework.TestCase;
import locadora.model.cliente.ClienteGOLD;
import locadora.model.cliente.ClienteNormal;
import locadora.model.cliente.ClienteVIP;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StrategyTest extends TestCase {

	@Test
	public void testClienteGold(){
		ClienteGOLD clienteGOLD = new ClienteGOLD();
		assertNotNull(clienteGOLD);
		System.out.println(clienteGOLD.desconto());
		assertEquals(10.0,clienteGOLD.desconto());
	}	
	
	@Test
	public void testClienteVip(){
		ClienteVIP clienteVIP = new ClienteVIP(); 
		assertNotNull(clienteVIP);		
		assertEquals(20.0,clienteVIP.desconto());
	}	
	
	@Test
	public void testClienteNormal(){
		ClienteNormal clienteNormal = new ClienteNormal();
		assertNotNull(clienteNormal);		
		assertEquals(0.0,clienteNormal.desconto());
	}	

}
