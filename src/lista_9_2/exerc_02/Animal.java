package lista_9_2.exerc_02;

public class Animal {

	protected String nomeAnimal;
	protected String racaAnimal;

	public Animal() {
		super();
	}

	public Animal(String nomeAnimal, String racaAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.racaAnimal = racaAnimal;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public String getRacaAnimal() {
		return racaAnimal;
	}

	public void setRacaAnimal(String racaAnimal) {
		this.racaAnimal = racaAnimal;
	}

	public boolean caminha(String statusCaminhada) {
		boolean result = false;

		if (statusCaminhada.equalsIgnoreCase("Sim")) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}

}
