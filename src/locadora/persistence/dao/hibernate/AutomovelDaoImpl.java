package locadora.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import locadora.model.automovel.Automovel;

public class AutomovelDaoImpl implements AutomovelDao {

	@Override
	public void inserir(Automovel automovel) {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();		
		session.save(automovel);		
		transaction.commit();
		session.close();
		
	}

	@Override
	public void editar(Automovel automovel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Automovel> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Automovel automovel) {
		// TODO Auto-generated method stub
		
	}

}
