package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.automovel.Carro;

public class CarroDaoImpl implements CarroDao{

	@Override
	public void inserir(Carro carro) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(carro);
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
	public void editar(Carro carro) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Carro> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Carro carro) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
