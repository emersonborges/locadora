package locadora.model.carros.chevrolet;

import locadora.model.automovel.Carro;

public class Astra extends Carro {
	
	public Astra(){
		super();
	}
	
	public Astra(int ano,String cor,Combustivel c, double preco, Status s){
		setAno(ano);
		setCor(cor);
		setCombustivel(c);
		setPreco(preco);
		setStatus(s);
		configBasicas();
	}
	public void configBasicas(){
		setAirbag(true);
		setArcondicionado(false);
		setNportas(4);
		setCapacidade(4);
		setChassi("Chassi");	
		setConsumo(15);
		setModelo(1);
		setPlaca("Placa A");
	}
}