package locadora.persistence.hibernate;

import java.util.List;
import locadora.model.automovel.Categoria;

public interface CategoriaDao {
	
	void inserir (Categoria categoria) throws Exception;
	void editar (Categoria categoria)throws Exception;
	List<Categoria> listar()throws Exception;
	void remover(Categoria categoria)throws Exception;
}
