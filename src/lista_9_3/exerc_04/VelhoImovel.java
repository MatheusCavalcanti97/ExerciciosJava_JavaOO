package lista_9_3.exerc_04;

public class VelhoImovel extends Imovel {

	private double desconto;

	public VelhoImovel() {
		super();
	}

	public VelhoImovel(double valorImovel, Endereco enderecoImovel, double desconto) {
		super(valorImovel, enderecoImovel);
		this.desconto = desconto;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

}
