package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Devolucao;

public interface DevolucaoDao {
	
	void inserir (Devolucao devolucao);
	void editar (Devolucao devolucao);
	List<Devolucao> listar();
	void remover(Devolucao devolucao);
}
