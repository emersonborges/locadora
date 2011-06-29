package locadora.dao.funcionarios;

import locadora.model.Funcionario;
import locadora.persistence.hibernate.FuncionarioDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;

import org.junit.Test;

public class TestFuncionarioDaoImpl {
	@Test
	public void inserirTest() throws Exception{
		FuncionarioDaoImpl funcionarioDaoImpl = (FuncionarioDaoImpl) DaoFactory.getInstance().createDao("FuncionarioDao");
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Jefferson");
		funcionarioDaoImpl.inserir(funcionario);
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
