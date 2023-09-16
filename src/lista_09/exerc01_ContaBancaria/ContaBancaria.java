package lista_09.exerc01_ContaBancaria;

public class ContaBancaria {
	protected Pessoa pessoaCliente;
	protected String nomeDoBanco;
	protected String numeroAgencia;
	protected String numeroConta;
	protected double saldoConta;

	public ContaBancaria() {
		super();
	}

	public ContaBancaria(Pessoa pessoaCliente, String nomeDoBanco, String numeroAgencia, String numeroConta,
			double saldoConta) {
		super();
		this.nomeDoBanco = nomeDoBanco;
		this.pessoaCliente = pessoaCliente;
		this.numeroAgencia = numeroAgencia;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}

	public Pessoa getPessoaCliente() {
		return pessoaCliente;
	}

	public void setPessoaCliente(Pessoa pessoaCliente) {
		this.pessoaCliente = pessoaCliente;
	}

	public String getNomeDoBanco() {
		return nomeDoBanco;
	}

	public void setNomeDoBanco(String nomeDoBanco) {
		this.nomeDoBanco = nomeDoBanco;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void sacarConta(double sacarValor) {

	}

	public void depositarConta(double depositoValor) {

	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
