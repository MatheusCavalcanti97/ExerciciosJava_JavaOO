package lista_9_3.exerc_02;

public class Gato extends Animal {

	public Gato() {
		super();
	}

	public Gato(String nomeAnimal, String racaAnimal) {
		super(nomeAnimal, racaAnimal);
	}

	public boolean mia(String statusMiado) {
		boolean result = false;

		if (statusMiado.equalsIgnoreCase("Sim")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
