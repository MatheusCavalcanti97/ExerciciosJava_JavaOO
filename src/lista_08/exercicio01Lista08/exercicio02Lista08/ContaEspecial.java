package lista_08.exercicio01Lista08.exercicio02Lista08;

public class ContaEspecial extends ContaBancaria {

	protected double limiteConta;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(String nomeAgencia, String numeroAgencia, String nomeCliente, String cpfCliente,
			String numeroConta, double saldoConta, double limiteConta) {
		super(nomeAgencia, numeroAgencia, nomeCliente, cpfCliente, numeroConta, saldoConta);
		this.limiteConta = limiteConta;
	}

	public double getLimiteConta() {
		return limiteConta;
	}

	public void setLimiteConta(double limiteConta) {
		this.limiteConta = limiteConta;
	}

	@Override
	public void sacarValor(double valorSacado) {
		if (valorSacado >= 0 && this.saldoConta >= (-1 * this.limiteConta)) {
			this.setSaldoConta((this.getSaldoConta() - valorSacado));
		}

	}

	@Override
	public void depositarValor(double depositoValor) {
		if (depositoValor > 0) {
			this.setSaldoConta(this.getSaldoConta() + depositoValor);
		}

	}

	@Override
	public String nome_e_cpf() {
		return "Nome Cliente: " + this.getNomeCliente() + " -- " + "CPF Cliente: " + this.getCpfCliente();
	}

}
