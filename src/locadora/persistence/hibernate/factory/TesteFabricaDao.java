package locadora.persistence.hibernate.factory;

import locadora.model.adicional.Adicional;
import locadora.model.adicional.GPS;
import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.persistence.hibernate.AdicionalDaoImpl;
import locadora.persistence.hibernate.PessoaDaoImpl;

public class TesteFabricaDao {
	
	public static void main(String args[]){
		DaoFactory daoFactory = DaoFactory.getInstance();
		
		// formas de criar daos ...
		
		AdicionalDaoImpl adicionalDaoImpl = (AdicionalDaoImpl) daoFactory.createDao("AdicionalDao");		
		PessoaDaoImpl clienteDaoImpl = (PessoaDaoImpl) daoFactory.createDao("ClienteDao");
		
		
		Automovel carro = new Carro(2011,20000);      
        carro.setChassi("Chassi");
        carro.setCor("Branco");
        carro.estaDisponivel();
        carro.setStatus("disponivel"); 
        carro.setPlaca("placa A");
        Adicional adicional = new GPS(carro, 1023);
        adicional.setDecricao("GPS");
        
        adicionalDaoImpl.remover(adicional);
        
        
	}
}
