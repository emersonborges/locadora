package locadora.persistence.hibernate;

import java.util.List;

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
	public List<Locacao> listar() throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		List<Locacao> locacoes = null;
		try {
			transaction = session.beginTransaction();
			locacoes = (List<Locacao>) session.createQuery("from Locacao l inner join Automovel a on l.automovel_id=a.automovel_id");
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
		return locacoes;
	}

	@Override
	public void remover(Locacao locacao) {
		// TODO Auto-generated method stub
		
	}
}

