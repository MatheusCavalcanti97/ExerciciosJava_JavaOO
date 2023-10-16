package quesTet;

public class Banco {

	protected String numeroAgencia;
	protected String nomeAgencia;

	public Banco() {
		super();
	}

	public Banco(String numeroAgencia, String nomeAgencia) {
		super();
		this.numeroAgencia = numeroAgencia;
		this.nomeAgencia = nomeAgencia;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	} 

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

}
