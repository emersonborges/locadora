package locadora.padroes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import locadora.model.automovel.Carro;
import locadora.model.automovel.Automovel.Status;
import locadora.model.factory.FactoryAutomovel;
import locadora.model.factory.FactoryVW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CarrosTestVolksWagem {
	FactoryAutomovel factoryVW;
	
	@Before
	public void setUp() throws Exception {
		factoryVW = FactoryVW.getInstance();		
	}

	@After
	public void tearDown() throws Exception {
		factoryVW = null;		
	}
	
	@Test
	public void testGOL(){
		Carro gol = (Carro) factoryVW.createAutomovel("Gol");
		assertNotNull(gol);
		assertEquals(2009, gol.getAno());
		assertEquals(20000, gol.getPreco(), 0);				
		assertEquals("disponivel", gol.getStatus());
		gol.setStatus(Status.manutencao);
		assertEquals("manutencao", gol.getStatus());
	}
	
	@Test
	public void testJetta(){
		Carro Jetta = (Carro) factoryVW.createAutomovel("Jetta");
		assertNotNull(Jetta);
		assertEquals(2006, Jetta.getAno());
		assertEquals(13000, Jetta.getPreco(), 0);				
		assertEquals("disponivel", Jetta.getStatus());
		Jetta.setStatus(Status.alugado);
		assertEquals("alugado", Jetta.getStatus());
	}
	
	@Test
	public void testPolo(){
		Carro Polo = (Carro) factoryVW.createAutomovel("Polo");
		assertNotNull(Polo);
		assertEquals(2011, Polo.getAno());
		assertEquals(20000, Polo.getPreco(), 0);				
		assertEquals("disponivel", Polo.getStatus());
		Polo.setStatus(Status.manutencao);
		assertEquals("manutencao", Polo.getStatus());
		assertEquals("gasolina", Polo.getCombustivel().toString());
	}
	
	@Test
	public void testPassat(){
		Carro passat = (Carro) factoryVW.createAutomovel("Passat");
		assertNotNull(passat);
		assertEquals(2009, passat.getAno());
		assertEquals(18000, passat.getPreco(), 0);				
		assertEquals("alugado", passat.getStatus());
		passat.setStatus(Status.disponivel);
		assertEquals("disponivel", passat.getStatus());
	}
	

	@Test
	public void testGolf(){
		Carro golf = (Carro) factoryVW.createAutomovel("Golf");
		assertNotNull(golf);
		assertEquals(2011, golf.getAno());
		assertEquals(30000, golf.getPreco(), 0);				
		assertEquals("alugado", golf.getStatus());
		golf.setStatus(Status.disponivel);
		assertEquals("disponivel", golf.getStatus());
	}
	
}
