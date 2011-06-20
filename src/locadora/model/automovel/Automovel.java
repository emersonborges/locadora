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

    private Long id;
    private int ano;
    private int capacidade;
    private String chassi;
    private int codCategoria;
    private int consumo;
    private String cor;//não tem pq usar o tipo color
    private int modelo;
    private String combustivel;
    private String placa;
    private double preco;
    private String status;
   
    
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	

	public String getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Boolean estaDisponivel(){
        if (this.status=="disponivel")
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

   

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
  

}
