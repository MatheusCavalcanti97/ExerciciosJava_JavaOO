package lista_09.exerc02_ClasseAnimal;

public class Mamifero extends Animal {

	private String alimentoPreferido;

	public Mamifero() {
		super();
	}

	public Mamifero(String nomeAnimal, double comprimentoAnimal, int numeroDePatas, String corDoAnimal,
			String ambienteAnimal, double velocidadeAnimal, String alimentoPreferido) {
		super(nomeAnimal, comprimentoAnimal, numeroDePatas, corDoAnimal, ambienteAnimal, velocidadeAnimal);
		this.alimentoPreferido = alimentoPreferido;
	}

	public String getAlimentoPreferido() {
		return alimentoPreferido;
	}

	public void setAlimentoPreferido(String alimentoPreferido) {
		this.alimentoPreferido = alimentoPreferido;
	}
	
	@Override
	public String toString() {
		return "Nome do Peixe: " + this.nomeAnimal + "\nComprimento Peixe: " + this.comprimentoAnimal + "\nCor do Peixe: "
				+ this.corAnimal + "\nNumero de Patas: " + this.numeroDePatas
				+ "\nAmbiente de Moradia: " + this.ambienteAnimal + "\nVelocida de Locomoção: " + this.velocidadeAnimal + " m/s" + "\nAlimento Preferido: " + this.alimentoPreferido;
	}

}
