package locadora.model;

import java.util.Date;

import locadora.model.automovel.Automovel;
import locadora.model.cliente.Cliente;



public class Reserva {

	private Long id;
	private Date dataDevolucao;
	private Date dataRetirada;
	private Double multa;
	private Double valor;
	
	private Cliente cliente;
	private Automovel automovel;
	
	public Reserva(Cliente c, Automovel a, double valor){
		this.cliente = c;
		this.automovel = a;
		this.valor = valor;
	}
	
	public Reserva(Cliente c, Automovel a, Date dateDevolucao, Date dateRetirada, double multa, double valor){
		this.cliente = c;
		this.automovel = a;
		this.dataDevolucao =  dateDevolucao;
		this.dataRetirada =  dateRetirada;
		this.multa =  multa;
		this.valor = valor;
		
	}
	
	public Date getDataDevolucao() {
		return dataDevolucao;
	}
	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}
	public Date getDataRetirada() {
		return dataRetirada;
	}
	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}
	public Double getMulta() {
		return multa;
	}
	public void setMulta(Double multa) {
		this.multa = multa;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public void alterar(){
		
	}
	public void cancelar(){
		
	}
	public void solicitar(){
		
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getId() {
		return id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Automovel getAutomovel() {
		return automovel;
	}

	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	
	
}
