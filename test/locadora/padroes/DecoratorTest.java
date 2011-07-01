package locadora.padroes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import locadora.model.adicional.AssentoInfantil;
import locadora.model.adicional.GPS;
import locadora.model.adicional.IAutomovelComponente;
import locadora.model.adicional.Seguro;
import locadora.model.adicional.TanqueCheio;
import locadora.model.automovel.Carro;


public class DecoratorTest {
	
	private IAutomovelComponente carro;	
	
	@Before
	public void setUp(){
		carro = new Carro(2008,300);
	}
	
	@After
	public void tearDown(){
		carro = null;
	}
	
	@Test
	public void decorateCarWithGPS(){
		carro = new GPS(carro, 15);	
		assertEquals(315, carro.getPreco(), 0);		
	}
		
	@Test
	public void decorateCarWithSeguro(){
		carro = new Seguro(carro, 50, 't');
		assertEquals(350, carro.getPreco(), 0);		
	}
	
	@Test
	public void decorateCarWithAssentoInfantil(){
		carro = new AssentoInfantil(carro, 10, 'm');
		assertEquals(310, carro.getPreco(), 0);		
	}
	
	@Test
	public void decorateCarWithTanqueCheio(){
		carro = new TanqueCheio(carro, 150, 50);
		assertEquals(450, carro.getPreco(), 0);		
	}
	
	@Test
	public void decorateCarWithMultiplesAdicionais(){
		carro = new GPS(carro, 15);
		carro = new Seguro(carro, 50, 't');
		carro = new AssentoInfantil(carro, 10, 'm');
		carro = new TanqueCheio(carro, 150, 50);
		
		assertEquals(525, carro.getPreco(), 0);
	}
	
	
}
