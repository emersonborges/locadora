package locadora.persistence.dao.hibernate;

import java.util.Iterator;

import locadora.model.Locacao;

public interface LocacaoDao {

	void inserir (Locacao locacao) throws Exception;
	void editar (Locacao locacao)throws Exception;
	Iterator listar() throws Exception;
	void remover(Locacao locacao)throws Exception;
	
}
