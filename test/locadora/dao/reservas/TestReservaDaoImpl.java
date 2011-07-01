package locadora.dao.reservas;

import java.util.Iterator;
import locadora.model.Reserva;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.persistence.dao.hibernate.ReservaDaoImpl;
import locadora.persistence.dao.hibernate.factory.DaoFactory;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
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
	@Test @Ignore
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
		Reserva reserva = new Reserva();
		reserva.setId((long) 1);
		reserva.setValor((double) 500);
		reservaDaoImpl.editar(reserva);
		
	}
	@Test
	public void listarTest() throws Exception{
		assertNotNull(reservaDaoImpl);	
		Iterator i = reservaDaoImpl.listar();		
		System.out.println("\n$Reservas$\n");
		while (i.hasNext() ) {			
			Object[] pair = (Object[]) i.next();
			Reserva r = (Reserva) pair[0];
			Automovel a = (Automovel) pair[1];
			Cliente c = (Cliente) pair[2];
			System.out.println(r);
			System.out.println("");
			System.out.println(a);
			System.out.println("");
			System.out.println(c);
			System.out.println("\n\t\t *****");
		}			
		System.out.println("\n");
	}
	@Test @Ignore
	public void removerTest() throws Exception{
		Reserva reserva = new Reserva();
		reserva.setId((long) 1);
		reservaDaoImpl.remover(reserva);
	}
	
}
