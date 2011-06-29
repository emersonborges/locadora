package locadora.persistence.hibernate;

import java.util.List;

import locadora.model.automovel.Carro;

public interface CarroDao {
	
	void inserir(Carro carro) throws Exception;
	void editar(Carro carro) throws Exception;
	List<Carro> listar() throws Exception;
	void remover(Carro carro) throws Exception;
}
