package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.adicional.AssentoInfantil;

public interface AssentoInfantilDao {
	
	void inserir(AssentoInfantil assentoInfantil) throws Exception;
	void editar(AssentoInfantil assentoInfantil) throws Exception;
	List<AssentoInfantil> listar() throws Exception;
	void remover(AssentoInfantil assentoInfantil) throws Exception;
}
