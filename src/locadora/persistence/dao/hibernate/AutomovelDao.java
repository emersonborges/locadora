package locadora.persistence.dao.hibernate;

import java.util.List;

import locadora.model.automovel.Automovel;

public interface AutomovelDao {
	
	void inserir (Automovel automovel);
	void editar (Automovel automovel);
	List<Automovel> listar();
	void remover(Automovel automovel);
	
}
