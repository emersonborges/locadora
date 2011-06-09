package locadora.model.dao.hibernate;

import org.hibernate.Session;

public class Teste {
	public static void main(String[] args){
		Session s = HibernateUtility.getSession();
	}
}
