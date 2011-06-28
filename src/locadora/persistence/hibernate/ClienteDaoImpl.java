package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Pessoa;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;

public class ClienteDaoImpl implements ClienteDao{

	@Override
	public void inserir(Cliente c) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(c);
			transaction.commit();			
		}catch(Exception exception){
			throw exception;
		}finally{
			session.close();
		}
	}

	@Override
	public void editar(Cliente c) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	@Override
	public void remover(Cliente c) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> Cliente() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
}


