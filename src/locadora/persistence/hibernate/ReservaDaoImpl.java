package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Reserva;

public class ReservaDaoImpl implements ReservaDao{

	@Override
	public void inserir(Reserva reserva) throws Exception {
	
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(reserva);
			transaction.commit();
		}catch(Exception exception){
			if(transaction!=null){
				transaction.rollback();
			}
			throw exception;
		}finally{
			session.close();
		}
		
	}

	@Override
	public void editar(Reserva reserva) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Reserva> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Reserva reserva) {
		// TODO Auto-generated method stub
		
	}

}
