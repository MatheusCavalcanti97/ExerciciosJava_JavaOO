package lista_08.exercicio01Lista08;
public class Editora {

	protected String cnpj_edit;
	protected String nomeEditora;
	protected Endereco enderecoEditora;
	protected String telefoneEditora;

	public Editora() {
		super();
	}

	public Editora(String cnpj_edit, String nomeEditora, Endereco enderecoEditora, String telefoneEditora) {
		super();
		this.cnpj_edit = cnpj_edit;
		this.nomeEditora = nomeEditora;
		this.enderecoEditora = enderecoEditora;
		this.telefoneEditora = telefoneEditora;
	}

	public String getCnpj_edit() {
		return cnpj_edit;
	}

	public void setCnpj_edit(String cnpj_edit) {
		this.cnpj_edit = cnpj_edit;
	}

	public String getNomeEditora() {
		return nomeEditora;
	}

	public void setNomeEditora(String nomeEditora) {
		this.nomeEditora = nomeEditora;
	}

	public Endereco getEnderecoEditora() {
		return enderecoEditora;
	}

	public void setEnderecoEditora(Endereco enderecoEditora) {
		this.enderecoEditora = enderecoEditora;
	}

	public String getTelefoneEditora() {
		return telefoneEditora;
	}

	public void setTelefoneEditora(String telefoneEditora) {
		this.telefoneEditora = telefoneEditora;
	}

}
