package locadora.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import locadora.model.cliente.Cliente;

public class ClienteDaoImpl implements ClienteDao{

	@Override
	public void inserir(Cliente c) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(c);
			transaction.commit();			
		}catch(Exception exception){
			throw exception;
		}finally{
			session.close();
		}
	}

	@Override
	public void editar(Cliente c) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.update(c);
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
	public void remover(Cliente c) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.delete(c);
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
	public List<locadora.model.cliente.Cliente> listar() throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		List<Cliente> clientes = null;
		try {
			transaction = session.beginTransaction();
			clientes = session.createQuery("from Cliente").list();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		return clientes;
	}

	
}


