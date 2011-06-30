package locadora.model.automovel;

import locadora.model.adicional.IAutomovelComponente;
import locadora.model.adicional.GPS;
import locadora.model.adicional.Seguro;

public class ExemploTesteDecorator {
	public static void main(String[] args){
		IAutomovelComponente carro2 = new GPS(new Carro(2008, 500), 30);
		
		
		System.out.println(" preco carro: " + carro2.getPreco() + " preco total : " + carro2.getPreco());
		
		IAutomovelComponente carro = new Carro(2009,2000);
		carro = new GPS(carro,30);
		carro = new Seguro(carro,20, 'p');
		
		System.out.println(" preco carro: " + carro.getPreco() + " preco total : " + carro.getPreco());
	}
}
