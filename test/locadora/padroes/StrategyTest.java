package locadora.padroes;

import junit.framework.TestCase;
import locadora.model.cliente.ClienteGOLD;
import locadora.model.cliente.ClienteNormal;
import locadora.model.cliente.ClienteVIP;
import locadora.model.desconto.Desconto;
import locadora.model.desconto.DescontoGOLD;
import locadora.model.desconto.DescontoVIP;
import locadora.model.desconto.SemDesconto;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StrategyTest extends TestCase {

	@Test
	public void testClienteGold(){
		ClienteGOLD clienteGOLD = new ClienteGOLD();
		assertNotNull(clienteGOLD);
		DescontoGOLD desconto = new DescontoGOLD();
		desconto.setDesconto(10);
		clienteGOLD.setDesconto(desconto);
		assertEquals(10.0,clienteGOLD.getDesconto().desconto());
	}	
	
	@Test
	public void testClienteVip(){
		ClienteVIP clienteVIP = new ClienteVIP(); 
		assertNotNull(clienteVIP);		
		DescontoVIP desconto = new DescontoVIP();
		desconto.setDesconto(20);
		clienteVIP.setDesconto(desconto);
		assertEquals(20.0,clienteVIP.getDesconto().desconto());
	}	
	
	@Test
	public void testClienteNormal(){
		ClienteNormal clienteNormal = new ClienteNormal();
		assertNotNull(clienteNormal);	
		SemDesconto desconto = new SemDesconto(0);
		clienteNormal.setDesconto(desconto);
		assertEquals(0.0,clienteNormal.getDesconto().desconto());
	}	

}
