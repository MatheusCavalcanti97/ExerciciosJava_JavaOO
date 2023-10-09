package lista_9_2.exerc_02;

import lista_9_2.exerc_01.Pessoa;

public class Pobre extends Pessoa {

	public Pobre() {
		super();
	}

	public Pobre(String nomePessoa, String sobrenomePessoa, int idade) {
		super(nomePessoa, sobrenomePessoa, idade);
	}

	public boolean trabalha(String statusTrabalha) {
		boolean result = false;
		
		if(statusTrabalha.equalsIgnoreCase("Sim")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}
}
