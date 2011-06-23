package locadora.model;

public class Locacao {
	
	private Long id;
	private Funcionario funcionario;
	private Reserva reserva;
	
	public Locacao(Reserva r, Funcionario f){
		this.reserva =  r;
		this.funcionario = f;
	}
	
	public Locacao(){
		super();
	}
	
	public void gerarNotaFiscal(){
		
	}
	public void realizarLocacao(){
		
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
