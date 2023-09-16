package lista_05;

public class Endereco {

	public String nomeRua = null;
	public String logradouro = null;
	public String bairro = null;
	public String numeroCasa = null;
	public String cidade = null;
	public String cepCidade = null;
	public String estado = null;

	public Endereco() {

	}

	public Endereco(String nomeRua, String logradouro, String bairro, String numeroCasa, String cidade,
			String cepCidade, String estado) {
		super();
		this.nomeRua = nomeRua;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.numeroCasa = numeroCasa;
		this.cidade = cidade;
		this.cepCidade = cepCidade;
		this.estado = estado;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumeroCasa() {
		return numeroCasa;
	}

	public void setNumeroCasa(String numeroCasa) {
		this.numeroCasa = numeroCasa;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCepCidade() {
		return cepCidade;
	}

	public void setCepCidade(String cepCidade) {
		this.cepCidade = cepCidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
