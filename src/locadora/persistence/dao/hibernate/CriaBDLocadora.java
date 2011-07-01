package locadora.persistence.dao.hibernate;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.criterion.Order;

import locadora.model.adicional.Adicional;
import locadora.model.adicional.GPS;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;

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
