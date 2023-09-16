package lista_9_3.exerc_03;

public class Ingresso {

	protected double valor;

	public Ingresso() {
		super();
	}

	public Ingresso(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double imprimeValor() {
		return this.valor;
	}
	
	public String imprimeValorIngresso() {
		return "O valor do Ingresso é: R$ " + this.valor; 
	}

}
