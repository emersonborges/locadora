/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package locadora.model.cliente;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import locadora.model.desconto.*;
import locadora.model.observer.*;

/**
 *
 * @author Emerson
 */
@Entity
public abstract class Cliente extends Observer{
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
    Desconto desconto;
    
    public double desconto(){
        return this.desconto.desconto();
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

    public Desconto getDesconto() {
        return desconto;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
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

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}
}
