package locadora.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.adicional.TanqueCheio;

public class TanqueCheioDaoImpl implements TanqueCheioDao{

	@Override
	public void inserir(TanqueCheio tanqueCheio) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(tanqueCheio);
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
	public void editar(TanqueCheio tanqueCheio) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<TanqueCheio> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(TanqueCheio tanqueCheio) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
