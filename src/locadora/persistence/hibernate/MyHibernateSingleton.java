package locadora.persistence.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MyHibernateSingleton {
	
	
	/*
	 * Podemos Utilizar
	 * 
	 *  
	 * HSQLDB (http://hsqldb.org),
	 * H2 (http://h2database.com), 
	 * Derby (http://b.apache.org/derby), 
	 * and Java DB (http://developers.sun.com/javadb). 
	 * 
	 * 
	 * */
	private static SessionFactory factory;
	
	private MyHibernateSingleton(){
		super();
	}
	
	public static SessionFactory getInstance(){
		if(factory==null){
			factory = new Configuration().configure().buildSessionFactory();
		}
		return factory;
	}
		
}
