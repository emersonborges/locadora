package locadora.persistence.dao.hibernate;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Locacao;

public class LocacaoDaoImpl implements LocacaoDao{

	@Override
	public void inserir(Locacao locacao) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(locacao);
			transaction.commit();
		}catch (Exception e) {
			throw e;
		}finally{
			session.close();
		}
		
	}

	@Override
	public void editar(Locacao locacao) {
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
	public void remover(Locacao locacao) {
		// TODO Auto-generated method stub
		
	}
}

