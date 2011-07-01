package locadora.padroes.dao;

import locadora.model.Reserva;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;
import locadora.model.observer.Subject;
import locadora.persistence.hibernate.ReservaDao;
import locadora.persistence.hibernate.ReservaDaoImpl;
import locadora.persistence.hibernate.factory.DaoFactory;
import static org.junit.Assert.*;
import org.junit.Test;


public class TestReservaDaoImpl {

	@Test
	public void inserirTest() throws Exception{
		ReservaDao reservaDao =  (ReservaDao) DaoFactory.getInstance().createDao("ReservaDao");
		assertNotNull(reservaDao);
		ClienteNormal clienteGold = new ClienteNormal("Jefferson","Uberlandia");
		assertNotNull(clienteGold);
		Automovel gol = new Carro(2011,25000);
		assertNotNull(gol);
		Reserva reserva = new Reserva(clienteGold,gol,500);	
		assertNotNull(reserva);
		reservaDao.inserir(reserva);
	}
	@Test
	public void editarTest(){
		
	}
	@Test
	public void listarTest(){
		
	}
	@Test
	public void removerTest(){
		
	}
	
}