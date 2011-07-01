package locadora.persistence.dao.hibernate;

import java.util.List;

import locadora.model.adicional.Adicional;
import locadora.model.desconto.Desconto;

public interface DescontoDao {
	
	void inserir (Desconto desconto) throws Exception;
	void editar (Desconto desconto) throws Exception;
	List<Desconto> listar() throws Exception;
	void remover(Desconto desconto) throws Exception;
}
