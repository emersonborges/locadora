package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Pessoa;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;

public interface ClienteDao {
	
	void inserir (Cliente c) throws Exception;
	void editar (Cliente c)throws Exception;
	List<Cliente> listar()throws Exception;
	void remover(Cliente c)throws Exception;
	
}
