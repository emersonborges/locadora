package locadora.model.factory;

public class FactoryVW implements FactoryAutomovel {
	
	private static FactoryVW factoryVW;
	
	private FactoryVW(){
		super();
	}
	
	@Override
	public Automovel createAutomovel(String type) {
		Automovel carro = null;
		if(type.equals("Gol")){
			carro = new Gol();
		}else if(type.equals("Voyage")){
			carro = new Voyage();
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
