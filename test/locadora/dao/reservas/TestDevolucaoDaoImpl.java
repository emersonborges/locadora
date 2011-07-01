package locadora.dao.reservas;

import java.util.Iterator;

import locadora.model.Devolucao;
import locadora.model.Funcionario;
import locadora.model.Locacao;
import locadora.model.Reserva;
import locadora.model.automovel.Automovel;
import locadora.persistence.dao.hibernate.DevolucaoDaoImpl;
import locadora.persistence.dao.hibernate.factory.DaoFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestDevolucaoDaoImpl {
	
	private DevolucaoDaoImpl devolucaoDaoImpl;
	
	@Before
	public void setUp() {
		setDevolucaoDaoImpl((DevolucaoDaoImpl) DaoFactory.getInstance().createDao("DevolucaoDao"));
	}

	@After
	public void tearDown() {
		setDevolucaoDaoImpl(null);
	}
	
	@Test @Ignore
	public void inserirTest() throws Exception{
		
		DevolucaoDaoImpl devolucaoDaoImpl = (DevolucaoDaoImpl) DaoFactory.getInstance().createDao("DevolucaoDao");
		assertNotNull(devolucaoDaoImpl);
		
		Reserva reserva = new Reserva();
		reserva.setId((long) 1);		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setId((long) 1);	
		
		Devolucao devolucao = new Devolucao();
		devolucao.setFuncionario(funcionario);
		devolucao.setReserva(reserva);
		devolucaoDaoImpl.inserir(devolucao);	
	}
	
	
	@Test
	public void editarTest(){
		
	}
	@Test
	public void listarTest() throws Exception{
		Iterator iterator = getDevolucaoDaoImpl().listar();
		assertNotNull(iterator);
		System.out.println("\n$Devolucoes$\n");
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

	/**
	 * @param devolucaoDaoImpl the devolucaoDaoImpl to set
	 */
	public void setDevolucaoDaoImpl(DevolucaoDaoImpl devolucaoDaoImpl) {
		this.devolucaoDaoImpl = devolucaoDaoImpl;
	}

	/**
	 * @return the devolucaoDaoImpl
	 */
	public DevolucaoDaoImpl getDevolucaoDaoImpl() {
		return devolucaoDaoImpl;
	}
}
