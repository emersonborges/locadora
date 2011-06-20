package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.Reserva;


public interface ReservaDao {
	
	void inserir (Reserva reserva);
	void editar (Reserva reserva);
	List<Reserva> listar();
	void remover(Reserva reserva);
	
}
