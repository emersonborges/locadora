package locadora.persistence.hibernate;

import java.util.List;
import locadora.model.automovel.Categoria;

public interface CategoriaDao {
	
	void inserir (Categoria categoria);
	void editar (Categoria categoria);
	List<Categoria> listar();
	void remover(Categoria categoria);
}
