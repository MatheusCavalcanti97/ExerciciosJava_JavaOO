package lista_9_2.exerc_04;

public class Endereco {

	protected String nomeRua;
	protected String nomeBairro;
	protected String nomeCidade;
	protected String nomeEstado;

	public Endereco() {
		super();
	}

	public Endereco(String nomeRua, String nomeBairro, String nomeCidade, String nomeEstado) {
		super();
		this.nomeRua = nomeRua;
		this.nomeBairro = nomeBairro;
		this.nomeCidade = nomeCidade;
		this.nomeEstado = nomeEstado;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

}
