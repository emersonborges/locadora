package locadora.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Order;

import locadora.model.adicional.Adicional;

public class AdicionalDaoImpl implements AdicionalDao {

	@Override
	public void inserir(Adicional adicional) throws Exception {
	
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.save(adicional);		
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
	public void editar(Adicional adicional) {
		
			Session session = MyHibernateSingleton.getInstance().openSession();
			Transaction transaction = session.beginTransaction();
			Adicional adicionalBanco = 	(Adicional) session.load(Adicional.class,new Long(adicional.getId()));
			adicionalBanco.setPreco(adicional.getPreco());
			adicionalBanco.setDecricao(adicional.getDecricao());  
			transaction.commit();
			session.close();
	}

	@Override
	public List<Adicional> listar() {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();	
		Criteria criteria = session.createCriteria(Adicional.class);
		List<Adicional> adicionais = criteria.addOrder(Order.desc("decricao")).list();	
		System.out.println("**************************************");
		for(Adicional adicional:adicionais){
			System.out.println(adicional);
		}
		System.out.println("**************************************");
		transaction.commit();
		session.close();
		return adicionais;		
	}

	@Override
	public void remover(Adicional adicional) {
	
		System.out.println("Falta Implementar");
		
	}

}
