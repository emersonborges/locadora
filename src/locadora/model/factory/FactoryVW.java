package locadora.model.factory;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;


public class FactoryVW implements FactoryAutomovel {
	
	private static FactoryVW factoryVW;
	
	private FactoryVW(){
		super();
	}
	
	@Override
	public Automovel createAutomovel(String type) {
		Automovel carro = null;
		if(type.equals("Gol")){
	    	carro = new Carro(2009,"Vermelho","gasolina",20000,"disponivel");
	    }else if(type.equals("Golf")){
	    	carro = new Carro(2011,"Preto","eletrica",30000,"alugado");
	    }
	    else if(type.equals("Jetta")){
	    	carro = new Carro(2006,"Azul","gasolina",13000,"disponivel");
	    }
	    else if(type.equals("Passat")){
	    	carro = new Carro(2009,"Branco","gasNatural",18000,"alugado");
	    }
	    else if(type.equals("Polo")){
	    	carro = new Carro(2011,"Preto","gasolina",20000,"disponivel");
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
