package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Order;

import locadora.model.adicional.Adicional;
import locadora.model.adicional.GPS;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;

public class TesteDaos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
           
		
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();	
		
/*		Criteria criteria = session.createCriteria(Adicional.class);
		List<Adicional> adicionais = criteria.addOrder(Order.asc("decricao")).list();
		
		System.out.println("**************************************");
		for(Adicional adicional:adicionais){
			System.out.println(adicional);
		}
		System.out.println("**************************************");*/
		
		
		
		transaction.commit();
		session.close();
		
		

	}

}
