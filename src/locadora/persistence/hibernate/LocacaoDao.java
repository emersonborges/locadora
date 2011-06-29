package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Locacao;

public interface LocacaoDao {

	void inserir (Locacao locacao) throws Exception;
	void editar (Locacao locacao)throws Exception;
	List<Locacao> listar() throws Exception;
	void remover(Locacao locacao)throws Exception;
	
}
