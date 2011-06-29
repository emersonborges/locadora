package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.adicional.GPS;

public interface GpsDao {
	
	void inserir(GPS gps) throws Exception;
	void editar(GPS gps) throws Exception;
	List<GPS> listar() throws Exception;
	void remover(GPS gps) throws Exception;
}
