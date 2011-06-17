package locadora.model.carros.volkswagem;

import locadora.model.automovel.Carro;
import locadora.model.automovel.Automovel.Combustivel;
import locadora.model.automovel.Automovel.Status;

public class Polo extends Carro {
	public Polo(){
		super();
	}
	public Polo(int ano,String cor,Combustivel c, double preco, Status s){
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
