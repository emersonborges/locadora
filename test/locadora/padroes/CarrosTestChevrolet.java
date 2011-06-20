package locadora.padroes;

import locadora.model.automovel.Automovel.Status;
import locadora.model.automovel.Carro;
import locadora.model.factory.FactoryAutomovel;
import locadora.model.factory.FactoryChevrolet;
import locadora.model.factory.FactoryFiat;
import locadora.model.factory.FactoryVW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class CarrosTestChevrolet {
	

	FactoryAutomovel factoryChevrolet;
	
	@Before
	public void setUp() throws Exception {	
		factoryChevrolet = FactoryChevrolet.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		factoryChevrolet = null;
	}
	
	@Test
	public void testAstra(){
		Carro astra = (Carro) factoryChevrolet.createAutomovel("Astra");
		assertNotNull(astra);
		assertEquals(2009, astra.getAno());
		assertEquals(25000, astra.getPreco(), 0);				
		assertEquals("alugado", astra.getStatus());
		astra.setStatus("disponivel");
		assertEquals("disponivel", astra.getStatus());
	}
	
	@Test
	public void testCelta(){
		Carro celta = (Carro) factoryChevrolet.createAutomovel("Celta");
		assertNotNull(celta);
		assertEquals(2009, celta.getAno());
		assertEquals(10000, celta.getPreco(), 0);				
		assertEquals("alugado", celta.getStatus());
		celta.setStatus("disponivel");
		assertEquals("disponivel", celta.getStatus());
	}
	
	@Test
	public void testMeriva(){
		Carro meriva = (Carro) factoryChevrolet.createAutomovel("Meriva");
		assertNotNull(meriva);
		assertEquals(2009, meriva.getAno());
		assertEquals(32000, meriva.getPreco(), 0);				
		assertEquals("alugado", meriva.getStatus());
		meriva.setStatus("disponivel");
		assertEquals("disponivel", meriva.getStatus());
	}
	
	@Test
	public void testMontana(){
		Carro montana = (Carro) factoryChevrolet.createAutomovel("Montana");
		assertNotNull(montana);
		assertEquals(2007, montana.getAno());
		assertEquals(25000, montana.getPreco(), 0);				
		assertEquals("alugado", montana.getStatus());
		montana.setStatus("disponivel");
		assertEquals("disponivel", montana.getStatus());
	}
	
	@Test
	public void testZafira(){
		Carro zafira = (Carro) factoryChevrolet.createAutomovel("Zafira");
		assertNotNull(zafira);
		assertEquals(2008, zafira.getAno());
		assertEquals(22000, zafira.getPreco(), 0);				
		assertEquals("manutencao", zafira.getStatus());
		zafira.setStatus("disponivel");
		assertEquals("disponivel", zafira.getStatus());
	}
	

}
