package lista_09.exerc01_ContaBancaria;

public class Pessoa {
	protected String nomeCliente;

	public Pessoa() {
		super();
	}

	public Pessoa(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
}
