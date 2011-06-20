package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Locacao;

public interface LocacaoDao {

	void inserir (Locacao locacao);
	void editar (Locacao locacao);
	List<Locacao> listar();
	void remover(Locacao locacao);
	
}
