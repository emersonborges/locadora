package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.automovel.Moto;

public class MotoDaoImpl implements MotoDao {

	@Override
	public void inserir(Moto moto) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(moto);
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
	public void editar(Moto moto) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Moto> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Moto moto) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
