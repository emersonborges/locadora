package locadora.persistence.dao.hibernate;

import java.util.List;

import locadora.model.automovel.Caminhao;

public interface CaminhaoDao {
	
	void inserir(Caminhao caminhao) throws Exception;
	void editar(Caminhao caminhao) throws Exception;	
	List<Caminhao> listar() throws Exception;
	void remover(Caminhao caminhao) throws Exception;
}
