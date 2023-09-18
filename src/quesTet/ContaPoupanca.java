package quesTet;

public class ContaPoupanca extends ContaBancaria {

	protected double jurosConta;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String numeroConta, Banco banco, Cliente cliente, double saldoConta, double jurosConta) {
		super(numeroConta, banco, cliente, saldoConta);
		this.jurosConta = jurosConta;
	}

	public double getJurosConta() {
		return jurosConta;
	}

	public void setJurosConta(double jurosConta) {
		this.jurosConta = jurosConta;
	}

	@Override
	public void sacarConta(double saque) {
		if (super.saldoConta > 0 && saque > 0) {
			super.setSaldoConta(super.getSaldoConta() - saque);
		}
	}

	@Override
	public void depositarConta(double deposito) {
		if (deposito > 0) {
			super.setSaldoConta(super.getSaldoConta() + deposito);
		}
	}

	public void renderJuros() {
		double renderJ = 0;
		renderJ = super.getSaldoConta() * (jurosConta / 100.0);
		super.setSaldoConta(super.getSaldoConta() + renderJ);
	}

}
