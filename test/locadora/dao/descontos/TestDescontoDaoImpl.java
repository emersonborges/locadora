package locadora.dao.descontos;

import java.util.Iterator;
import java.util.List;

import locadora.model.desconto.Desconto;
import locadora.model.desconto.DescontoGOLD;
import locadora.model.desconto.DescontoVIP;
import locadora.model.desconto.SemDesconto;
import locadora.persistence.hibernate.DescontoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDescontoDaoImpl {
	
	private DescontoDaoImpl descontoDaoImpl;
	@Before
	public void setUp() {
		descontoDaoImpl = (DescontoDaoImpl) DaoFactory.getInstance().createDao("DescontoDao");
	}

	@After
	public void tearDown() {
		descontoDaoImpl = null;
	}
	
	@Test
	public void inserirTest() throws Exception{
		DescontoVIP desconto = new DescontoVIP();
		desconto.setDesconto(10);
		descontoDaoImpl.inserir(desconto);
	}
	@Test
	public void editarTest() throws Exception{
		SemDesconto desconto = new SemDesconto();
		desconto.setId((long) 1);
		desconto.setDesconto(3);
		descontoDaoImpl.editar(desconto);
	}
	@Test
	public void listarTest() throws Exception{
		List<Desconto> descontos = descontoDaoImpl.listar();
		assertNotNull(descontos);
		Iterator<Desconto> iterator = descontos.iterator();
		while (iterator.hasNext()) {
			Desconto desconto = (Desconto) iterator.next();
			System.out.println(desconto.toString());
		}
	}
	@Test
	public void removerTest() throws Exception{
		Desconto desconto = new DescontoGOLD();
		desconto.setId((long) 4);
		descontoDaoImpl.remover(desconto);
	}
}
