package locadora.dao.reservas;

import java.util.Iterator;
import java.util.List;

import locadora.model.Reserva;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.persistence.hibernate.MyHibernateSingleton;
import locadora.persistence.hibernate.ReservaDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;
import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestReservaDaoImpl {
	
	private ReservaDaoImpl  reservaDaoImpl;
	
	@Before
	public void setUp() {
		reservaDaoImpl = (ReservaDaoImpl) DaoFactory.getInstance().createDao("ReservaDao");
	}

	@After
	public void tearDown() {
		reservaDaoImpl = null;
	}
	@Test
	public void inserirTest() throws Exception{
		assertNotNull(reservaDaoImpl);		
		Cliente cliente = new ClienteNormal();
		cliente.setId((long) 1);
		Automovel automovel = new Carro();
		automovel.setId((long) 2);		
		Reserva reserva = new Reserva();
		reserva.setAutomovel(automovel);
		reserva.setCliente(cliente);
		reservaDaoImpl.inserir(reserva);
	}
	@Test
	public void editarTest() throws Exception{
		/*Reserva reserva = new Reserva();
		reserva.setId((long) 1);
		reserva.setValor((double) 500);
		reservaDaoImpl.editar(reserva);*/
		
	}
	@Test
	public void listarTest() throws Exception{
		assertNotNull(reservaDaoImpl);
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		List<Reserva>  reservas = null;
		try {
			transaction = session.beginTransaction();
			//Iterator i = session.createQuery("from User user, LogRecord log " + "where user.username = log.username")	.list().iterator();
			//Iterator<Reserva> i = session.createQuery("from Reserva, Automovel a" + "where automovel_id = a.automovel_id").list().iterator();
			
			Iterator i = session.createQuery("from Reserva r, Automovel a " +	"where r.id = a.id").list().iterator();
			
			while ( i.hasNext() ) {
				System.out.println("#####################################");
				Object[] pair = (Object[]) i.next();
				Reserva r = (Reserva) pair[0];
				Automovel a = (Automovel) pair[1];
				System.out.println("\n\nReserva\n\n");
				System.out.println(r);
				System.out.println("\n\nAutomovel\n\n");
				System.out.println(a);
				System.out.println("\n\n\n\n");
				System.out.println("#####################################");
			}

				
			
			
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw e;
		} finally {
			session.close();
		}
	/*	List<Reserva> reservas = reservaDaoImpl.listar();
		assertNotNull(reservas);
		Iterator<Reserva> iterator = reservas.iterator();
		while (iterator.hasNext()) {
			Reserva r = (Reserva) iterator.next();
			System.out.println(r.toString());
		}*/
		
	}
	@Test
	public void removerTest() throws Exception{
		/*Reserva reserva = new Reserva();
		reserva.setId((long) 1);
		reservaDaoImpl.remover(reserva);*/
	}
	
}
