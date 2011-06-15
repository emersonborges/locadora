package locadora.model.carros.fiat;

import locadora.model.automovel.Carro;


public class Strada extends Carro{
	public Strada(){
		super();
	}
	public Strada(int ano,String cor,Combustivel c, double preco, Status s){
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
