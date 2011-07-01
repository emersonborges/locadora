package locadora.model.factory;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;

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
	    	carro = new Carro(2009,"Vermelho","diesel",10000,"alugado");
	    }else if(type.equals("Astra")){
	    	carro = new Carro(2009,"Azul","gasolina",25000,"alugado");	    	
	    }
	    else if(type.equals("Meriva")){
	    	carro = new Carro(2009,"Branco","gasolina",32000,"alugado");
	    }
	    else if(type.equals("Montana")){
	    	carro =  new Carro(2007,"Azul","gasolina",25000,"alugado");
	    }
	    else if(type.equals("Zafira")){
	    	carro = new Carro(2008,"Azul","gasolina",15000,"alugado");
	    }	  
		return carro;
	}
	
}
