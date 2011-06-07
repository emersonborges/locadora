package locadora.model.factory;

public class FactoryFiat implements FactoryAutomovel{
	
	private static FactoryFiat factoryFiat;
	
	private FactoryFiat(){
		super();
		
	}
	
	@Override
	public Automovel createAutomovel(String type) {
		Automovel carro = null;
		if(type.equals("Strada")){
			carro = new Strada();
		}else if(type.equals("Uno")){
			carro = new Uno();
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
