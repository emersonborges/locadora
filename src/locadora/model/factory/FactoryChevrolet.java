package locadora.model.factory;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Automovel.Combustivel;
import locadora.model.automovel.Automovel.Status;
import locadora.model.carros.chevrolet.Astra;
import locadora.model.carros.chevrolet.Celta;
import locadora.model.carros.chevrolet.Meriva;
import locadora.model.carros.chevrolet.Montana;
import locadora.model.carros.chevrolet.Zafira;

public class FactoryChevrolet implements FactoryAutomovel{

	private static FactoryChevrolet factoryChevrolet;	
	
	public static FactoryAutomovel getInstance() {
		if(factoryChevrolet==null){
			factoryChevrolet = new FactoryChevrolet();
		}		
		return factoryChevrolet;
	}

	@Override
	public Automovel createAutomovel(String type) {
	    Automovel carro = null;
		if(type.equals("Celta")){
	    	carro = new Celta(2009,"Vermelho",Combustivel.diesel,10000,Status.alugado);
	    }else if(type.equals("Astra")){
	    	carro = new Astra(2009,"Azul",Combustivel.gasolina,25000,Status.alugado);	    	
	    }
	    else if(type.equals("Meriva")){
	    	carro = new Meriva(2009,"Branco",Combustivel.gasolina,32000,Status.alugado);
	    }
	    else if(type.equals("Montana")){
	    	carro =  new Montana(2007,"Azul",Combustivel.gasolina,25000,Status.alugado);
	    }
	    else if(type.equals("Zafira")){
	    	carro = new Zafira(2008,"Azul",Combustivel.alcool,15000,Status.manutencao);
	    }	  
		return carro;
	}
	
}
