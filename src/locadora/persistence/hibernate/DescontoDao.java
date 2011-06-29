package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.adicional.Adicional;
import locadora.model.desconto.Desconto;

public interface DescontoDao {
	
	void inserir (Desconto desconto) throws Exception;
	void editar (Desconto desconto);
	List<Desconto> listar();
	void remover(Desconto desconto);
}
