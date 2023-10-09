package lista_9_1.exerc_02;

public class Banco {

	protected String nomeBanco;
	protected String numeroAgencia;

	public Banco() {
		super();
	}

	public Banco(String nomeBanco, String numeroAgencia) {
		super();
		this.nomeBanco = nomeBanco;
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

}
