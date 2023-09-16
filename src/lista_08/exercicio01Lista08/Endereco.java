package lista_08.exercicio01Lista08;

public class Endereco {

	protected String nomeCidade;
	protected String nomeRua;
	protected String estadoCidade;

	public Endereco() {
		super();
	}

	public Endereco(String nomeCidade, String nomeRua, String estadoCidade) {
		super();
		this.nomeCidade = nomeCidade;
		this.nomeRua = nomeRua;
		this.estadoCidade = estadoCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public String getNomeRua() {
		return nomeRua;
	}

	public void setNomeRua(String nomeRua) {
		this.nomeRua = nomeRua;
	}

	public String getEstadoCidade() {
		return estadoCidade;
	}

	public void setEstadoCidade(String estadoCidade) {
		this.estadoCidade = estadoCidade;
	}

}
