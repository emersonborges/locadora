package locadora.model.cliente;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Pessoa;
import locadora.model.desconto.Desconto;
import locadora.model.desconto.SemDesconto;
import locadora.model.observer.Subject;
import locadora.persistence.hibernate.MyHibernateSingleton;

public class ClienteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    ClienteNormal clienteNormal = new ClienteNormal("H","BH");
			
	    Desconto desconto = new SemDesconto(0);

		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();
		
	/*	Desconto desconto2 = (Desconto) session.load(Desconto.class, new Long(1));
		
		clienteNormal.setDesconto(desconto);
		
		session.save(desconto);*/
		
		transaction.commit();
		session.close();
		
		
		
	}

}
