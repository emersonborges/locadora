package locadora.model;

import java.util.HashSet;
import java.util.Set;

public class Locacao {
	
	private Long id;
	private Funcionario funcionario;
	private Set<Reserva> reservas = new HashSet<Reserva>();
	
	

	
	public Set<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	public Locacao(){
		super();
	}
	
	public void gerarNotaFiscal(){
		
	}
	public void realizarLocacao(){
		
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param funcionario the funcionario to set
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	/**
	 * @return the funcionario
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}
}
