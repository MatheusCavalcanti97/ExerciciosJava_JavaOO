package quesTet;

public class Cliente {

	protected String nomeCliente;
	protected String cpfCliente;

	public Cliente() {
		super();
	}

	public Cliente(String nomeCliente, String cpfCliente) {
		super();
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

}
