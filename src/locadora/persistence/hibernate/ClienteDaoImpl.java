package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.cliente.Cliente;

public class ClienteDaoImpl implements ClienteDao{

	@Override
	public void inserir(Cliente cliente) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(cliente);
			transaction.commit();
		}catch(Exception e){
			throw e;
		}finally{
			session.close();
		}
		
	}

	@Override
	public void editar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Cliente cliente) {
		System.out.println("Falta Implementar");
		
	}

}
