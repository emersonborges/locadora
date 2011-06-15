package locadora.model.automovel;

import java.util.ArrayList;
import java.util.List;
import locadora.model.observer.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author a90633
 */
public abstract class Automovel extends Subject{

    List<Automovel> adicionais = new ArrayList<Automovel>();

    private int ano;
    private int capacidade;
    private String chassi;
    private int codCategoria;
    private int consumo;
    private String cor;//não tem pq usar o tipo color
    private int modelo;
    private Enum<Combustivel> combustivel;
    private String placa;
    private double preco;
    private Enum<Status> status;
   
    
    
    public List<Automovel> getAdicionais() {
		return adicionais;
	}

	public void setAdicionais(List<Automovel> adicionais) {
		this.adicionais = adicionais;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public int getCodCategoria() {
		return codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		this.modelo = modelo;
	}

	public Enum<Combustivel> getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(Enum<Combustivel> combustivel) {
		this.combustivel = combustivel;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Boolean estaDisponivel(){
        if (this.status.equals(Status.disponivel))
            return true;
        return false;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco=preco;
    }

    public enum Status{
        disponivel,alugado,manutencao,reservado;
    }

    public enum Combustivel{
        alcool,gasolina,diesel,gasNatural,eletrica;
    }

    public void addAdicionais(Automovel a){
        adicionais.add(a);
    }

    public String getStatus(){
        return this.status.toString();
    }
    public void setStatus(Enum<Status> status) {
        this.status = status;
        this.notifica();
    }

}
