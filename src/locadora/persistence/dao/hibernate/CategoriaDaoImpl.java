package locadora.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.automovel.Categoria;

public class CategoriaDaoImpl implements CategoriaDao {

	@Override
	public void inserir(Categoria categoria) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(categoria);
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
	public void editar(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Categoria> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Categoria categoria) {
		// TODO Auto-generated method stub
		
	}

}
