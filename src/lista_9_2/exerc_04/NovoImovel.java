package lista_9_2.exerc_04;

public class NovoImovel extends Imovel {

	private double adicionalPreco;

	public NovoImovel() {
		super();
	}

	public NovoImovel(double valorImovel, Endereco enderecoImovel, double adicionalPreco) {
		super(valorImovel, enderecoImovel);
		this.adicionalPreco = adicionalPreco;
	}

	public double getAdicionalPreco() {
		return adicionalPreco;
	}

	public void setAdicionalPreco(double adicionalPreco) {
		this.adicionalPreco = adicionalPreco;
	}

	@Override
	public double valorFinal() {
		return super.valorFinal() + this.adicionalPreco;
	}

}
