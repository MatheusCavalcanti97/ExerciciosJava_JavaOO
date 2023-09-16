package lista_9_3.exerc_03;

public class ClasseCamaroteSuperior extends ClasseVip {

	private double valorAdicionalCamaroteSup;

	
	public ClasseCamaroteSuperior() {
		super();
	}

	public ClasseCamaroteSuperior(double valor, double valorAdicionalVip, double valorAdicionalCamaroteSup) {
		super(valor, valorAdicionalVip);
		this.valorAdicionalCamaroteSup = valorAdicionalCamaroteSup;
	}

	public double getValorAdicionalCamarote() {
		return valorAdicionalCamaroteSup;
	}

	public void setValorAdicionalCamarote(double valorAdicionalCamarote) {
		this.valorAdicionalCamaroteSup = valorAdicionalCamarote;
	}

	public double valorDoIngressoCamaroteSup() {
		double valorTotal = 0;
		valorTotal = super.valor + super.getValorAdicionalVip() + this.valorAdicionalCamaroteSup;
		return valorTotal;
	}
}
