package lista_9_3.exerc_02;

import lista_9_3.exerc_01.Pessoa;

public class Miseravel extends Pessoa {

	public Miseravel() {
		super();
	}

	public Miseravel(String nomePessoa, String sobrenomePessoa, int idade) {
		super(nomePessoa, sobrenomePessoa, idade);
	}

	public boolean mendiga(String statusMendiga) {
		boolean result = false;

		if (statusMendiga.equalsIgnoreCase("Sim")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
