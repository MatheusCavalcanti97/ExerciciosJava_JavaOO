package lista_9_3.exerc_02;

import lista_9_3.exerc_01.Pessoa;

public class Rica extends Pessoa {

	private double dinheiro;

	public Rica() {
		super();
	}

	public Rica(String nomePessoa, String sobrenomePessoa, int idade, double dinheiro) {
		super(nomePessoa, sobrenomePessoa, idade);
		this.dinheiro = dinheiro;
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public boolean fazCompras() {
		boolean result = false;
		if (this.dinheiro > 0) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
