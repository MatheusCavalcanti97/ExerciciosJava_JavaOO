package lista_09.exerc02_ClasseAnimal;

public class Animal {

	protected String nomeAnimal;
	protected double comprimentoAnimal;
	protected int numeroDePatas;
	protected String corAnimal;
	protected String ambienteAnimal;
	protected double velocidadeAnimal;

	public Animal() {
		super();
	}

	public Animal(String nomeAnimal, double comprimentoAnimal, int numeroDePatas, String corAnimal,
			String ambienteAnimal, double velocidadeAnimal) {
		super();
		this.nomeAnimal = nomeAnimal;
		this.comprimentoAnimal = comprimentoAnimal;
		this.numeroDePatas = numeroDePatas;
		this.corAnimal = corAnimal;
		this.ambienteAnimal = ambienteAnimal;
		this.velocidadeAnimal = velocidadeAnimal;
	}

	public String getNomeAnimal() {
		return nomeAnimal;
	}

	public void setNomeAnimal(String nomeAnimal) {
		this.nomeAnimal = nomeAnimal;
	}

	public double getComprimentoAnimal() {
		return comprimentoAnimal;
	}

	public void setComprimentoAnimal(double comprimentoAnimal) {
		this.comprimentoAnimal = comprimentoAnimal;
	}

	public int getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(int numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCorAnimal() {
		return corAnimal;
	}

	public void setCorAnimal(String corAnimal) {
		this.corAnimal = corAnimal;
	}

	public String getAmbienteAnimal() {
		return ambienteAnimal;
	}

	public void setAmbienteAnimal(String ambienteAnimal) {
		this.ambienteAnimal = ambienteAnimal;
	}

	public double getVelocidadeAnimal() {
		return velocidadeAnimal;
	}

	public void setVelocidadeAnimal(double velocidadeAnimal) {
		this.velocidadeAnimal = velocidadeAnimal;
	}

}
