package locadora.persistence.dao.hibernate;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;


public class CriaBDLocadora {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();	
		// Análise nos mapeamentos e criacao automatica do Banco locadora;
		transaction.commit();
		session.close();		

	}

}
