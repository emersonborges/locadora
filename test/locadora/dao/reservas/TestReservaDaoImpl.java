package locadora.dao.reservas;

import java.util.Iterator;
import java.util.List;

import locadora.model.Reserva;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.persistence.hibernate.ReservaDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;
import static org.junit.Assert.*;

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
		automovel.setId((long) 1);		
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
		List<Reserva> reservas = reservaDaoImpl.listar();
		Iterator<Reserva> iterator = reservas.iterator();
		while (iterator.hasNext()) {
			Reserva r = (Reserva) iterator.next();
			System.out.println(r.toString());
		}
	}
	@Test
	public void removerTest() throws Exception{
		Reserva reserva = new Reserva();
		reserva.setId((long) 1);
		reservaDaoImpl.remover(reserva);
	}
	
}
