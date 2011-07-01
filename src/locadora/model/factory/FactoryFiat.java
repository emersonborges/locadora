package locadora.model.factory;

import locadora.model.automovel.Automovel;
import locadora.model.automovel.Carro;


public class FactoryFiat implements FactoryAutomovel{
	
	private static FactoryFiat factoryFiat;
	
	private FactoryFiat(){
		super();
		
	}
	
	@Override
	public Automovel createAutomovel(String type) {
		Carro carro = null;
		if(type.equals("Palio")){
	    	carro =  new Carro(2000,"Branco","gasNatural",10000,"alugado");
	    }else if(type.equals("Punto")){
	    	carro =  new Carro(2009,"Amarelo","gasolina",40000,"alugado");
	    }
	    else if(type.equals("Siena")){
	    	carro =  new Carro(2006,"Vermelho","gasolina",20000,"disponivel");
	    }
	    else if(type.equals("Strada")){
	    	carro = new Carro(2007,"Branca","gasolina",15000,"disponivel");
	    }
	    else if(type.equals("Uno")){
	    	carro = new Carro(2011,"Vermelho","eletrica",15000,"alugado");
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
