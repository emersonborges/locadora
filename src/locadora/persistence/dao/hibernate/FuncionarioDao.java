package locadora.persistence.dao.hibernate;

import java.util.List;

import locadora.model.Funcionario;

public interface FuncionarioDao {
	
	void inserir (Funcionario funcionario) throws Exception;
	void editar (Funcionario funcionario);
	List<Funcionario> listar();
	void remover(Funcionario funcionario);
}
