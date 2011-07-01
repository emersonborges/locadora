package locadora.model.automovel;

import java.util.HashSet;
import java.util.Set;

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

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId() {
		return id;
	}	
	
	public Set getAutomoveis() {
		return automoveis;
	}
	public void setAutomoveis(Set automoveis) {
		this.automoveis = automoveis;
	}

	private Long id;
	private int codCategoria;
	private double precoDiario;
	private double precoMensal;
	private double precoSemanal;
	private Long quantidade;	
	//private ArrayList<Automovel> automoveis;
	
	private Set automoveis = new HashSet();
	
}
