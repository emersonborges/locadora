package locadora.model.factory;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;
import locadora.model.automovel.Automovel.Combustivel;
import locadora.model.automovel.Automovel.Status;
import locadora.model.carros.chevrolet.Astra;
import locadora.model.carros.chevrolet.Celta;
import locadora.model.carros.chevrolet.Meriva;
import locadora.model.carros.chevrolet.Montana;
import locadora.model.carros.chevrolet.Zafira;
import locadora.model.carros.fiat.Palio;
import locadora.model.carros.fiat.Punto;
import locadora.model.carros.fiat.Siena;
import locadora.model.carros.fiat.Strada;
import locadora.model.carros.fiat.Uno;

public class FactoryFiat implements FactoryAutomovel{
	
	private static FactoryFiat factoryFiat;
	
	private FactoryFiat(){
		super();
		
	}
	
	@Override
	public Automovel createAutomovel(String type) {
		Carro carro = null;
		if(type.equals("Palio")){
	    	carro =  new Palio(2000,"Branco",Combustivel.gasNatural,10000,Status.alugado);
	    }else if(type.equals("Punto")){
	    	carro =  new Punto(2009,"Amarelo",Combustivel.gasolina,40000,Status.alugado);
	    }
	    else if(type.equals("Siena")){
	    	carro =  new Siena(2006,"Vermelho",Combustivel.gasolina,20000,Status.disponivel);
	    }
	    else if(type.equals("Strada")){
	    	carro = new Strada(2007,"Branca",Combustivel.gasolina,15000,Status.disponivel);
	    }
	    else if(type.equals("Uno")){
	    	carro = new Uno(2011,"Vermelho",Combustivel.eletrica,15000,Status.alugado);
	    }
		return carro;
	}

	
	public static FactoryAutomovel getInstance() {
	    if(factoryFiat==null){
	    	factoryFiat = new FactoryFiat();
	    }
		return factoryFiat;
	}

}
