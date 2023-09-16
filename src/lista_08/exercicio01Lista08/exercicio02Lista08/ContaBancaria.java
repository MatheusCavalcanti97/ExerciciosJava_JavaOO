package lista_08.exercicio01Lista08.exercicio02Lista08;

public class ContaBancaria {
	public String nomeAgencia;
	public String numeroAgencia;
	public String nomeCliente;
	public String cpfCliente;
	public String numeroConta;
	public double saldoConta;

	public ContaBancaria() {
		super();
	}

	public ContaBancaria(String nomeAgencia, String numeroAgencia, String nomeCliente, String cpfCleinte,
			String numeroConta, double saldoConta) {
		super();
		this.nomeAgencia = nomeAgencia;
		this.numeroAgencia = numeroAgencia;
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCleinte;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
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

	public void sacarValor(double valorSacado) {
		
	}

	public void depositarValor(double depositoDeValor) {
		
	}
	
	public String nome_e_cpf() {
		return "Nome Cliente: " + this.getNomeCliente() + " -- " + "CPF Cliente: " + this.getCpfCliente();
	}
	

}
