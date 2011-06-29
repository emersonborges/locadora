package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.adicional.Seguro;
import locadora.persistence.hibernate.MyHibernateSingleton;

public class SeguroDaoImpl implements SeguroDao {

	@Override
	public void inserir(Seguro seguro) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(seguro);
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
	public void editar(Seguro seguro) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Seguro> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Seguro seguro) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
