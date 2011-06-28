package locadora.padroes.dao;

import locadora.model.Funcionario;
import locadora.model.Locacao;
import locadora.model.Reserva;
import locadora.persistence.hibernate.LocacaoDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestLocacaoDaoImpl {
	@Test
	public void inserirTest() throws Exception{
		
		LocacaoDaoImpl locacaoDaoImpl = (LocacaoDaoImpl) DaoFactory.getInstance().createDao("LocacaoDao");		
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
	public void listarTest(){
		
	}
	@Test
	public void removerTest(){
		
	}
	
}
