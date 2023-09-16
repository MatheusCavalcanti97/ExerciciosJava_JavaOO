package lista_09.exerc02_ClasseAnimal;

public class Peixe extends Animal {

	private boolean barbatanas;
	private boolean cauda;

	public Peixe() {
		super();
	}

	public Peixe(String nomeAnimal, double comprimentoAnimal, int numeroDePatas, String corDoAnimal,
			String ambienteAnimal, double velocidadeAnimal, boolean barbatanas, boolean cauda) {
		super(nomeAnimal, comprimentoAnimal, numeroDePatas, corDoAnimal, ambienteAnimal, velocidadeAnimal);

		this.barbatanas = barbatanas;
		this.cauda = cauda;
	}

	public boolean isBarbatanas() {
		return barbatanas;
	}

	public void setBarbatanas(boolean barbatanas) {
		this.barbatanas = barbatanas;
	}

	public boolean isCauda() {
		return cauda;
	}

	public void setCauda(boolean cauda) {
		this.cauda = cauda;
	}

	@Override
	public String toString() {
		return "Nome do Peixe: " + this.nomeAnimal + "\nComprimento Peixe: " + this.comprimentoAnimal + "\nCor do Peixe: "
				+ this.corAnimal + "\nNumero de Patas: " + this.numeroDePatas
				+ "\nAmbiente de Moradia: " + this.ambienteAnimal + "\nVelocida de Locomoção: " + this.velocidadeAnimal + " m/s" + "\nBarbatanas: " + this.barbatanas + "\nCauda: " + this.cauda;
	}

}
