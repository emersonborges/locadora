package locadora.model.cliente;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.desconto.SemDesconto;
import locadora.persistence.hibernate.MyHibernateSingleton;

public class ClienteTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClienteNormal cliente = new ClienteNormal("pedro", "UDI");
		SemDesconto desconto = new SemDesconto();

		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(desconto);
		
		transaction.commit();
		session.close();
		
		
		
	}

}
