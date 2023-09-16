package lista_08.exercicio01Lista08.exercicio02Lista08;

public class ContaPoupanca extends ContaBancaria {
	protected int diaDeRendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nomeAgencia, String numeroAgencia, String nomeCliente, String cpfCliente,
			String numeroConta, double saldoConta, int diaDeRendimento) {
		super(nomeAgencia, numeroAgencia, nomeCliente, cpfCliente, numeroConta, saldoConta);
		this.diaDeRendimento = diaDeRendimento;
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	@Override
	public void depositarValor(double depositoDeValor) {
		if (depositoDeValor >= 0) {
			this.setSaldoConta(this.saldoConta + depositoDeValor);
		}
	}

	@Override
	public void sacarValor(double valorSacado) {
		if (valorSacado <= this.getSaldoConta()) {
			this.setSaldoConta(this.saldoConta - valorSacado);
		}
	}

	public void rendeJuros(double taxaRendimento) {
		double calculaRendimento = 0, novoSaldo = 0;
		calculaRendimento = this.getSaldoConta() * (taxaRendimento / 100);
		novoSaldo = this.getSaldoConta() + calculaRendimento;
		this.setSaldoConta(novoSaldo);
	}

	@Override
	public String nome_e_cpf() {
		return "Nome Cliente: " + this.getNomeCliente() + " -- " + "CPF Cliente: " + this.getCpfCliente() + "\n -- " + "Nome da Agencia: " + this.getNomeAgencia() + " -- Número da Agência: " + this.getNumeroAgencia();
	}

}
