package locadora.padroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import locadora.model.automovel.Carro;
import locadora.model.automovel.Automovel.Status;
import locadora.model.factory.FactoryAutomovel;
import locadora.model.factory.FactoryFiat;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarrosTestFiat {
	
	FactoryAutomovel factoryFiat;
	
	@Before
	public void setUp() throws Exception {
		factoryFiat = FactoryFiat.getInstance();		
	}

	@After
	public void tearDown() throws Exception {
		factoryFiat = null;		
	}
	
	@Test
	public void testPalio(){
		Carro palio = (Carro) factoryFiat.createAutomovel("Palio");
		assertNotNull(palio);
		assertEquals(2000, palio.getAno());
		assertEquals(10000, palio.getPreco(), 0);				
		assertEquals("alugado", palio.getStatus());
		palio.setStatus(Status.manutencao);
		assertEquals("manutencao", palio.getStatus());
	}
	
	@Test
	public void testPunto(){
		Carro punto = (Carro) factoryFiat.createAutomovel("Punto");
		assertNotNull(punto);
		assertEquals(2009, punto.getAno());
		assertEquals(40000, punto.getPreco(), 0);				
		assertEquals("alugado", punto.getStatus());
		punto.setStatus(Status.disponivel);
		assertEquals("disponivel", punto.getStatus());
		assertEquals("Amarelo", punto.getCor());
	}
	
	@Test
	public void testSiena(){
		Carro siena = (Carro) factoryFiat.createAutomovel("Siena");
		assertNotNull(siena);
		assertEquals(2006, siena.getAno());
		assertEquals(20000, siena.getPreco(), 0);				
		assertEquals("disponivel", siena.getStatus());
		siena.setStatus(Status.manutencao);
		assertEquals("manutencao", siena.getStatus());
		assertEquals("gasolina", siena.getCombustivel().toString());
	}
	
	@Test
	public void testStrada(){
		Carro strada = (Carro) factoryFiat.createAutomovel("Strada");
		assertNotNull(strada);
		assertEquals(2007, strada.getAno());
		assertEquals(15000, strada.getPreco(), 0);				
		assertEquals("disponivel", strada.getStatus());
		strada.setStatus(Status.manutencao);
		assertEquals("manutencao", strada.getStatus());
	}
	

	@Test
	public void testUno(){
		Carro uno = (Carro) factoryFiat.createAutomovel("Uno");
		assertNotNull(uno);
		assertEquals(2011, uno.getAno());
		assertEquals(15000, uno.getPreco(), 0);				
		assertEquals("alugado", uno.getStatus());
		uno.setStatus(Status.disponivel);
		assertEquals("disponivel", uno.getStatus());
	}
}
