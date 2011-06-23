package locadora.model;

public class Devolucao {
	
	private Long id;
	private Reserva reserva;
	private Funcionario funcionario;
	
	public Devolucao(Reserva r, Funcionario f){
		this.reserva = r;
		this.funcionario = f;
	}
	
	public Devolucao(){
		super();
	}
	
	
	public void realizarDevolucao() {
		
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	/**
	 * @return the reserva
	 */
	public Reserva getReserva() {
		return reserva;
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
}
