package locadora.persistence.dao.hibernate;

import java.util.List;

import locadora.model.adicional.Seguro;

public interface SeguroDao{
	
	void inserir(Seguro seguro) throws Exception;
	void editar(Seguro seguro) throws Exception;
	List<Seguro> listar() throws Exception;
	void remover(Seguro seguro) throws Exception;
	
}
