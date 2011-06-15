package locadora.model.factory;

import locadora.model.automovel.Automovel;

public interface FactoryAutomovel {
		
	public Automovel createAutomovel(String type);
	
}
