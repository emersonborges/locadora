package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.automovel.Caminhao;

public class CaminhaoDaoImpl implements CaminhaoDao {

	@Override
	public void inserir(Caminhao caminhao) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(caminhao);
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
	public void editar(Caminhao caminhao) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Caminhao> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Caminhao caminhao) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
}
