package locadora.persistence.hibernate;

import java.util.List;

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
	public List<Devolucao> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Devolucao devolucao) {
		// TODO Auto-generated method stub
		
	}

}
