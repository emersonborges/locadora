package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Reserva;


public interface ReservaDao {
	
	void inserir (Reserva reserva) throws Exception;
	void editar (Reserva reserva)throws Exception;
	List<Reserva> listar()throws Exception;
	void remover(Reserva reserva)throws Exception;
	
}
