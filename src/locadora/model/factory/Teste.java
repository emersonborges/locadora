package locadora.model.factory;

public class Teste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		FactoryAutomovel factoryVW = FactoryVW.getInstance();
		FactoryAutomovel factoryFiat =  FactoryFiat.getInstance();
		FactoryAutomovel factoryChevrolet = FactoryChevrolet.getInstance();
		
		
		Automovel gol = factoryVW.createAutomovel("Gol");
		Automovel strada = factoryFiat.createAutomovel("Strada");
		Automovel astra = factoryChevrolet.createAutomovel("Astra");
		
		System.out.println(gol);
		System.out.println(strada);
		System.out.println(astra);
	}

}
