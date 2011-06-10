package locadora.model.automovel;

import java.util.ArrayList;

public class Categoria {
	
	public int getCodCategoria() {
		return codCategoria;
	}
	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}
	public double getPrecoDiario() {
		return precoDiario;
	}
	public void setPrecoDiario(double precoDiario) {
		this.precoDiario = precoDiario;
	}
	public double getPrecoMensal() {
		return precoMensal;
	}
	public void setPrecoMensal(double precoMensal) {
		this.precoMensal = precoMensal;
	}
	public double getPrecoSemanal() {
		return precoSemanal;
	}
	public void setPrecoSemanal(double precoSemanal) {
		this.precoSemanal = precoSemanal;
	}
	public Long getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}
	public void setAutomoveis(ArrayList<Automovel> automoveis) {
		this.automoveis = automoveis;
	}
	public ArrayList<Automovel> getAutomoveis() {
		return automoveis;
	}
	
	
	public Long getId() {
		return id;
	}
	
	private Long id;
	private int codCategoria;
	private double precoDiario;
	private double precoMensal;
	private double precoSemanal;
	private Long quantidade;	
	private ArrayList<Automovel> automoveis;
	
}
