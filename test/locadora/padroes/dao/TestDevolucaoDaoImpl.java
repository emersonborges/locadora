package locadora.padroes.dao;

import locadora.model.Devolucao;
import locadora.model.Funcionario;
import locadora.model.Reserva;
import locadora.persistence.hibernate.DevolucaoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDevolucaoDaoImpl {
	@Test
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
	public void listarTest(){
		
	}
	@Test
	public void removerTest(){
		
	}
}
