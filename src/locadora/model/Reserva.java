package locadora.model;

import java.util.Date;



public class Reserva {

	private Long id;
	private Date dataDevolucao;
	private Date dataRetirada;
	private Double multa;
	private Double valor;
	
	public Reserva(Date dateDevolucao, Date dateRetirada, double multa, double valor){
		
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
	
}
