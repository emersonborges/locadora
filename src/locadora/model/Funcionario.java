package locadora.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import locadora.model.observer.Subject;

public class Funcionario{
	
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
	private String carteiraTrabalho;
	
	
	
	
	private Set<Locacao> locacoes = new HashSet<Locacao>();
	
	public Funcionario(){
		super();
	}
	
	
	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}

	

	public Set<Locacao> getLocacoes() {
		return locacoes;
	}
	public void setLocacoes(Set<Locacao> locacoes) {
		this.locacoes = locacoes;
	}
	public Set<Locacao> getLocacaos() {
		return locacoes;
	}
	public void setLocacaos(Set<Locacao> locacaos) {
		this.locacoes = locacaos;
	}
	/**
	 * @param carteiraTrabalho the carteiraTrabalho to set
	 */
	public void setCarteiraTrabalho(String carteiraTrabalho) {
		this.carteiraTrabalho = carteiraTrabalho;
	}
	/**
	 * @return the carteiraTrabalho
	 */
	public String getCarteiraTrabalho() {
		return carteiraTrabalho;
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
	
		
}
