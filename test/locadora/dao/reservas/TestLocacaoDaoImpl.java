package locadora.dao.reservas;

import java.util.Iterator;
import java.util.List;

import locadora.model.Funcionario;
import locadora.model.Locacao;
import locadora.model.Reserva;
import locadora.model.automovel.Automovel;
import locadora.persistence.dao.hibernate.LocacaoDaoImpl;
import locadora.persistence.dao.hibernate.factory.DaoFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestLocacaoDaoImpl {
	
	private LocacaoDaoImpl locacaoDaoImpl;
	
	@Before
	public void setUp() {
		locacaoDaoImpl = (LocacaoDaoImpl) DaoFactory.getInstance().createDao("LocacaoDao");
	}

	@After
	public void tearDown() {
		locacaoDaoImpl = null;
	}
	
	@Test
	public void inserirTest() throws Exception{		
				
		Locacao locacao = new Locacao();		
		Reserva reserva = new Reserva();
		reserva.setId((long) 1);		
		Funcionario funcionario = new Funcionario();
		funcionario.setId((long) 1);		
		locacao.setFuncionario(funcionario);
		locacao.setReserva(reserva);
		locacaoDaoImpl.inserir(locacao);
	}
	@Test
	public void editarTest(){
		
	}
	@Test
	public void listarTest() throws Exception{

		Iterator iterator = locacaoDaoImpl.listar();
		assertNotNull(iterator);
		System.out.println("\n$Locacoes$\n");
		while (iterator.hasNext()) {
			Object[] objectGroup = (Object[]) iterator.next();
			Locacao locacao = (Locacao) objectGroup[0];
			Automovel automovel = (Automovel) objectGroup[1];
			Funcionario funcionario = (Funcionario) objectGroup[2];
			System.out.println(locacao);
			System.out.println("");
			System.out.println(automovel);
			System.out.println("");
			System.out.println(funcionario);
			System.out.println("\n\t\t *****");
		}
		System.out.println("\n");
	}
	
	@Test
	public void removerTest(){
		
	}
	
}
