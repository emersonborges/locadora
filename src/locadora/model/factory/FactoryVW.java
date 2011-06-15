package locadora.model.factory;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Automovel.Combustivel;
import locadora.model.automovel.Automovel.Status;
import locadora.model.carros.fiat.Siena;
import locadora.model.carros.volkswagem.Gol;
import locadora.model.carros.volkswagem.Golf;
import locadora.model.carros.volkswagem.Jetta;
import locadora.model.carros.volkswagem.Passat;
import locadora.model.carros.volkswagem.Polo;

public class FactoryVW implements FactoryAutomovel {
	
	private static FactoryVW factoryVW;
	
	private FactoryVW(){
		super();
	}
	
	@Override
	public Automovel createAutomovel(String type) {
		Automovel carro = null;
		if(type.equals("Gol")){
	    	carro = new Gol(2009,"Vermelho",Combustivel.gasolina,20000,Status.disponivel);
	    }else if(type.equals("Golf")){
	    	carro = new Golf(2011,"Preto",Combustivel.eletrica,30000,Status.alugado);
	    }
	    else if(type.equals("Jetta")){
	    	carro = new Jetta(2006,"Azul",Combustivel.gasolina,13000,Status.disponivel);
	    }
	    else if(type.equals("Passat")){
	    	carro = new Passat(2009,"Branco",Combustivel.gasNatural,18000,Status.alugado);
	    }
	    else if(type.equals("Polo")){
	    	carro = new Polo(2011,"Preto",Combustivel.gasolina,20000,Status.disponivel);
	    }
		return carro;
	}

	
	public static FactoryAutomovel getInstance() {
		if(factoryVW==null){
			factoryVW = new FactoryVW();
		}
		return factoryVW;
	}

}
