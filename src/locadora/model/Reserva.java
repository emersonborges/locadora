package locadora.model;

import java.util.Date;


public class Reserva {
		
	private Date dataDevolucao;
	private Date dataRetirada;
	private Double multa;
	private Double valor;
	
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
	
}
