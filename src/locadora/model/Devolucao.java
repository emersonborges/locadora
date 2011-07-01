package locadora.model;

public class Devolucao {
	
	private Long id;
	private Funcionario funcionario;
	
	private Reserva reserva;
	            
	
	
	public Devolucao(Reserva r, Funcionario f){
	
		this.funcionario = f;
		this.reserva = r;
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

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	
	/**
	 * @param reservas the reservas to set
	 */
	
}
