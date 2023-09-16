package lista_09.exerc01_ContaBancaria;

public class ContaEspecial extends ContaBancaria {

	protected double limiteContaEspecial;

	public ContaEspecial() {
		super();
	}

	public ContaEspecial(Pessoa pessoaCliente, String nomeBanco, String numeroAgencia, String numeroConta,
			double saldoConta, double limiteContaEspecial) {
		super(pessoaCliente, nomeBanco, numeroAgencia, numeroConta, saldoConta);
		this.limiteContaEspecial = limiteContaEspecial;
	}

	public double getLimiteContaEspecial() {
		return limiteContaEspecial;
	}

	public void setLimiteContaEspecial(double limiteContaEspecial) {
		this.limiteContaEspecial = limiteContaEspecial;
	}

	@Override
	public void sacarConta(double sacarValor) {
		this.setSaldoConta(this.getSaldoConta() - sacarValor);
	}

	@Override
	public void depositarConta(double depositoValor) {
		this.setSaldoConta(this.getSaldoConta() + depositoValor);
	}
	
	@Override
	public String toString() {
		
		return "Nome do Cliente: " + this.getPessoaCliente().getNomeCliente()
				+ "\nTipo do Banco: " + this.getNomeDoBanco() 
				+ "\nNumero Agencia: " + this.getNumeroAgencia()
				+ "\nNumero Conta: " + this.getNumeroConta() 
				+ "\nLimite da Conta Especial: R$ " + this.getLimiteContaEspecial() 
				+ "\nSaldo: R$ " + this.getSaldoConta();
	}

}
