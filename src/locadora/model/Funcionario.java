package locadora.model;

public abstract class Funcionario {
	
	private String carteiraTrabalho;
	private String celularString;
	private String cpf;
	private String endereco;
	private String nome;
	private String nomeMae;
	private String nomePai;
	private String rg;
	private String telefone;
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
	/**
	 * @param celularString the celularString to set
	 */
	public void setCelularString(String celularString) {
		this.celularString = celularString;
	}
	/**
	 * @return the celularString
	 */
	public String getCelularString() {
		return celularString;
	}
	/**
	 * @param cpf the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	/**
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	/**
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nomeMae the nomeMae to set
	 */
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	/**
	 * @return the nomeMae
	 */
	public String getNomeMae() {
		return nomeMae;
	}
	/**
	 * @param nomePai the nomePai to set
	 */
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	/**
	 * @return the nomePai
	 */
	public String getNomePai() {
		return nomePai;
	}
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg) {
		this.rg = rg;
	}
	/**
	 * @return the rg
	 */
	public String getRg() {
		return rg;
	}
	/**
	 * @param telefone the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	/**
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}
		
}
