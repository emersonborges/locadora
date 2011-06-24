package locadora.model;

import java.util.HashSet;
import java.util.Set;

import locadora.model.observer.Subject;

public class Funcionario extends Pessoa{
	
	private String carteiraTrabalho;
	private Set<Locacao> locacoes = new HashSet<Locacao>();
	
	
	
	public Set<Locacao> getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(Set<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	public Set<Locacao> getLocacaos() {
		return locacoes;
	}
	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacoes = locacaos;
	}
	/**
	 * @param carteiraTrabalho the carteiraTrabalho to set
	 */
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	/**
	 * @return the carteiraTrabalho
	 */
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
	}
	/**
	 * @param celularString the celularString to set
	 */
	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		
	}
	
		
}
