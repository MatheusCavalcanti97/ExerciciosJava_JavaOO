package lista_09.exerc01_ContaBancaria;

public class ContaPoupanca extends ContaBancaria {

	protected int diaDeRendimento;
	protected double taxaDeRendimento;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Pessoa pessoaCliente, String nomeDoBanco, String numeroAgencia, String numeroConta,
			double saldoConta, int diaDeRendimento, double taxaDeRendimento) {
		super(pessoaCliente, nomeDoBanco, numeroAgencia, numeroConta, saldoConta);

		this.diaDeRendimento = diaDeRendimento;
		this.taxaDeRendimento = taxaDeRendimento;
	}

	public int getDiaDeRendimento() {
		return diaDeRendimento;
	}

	public void setDiaDeRendimento(int diaDeRendimento) {
		this.diaDeRendimento = diaDeRendimento;
	}

	public double getTaxaDeRendimento() {
		return taxaDeRendimento;
	}

	public void setTaxaDeRendimento(double taxaDeRendimento) {
		this.taxaDeRendimento = taxaDeRendimento;
	}

	@Override
	public void sacarConta(double sacarValor) {
		if (sacarValor <= this.getSaldoConta()) {
			this.setSaldoConta(this.getSaldoConta() - sacarValor);
		}
	}

	@Override
	public void depositarConta(double depositoValor) {
		this.setSaldoConta(this.saldoConta + depositoValor);
	}

	public double renderJuros() {
		double rendimento = 0;
		rendimento = this.saldoConta * (this.taxaDeRendimento / 100.0);
		this.setSaldoConta(this.getSaldoConta() + rendimento);
		
		return this.getSaldoConta();
	}
	
	@Override
	public String toString() {
		
		return "Nome do Cliente: " + this.getPessoaCliente().getNomeCliente()
		+ "\nTipo do Banco: " + this.getNomeDoBanco() 
		+ "\nNumero Agencia: " + this.getNumeroAgencia()
		+ "\nNumero Conta: " + this.getNumeroConta() 
		+ "\nTaxa de Rendimento: " + this.getTaxaDeRendimento() + "%" 
		+ "\nDia de Rendimento: " + this.getDiaDeRendimento() 
		+ "\nSaldo: R$ " + this.getSaldoConta();
	}

}
