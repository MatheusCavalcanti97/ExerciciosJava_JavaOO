package lista_9_1.exerc_02;

public class Conta {

	protected String numeroConta;
	protected Cliente cliente;
	protected double taxa;
	protected double saldo;
	protected Banco banco;

	public Conta() {
		super();
	}

	public Conta(String numeroConta, Cliente cliente, double taxa, double saldo, Banco banco) {
		super();
		this.numeroConta = numeroConta;
		this.cliente = cliente;
		this.taxa = taxa;
		this.saldo = saldo;
		this.banco = banco;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public void saqueConta(double saque) {

	}

	public void depositoConta(double deposito) {

	}

	public void atualizar() {

	}
}
