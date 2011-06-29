/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.cliente;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import sun.java2d.HeadlessGraphicsEnvironment;

import locadora.model.Pessoa;
import locadora.model.Reserva;
import locadora.model.desconto.*;
import locadora.model.observer.*;

/**
 *
 * @author Emerson
 */

public abstract class Cliente extends Observer{
	    
	private Long id;

    private String celular;
    private String cep;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String endereco;
    private String nome;
    private String nomeMae;
    private String nomePai;
    private String rg;
    private String telefone;
    private String cidade;   
	private String updateStatus;
	private Date clienteDesde; // data de cadastro do cliente
	
	private Set reservas = new HashSet<Reserva>();
	
	
	
	public Set getReservas() {
		return reservas;
	}

	public void setReservas(Set reservas) {
		this.reservas = reservas;
	}

	public String getUpdateStatus() {
		return updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
	}	
	public Cliente(){
		super();
	}

	/**
	 * @param clienteDesde the clienteDesde to set
	 */
	public void setClienteDesde(Date clienteDesde) {
		this.clienteDesde = clienteDesde;
	}

	/**
	 * @return the clienteDesde
	 */
	public Date getClienteDesde() {
		return clienteDesde;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", celular=" + celular + ", cep=" + cep
				+ ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", email=" + email + ", endereco=" + endereco + ", nome="
				+ nome + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", rg=" + rg + ", telefone=" + telefone + ", cidade="
				+ cidade + ", updateStatus=" + updateStatus + ", clienteDesde="
				+ clienteDesde + "]";
	}

	
	
	
	
	
}
