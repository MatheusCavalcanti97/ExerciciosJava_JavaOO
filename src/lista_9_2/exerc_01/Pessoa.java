package lista_9_2.exerc_01;

public class Pessoa {

	protected String nomePessoa;
	protected String sobrenomePessoa;
	protected int idade;

	public Pessoa() {
		super();
	}

	public Pessoa(String nomePessoa, String sobrenomePessoa, int idade) {
		super();
		this.nomePessoa = nomePessoa;
		this.sobrenomePessoa = sobrenomePessoa;
		this.idade = idade;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getSobrenomePessoa() {
		return sobrenomePessoa;
	}

	public void setSobrenomePessoa(String sobrenomePessoa) {
		this.sobrenomePessoa = sobrenomePessoa;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
