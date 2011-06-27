package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Pessoa;
import locadora.model.cliente.Cliente;
import locadora.model.cliente.ClienteNormal;

public class PessoaDaoImpl implements PessoaDao{

	@Override
	public void inserir(Pessoa p) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;
		try{
			transaction = session.beginTransaction();
			session.save(p);
			transaction.commit();			
		}catch(Exception exception){
			throw exception;
		}finally{
			session.close();
		}
	}

	@Override
	public void editar(Pessoa p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> listar() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Pessoa p) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}


