package locadora.persistence.hibernate;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtility {
	
    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Exception e) {
            System.out.println(e);
            factory = null;
        }
    }

    public static Session getSession() {
        if (factory == null){
            System.out.println("Fabrica igual a null. Impossivel continuar.");
        }
        return factory.openSession();
    }
}