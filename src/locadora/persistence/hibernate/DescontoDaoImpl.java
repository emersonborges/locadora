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
	public void editar(Desconto desconto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Desconto> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Desconto desconto) {
		// TODO Auto-generated method stub
		
	}

}
