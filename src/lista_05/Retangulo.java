package lista_05;

public class Retangulo {
	public double alturaRetangulo = 0;
	public double baseRetangulo = 0;

	public Retangulo() {
		super();
	}

	public Retangulo(double alturaRetangulo, double baseRetangulo) {
		super();
		this.alturaRetangulo = alturaRetangulo;
		this.baseRetangulo = baseRetangulo;
	}

	public double getAlturaRetangulo() {
		return alturaRetangulo;
	}

	public void setAlturaRetangulo(double alturaRetangulo) {
		this.alturaRetangulo = alturaRetangulo;
	}

	public double getBaseRetangulo() {
		return baseRetangulo;
	}

	public void setBaseRetangulo(double baseRetangulo) {
		this.baseRetangulo = baseRetangulo;
	}

	public double calculaAreaRet() {
		double calcArea = 0;

		calcArea = this.getBaseRetangulo() * this.getAlturaRetangulo();
		return calcArea;
	}

	public double calcPerimetroRet() {
		double calcPerimetro = 0;

		calcPerimetro = 2 * this.getBaseRetangulo() + 2 * this.getAlturaRetangulo();
		return calcPerimetro;
	}

}