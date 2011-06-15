package locadora.padroes;

import static org.junit.Assert.*;

import org.junit.Test;

import locadora.model.factory.FactoryVW;

public class FactoryAutomovelSingletonTest {
	
	@Test
	public void getInstanceFactoryVW(){
		assertNotNull(FactoryVW.getInstance());
	}

	@Test
	public void getInstanceFactoryChevrolet(){
		assertNotNull(FactoryVW.getInstance());
	}
	
	@Test
	public void getInstanceFactoryFiat(){
		assertNotNull(FactoryVW.getInstance());
	}
}
