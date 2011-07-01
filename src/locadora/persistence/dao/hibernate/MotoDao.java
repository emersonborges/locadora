package locadora.persistence.dao.hibernate;

import java.util.List;

import locadora.model.automovel.Moto;

public interface MotoDao {
	
	void inserir(Moto moto) throws Exception;
	void editar(Moto moto) throws Exception;
	List<Moto> listar() throws Exception;
	void remover(Moto moto) throws Exception;
	
}
