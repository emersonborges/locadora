package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.adicional.GPS;

public class GpsDaoImpl implements GpsDao {

	@Override
	public void inserir(GPS gps) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(gps);
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
	public void editar(GPS gps) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<GPS> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(GPS gps) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
