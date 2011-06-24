package locadora.model;

import java.util.HashSet;
import java.util.Set;

public class Devolucao {
	
	private Long id;
	private Funcionario funcionario;
	
	private Set<Reserva> reservas = new HashSet<Reserva>();
	            
	
	
	public Devolucao(Reserva r, Funcionario f){
	
		this.funcionario = f;
	}
	
	public Devolucao(){
		super();
	}
	
	
	public void realizarDevolucao() {
		
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
	 * @param reservas the reservas to set
	 */
	public void setReservas(Set<Reserva> reservas) {
		this.reservas = reservas;
	}

	/**
	 * @return the reservas
	 */
	public Set<Reserva> getReservas() {
		return reservas;
	}
}
