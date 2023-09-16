package lista_08.exercicio01Lista08;

public class Autor {
	
	protected String cpfAutor;
	protected String nomeAutor;
	protected Endereco enderecoAutor;
	
	public Autor() {
		super();
	}

	public Autor(String cpfAutor, String nomeAutor, Endereco enderecoAutor) {
		super();
		this.cpfAutor = cpfAutor;
		this.nomeAutor = nomeAutor;
		this.enderecoAutor = enderecoAutor;
	}

	public String getCpfAutor() {
		return cpfAutor;
	}

	public void setCpfAutor(String cpfAutor) {
		this.cpfAutor = cpfAutor;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Endereco getEnderecoAutor() {
		return enderecoAutor;
	}

	public void setEnderecoAutor(Endereco enderecoAutor) {
		this.enderecoAutor = enderecoAutor;
	}
	
	

}
