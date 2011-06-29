package locadora.padroes;
import locadora.model.automovel.Automovel.Status;
import locadora.model.automovel.Carro;
import locadora.model.cliente.ClienteGOLD;
import locadora.model.cliente.ClienteNormal;
import locadora.model.cliente.ClienteVIP;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;





public class ObserverTest {
	
	private Carro carro;
	private ClienteNormal cliente;
	
	@Before
	public void setUp(){
		carro = new Carro();
		cliente = new ClienteNormal();
		
	}

	
	@Test
	public void addObserverInClient(){	
		carro.registra(cliente);		
		assertEquals(carro.getObservers().size(), 1);
	}
	
	@Test
	public void clientReceivedNotification(){
		carro.registra(cliente);
		carro.setStatus("manutencao");
		assertEquals("NORMAL", cliente.getUpdateStatus());
	}
	
	@Test
	public void addMoreThanOneObserver(){
		ClienteGOLD gold = new ClienteGOLD();
		ClienteVIP vip = new ClienteVIP();
		
		carro.registra(gold);
		carro.registra(vip);
		carro.registra(cliente);
		
		assertEquals(carro.getObservers().size(), 3);			
	}
	
	@Test
	public void clientsReceivedNotification(){
		ClienteGOLD gold = new ClienteGOLD();
		ClienteVIP vip = new ClienteVIP();
		
		carro.registra(gold);
		carro.registra(vip);
		carro.registra(cliente);
	
		carro.setStatus("disponivel");
	
		String[] expectedStatus = {"GOLD", "VIP", "NORMAL"};
		String[] status = new String[3];
		status[0] = gold.getUpdateStatus();
		status[1] = vip.getUpdateStatus();
		status[2] = cliente.getUpdateStatus();
			
		assertArrayEquals(expectedStatus, status);
	}
	
	
}
