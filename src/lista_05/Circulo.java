package lista_05;

public class Circulo {
	public double raioCirculo = 0;

	public Circulo() {
		super();
	}

	public Circulo(double raioCirculo) {
		super();
		this.raioCirculo = raioCirculo;
	}

	public double getRaioCirculo() {
		return raioCirculo;
	}

	public void setRaioCirculo(double raioCirculo) {
		this.raioCirculo = raioCirculo;
	}

	public double calculaAreaCirculo() {
		double areaCirc = 0;
		areaCirc = (this.getRaioCirculo() * this.getRaioCirculo()) * 3.14;
		return areaCirc;
	}

	public double calculaPerimetroCirculo() {
		double perimetroCirc = 0;
		perimetroCirc = 2 * this.getRaioCirculo() * 3.14;
		return perimetroCirc;
	}
 
}