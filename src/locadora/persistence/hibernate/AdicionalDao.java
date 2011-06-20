package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.adicional.Adicional;

public interface AdicionalDao {
	
	void inserir (Adicional adicional);
	void editar (Adicional adicional);
	List<Adicional> listar();
	void remover(Adicional adicional);
	
}
