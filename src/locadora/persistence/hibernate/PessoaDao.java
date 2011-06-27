package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Pessoa;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;

public interface PessoaDao {
	
	void inserir (Pessoa p) throws Exception;
	void editar (Pessoa p)throws Exception;
	List<Cliente> listar()throws Exception;
	void remover(Pessoa p)throws Exception;
	
}
