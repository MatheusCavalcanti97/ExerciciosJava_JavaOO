package lista_9_3.exerc_04;

public class Imovel {

	protected double valorImovel;
	protected Endereco enderecoImovel;

	public Imovel() {
		super();
	}

	public Imovel(double valorImovel, Endereco enderecoImovel) {
		super();
		this.valorImovel = valorImovel;
		this.enderecoImovel = enderecoImovel;
	}

	public double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}

	public Endereco getEnderecoImovel() {
		return enderecoImovel;
	}

	public void setEnderecoImovel(Endereco enderecoImovel) {
		this.enderecoImovel = enderecoImovel;
	}

	public double valorFinal() {
		return valorImovel;
	}

}
