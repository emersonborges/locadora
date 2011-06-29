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
	public void editar(Reserva reserva) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(reserva);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		
	}

	@Override
	public List<Reserva> listar() throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		List<Reserva>  reservas = null;
		try {
			transaction = session.beginTransaction();
			reservas = session.createQuery("from Reserva").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		return reservas;
	}

	@Override
	public void remover(Reserva reserva) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(reserva);
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		
	}

}
