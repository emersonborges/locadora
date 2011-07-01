package locadora.persistence.dao.hibernate;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Devolucao;

public class DevolucaoDaoImpl implements DevolucaoDao{

	@Override
	public void inserir(Devolucao devolucao) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();			
			session.save(devolucao);
			transaction.commit();			
		} catch (Exception e) {
			/*if(transaction!=null){
				transaction.rollback();
			}*/
			throw e;
		}finally{
			session.close();
		}		
	}

	@Override
	public void editar(Devolucao devolucao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Iterator listar() throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		Iterator iterator = null;
		try {
			transaction = session.beginTransaction();
			String q = "from Locacao l, Automovel a, Funcionario f where l.id=a.id and l.funcionario.id=f.id";
			iterator = session.createQuery(q).list().iterator();
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		return iterator;
	}

	@Override
	public void remover(Devolucao devolucao) {
		// TODO Auto-generated method stub
		
	}

}
