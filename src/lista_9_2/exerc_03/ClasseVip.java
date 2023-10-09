package lista_9_2.exerc_03;

public class ClasseVip extends Ingresso {

	private double valorAdicionalVip;

	public ClasseVip() {
		super();
	}

	public ClasseVip(double valor, double valorAdicionalVip) {
		super(valor);
		this.valorAdicionalVip = valorAdicionalVip;
	}

	public double valorDoIngressoVIP() {
		double valorTotal = 0;
		valorTotal = super.valor + this.valorAdicionalVip;
		return valorTotal;
	}

	public double getValorAdicionalVip() {
		return valorAdicionalVip;
	}

	public void setValorAdicionalVip(double valorAdicionalVip) {
		this.valorAdicionalVip = valorAdicionalVip;
	}

}
