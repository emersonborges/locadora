package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.adicional.TanqueCheio;

public interface TanqueCheioDao {
	
	void inserir(TanqueCheio tanqueCheio) throws Exception;
	void editar(TanqueCheio tanqueCheio) throws Exception;
	List<TanqueCheio> listar() throws Exception;
	void remover(TanqueCheio tanqueCheio) throws Exception;
}
