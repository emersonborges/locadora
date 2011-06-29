package locadora.dao.reservas;

import java.util.List;

import locadora.model.Funcionario;
import locadora.model.Locacao;
import locadora.model.Reserva;
import locadora.persistence.hibernate.LocacaoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

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

		/*List<Locacao> locacoes = locacaoDaoImpl.listar();
		assertNotNull(locacoes);*/
		

	}
	@Test
	public void removerTest(){
		
	}
	
}
