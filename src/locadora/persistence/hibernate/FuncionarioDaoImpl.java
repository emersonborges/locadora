package locadora.persistence.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import locadora.model.Funcionario;

public class FuncionarioDaoImpl implements FuncionarioDao{

	@Override
	public void inserir(Funcionario funcionario) throws Exception {
		Session session = MyHibernateSingleton.getInstance().openSession();
		Transaction transaction = null;		
		try {
			transaction = session.beginTransaction();
			session.save(funcionario);
			transaction.commit();			
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}finally{
			session.close();
		}
		
	}

	@Override
	public void editar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Funcionario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
	}

}
