package locadora.model.dao.hibernate;



//Arquivo HibernateUtility.java
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
    private static SessionFactory factory;
    private static Session instance;
    
    private HibernateUtility(){}

    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.out.println(e);
            factory = null;
        }
    }

    public static Session getSession() {
    	if(instance == null){    		
    		instance = factory.openSession();
    	}       
        return instance;    
    }
}
