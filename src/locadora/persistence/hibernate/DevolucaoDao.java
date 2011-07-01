package locadora.persistence.hibernate;

import java.util.Iterator;
import java.util.List;

import locadora.model.Devolucao;

public interface DevolucaoDao {
	
	void inserir (Devolucao devolucao) throws Exception;
	void editar (Devolucao devolucao);
	Iterator listar() throws Exception;
	void remover(Devolucao devolucao);
}
