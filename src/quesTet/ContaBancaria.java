package quesTet;

public class ContaBancaria {

	protected String numeroConta;
	protected Banco banco;
	protected Cliente cliente;
	protected double saldoConta;

	public ContaBancaria() {
		super();
	}

	public ContaBancaria(String numeroConta, Banco banco, Cliente cliente, double saldoConta) {
		super();
		this.numeroConta = numeroConta;
		this.banco = banco;
		this.cliente = cliente;
		this.saldoConta = saldoConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}

	public void sacarConta(double saque) {
		if (this.saldoConta > 0) {
			this.setSaldoConta(this.getSaldoConta() - saque);
		}

	}

	public void depositarConta(double deposito) {
		if (deposito > 0) {
			this.setSaldoConta(this.getSaldoConta() + deposito);
		}

	}
}
