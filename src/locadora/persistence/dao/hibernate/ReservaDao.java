package locadora.persistence.dao.hibernate;

import java.util.Iterator;
import java.util.List;

import locadora.model.Reserva;


public interface ReservaDao {
	
	void inserir (Reserva reserva) throws Exception;
	void editar (Reserva reserva)throws Exception;
	Iterator listar()throws Exception;
	void remover(Reserva reserva)throws Exception;
	
}
