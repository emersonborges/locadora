package locadora.padroes;

import locadora.model.automovel.Carro;
import locadora.model.factory.FactoryAutomovel;
import locadora.model.factory.FactoryChevrolet;
import locadora.model.factory.FactoryFiat;
import locadora.model.factory.FactoryVW;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTest {
	
	FactoryAutomovel factoryVW;
	FactoryAutomovel factoryFiat;
	FactoryAutomovel factoryChevrolet;
	
	@Before
	public void setUp() throws Exception {
		factoryVW = FactoryVW.getInstance();
		factoryFiat = FactoryFiat.getInstance();
		factoryChevrolet = FactoryChevrolet.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		factoryVW = null;
		factoryFiat = null;
		factoryChevrolet = null;
	}
	
	@Test
	public void testfactoryVW(){
		assertNotNull(factoryVW);
		assertNotNull(factoryVW.createAutomovel("Gol"));
		assertNotNull(factoryVW.createAutomovel("Golf"));
		assertNotNull(factoryVW.createAutomovel("Jetta"));
		assertNotNull(factoryVW.createAutomovel("Passat"));
		assertNotNull(factoryVW.createAutomovel("Polo"));
	}
	
	@Test
	public void testfactoryFiat(){
		assertNotNull(factoryFiat);
		assertNotNull(factoryFiat.createAutomovel("Palio"));
		assertNotNull(factoryFiat.createAutomovel("Punto"));
		assertNotNull(factoryFiat.createAutomovel("Siena"));
		assertNotNull(factoryFiat.createAutomovel("Strada"));
		assertNotNull(factoryFiat.createAutomovel("Uno"));
	}
	@Test
	public void testfactoryChevrolet(){
		assertNotNull(factoryChevrolet);
		assertNotNull(factoryChevrolet.createAutomovel("Astra"));
		assertNotNull(factoryChevrolet.createAutomovel("Celta"));
		assertNotNull(factoryChevrolet.createAutomovel("Meriva"));
		assertNotNull(factoryChevrolet.createAutomovel("Montana"));
		assertNotNull(factoryChevrolet.createAutomovel("Zafira"));
	}
	
	
}
