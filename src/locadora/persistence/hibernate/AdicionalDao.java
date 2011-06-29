package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.adicional.Adicional;

public interface AdicionalDao {
	
	void inserir (Adicional adicional) throws Exception;
	void editar (Adicional adicional)throws Exception;
	List<Adicional> listar()throws Exception;
	void remover(Adicional adicional)throws Exception;
	
}
