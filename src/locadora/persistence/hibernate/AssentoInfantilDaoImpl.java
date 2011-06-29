package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.adicional.AssentoInfantil;

public class AssentoInfantilDaoImpl implements AssentoInfantilDao{

	@Override
	public void inserir(AssentoInfantil assentoInfantil) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(assentoInfantil);
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
	public void editar(AssentoInfantil assentoInfantil) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<AssentoInfantil> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(AssentoInfantil assentoInfantil) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
