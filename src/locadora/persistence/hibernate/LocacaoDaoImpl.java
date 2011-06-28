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
	public List<Locacao> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Locacao locacao) {
		// TODO Auto-generated method stub
		
	}

}
