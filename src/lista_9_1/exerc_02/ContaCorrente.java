package lista_9_1.exerc_02;

public class ContaCorrente extends Conta {

	public ContaCorrente() {
		super();
	}

	public ContaCorrente(String numeroConta, Cliente cliente, double taxa, double saldo, Banco banco) {
		super(numeroConta, cliente, taxa, saldo, banco);

	}

	@Override
	public void saqueConta(double saque) {
		if (saque > 0) {
			super.setSaldo(super.getSaldo() - 0.30);
		}
	}

	@Override
	public void depositoConta(double deposito) {
		if (deposito > 0) {
			super.setSaldo(super.getSaldo() + deposito);
		}

	}

	@Override
	public void atualizar() {
		super.setSaldo(super.getSaldo() - super.getTaxa());
	}
}
