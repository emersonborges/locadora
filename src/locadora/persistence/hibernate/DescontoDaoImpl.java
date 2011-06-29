package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.desconto.Desconto;

public class DescontoDaoImpl implements DescontoDao {

	@Override
	public void inserir(Desconto desconto) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(desconto);
			transaction.commit();
		} catch (Exception e) {
			if(transaction!=null){
				transaction.rollback();
			}				
			throw e;
		} finally {
			session.close();
		}
		
	}

	@Override
	public void editar(Desconto desconto) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(desconto);
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
	public List<Desconto> listar() throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		List<Desconto> descontos = null;
		try {
			transaction = session.beginTransaction();
			descontos = session.createQuery("from Desconto").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		return descontos;
	}

	@Override
	public void remover(Desconto desconto) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(desconto);
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
