package locadora.model;

import java.util.HashSet;
import java.util.Set;

public class Locacao {
	
	private Long id;
	private Funcionario funcionario;
	private Reserva reserva;
	
	
	public Locacao(Funcionario f, Reserva r){
		this.funcionario = f;
		this.reserva = r;
	}
	
	
	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
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
