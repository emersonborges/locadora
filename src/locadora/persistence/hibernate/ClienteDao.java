package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.cliente.Cliente;

public interface ClienteDao {
	
	void inserir (Cliente cliente) throws Exception;
	void editar (Cliente cliente);
	List<Cliente> listar();
	void remover(Cliente cliente);
}
