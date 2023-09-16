package lista_9_3.exerc_02;

public class Cachorro extends Animal {

	public Cachorro() {
		super();
	}

	public Cachorro(String nomeAnimal, String racaAnimal) {
		super(nomeAnimal, racaAnimal);
	}

	@Override
	public boolean caminha(String statusCaminhada) {
		return super.caminha(statusCaminhada);
	}

	public boolean late(String statusLatidas) {
		boolean result = false;

		if (statusLatidas.equalsIgnoreCase("Sim")) {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

}
