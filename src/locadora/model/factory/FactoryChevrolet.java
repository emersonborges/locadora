package locadora.model.factory;

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
		if(type.equals("Camaro")){
	    	//carro = new Automovel();
	    }else if(type.equals("Astra")){
	    	carro = new Astra();
	    }
		return carro;
	}
	
}
