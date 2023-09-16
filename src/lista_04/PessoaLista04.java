package lista_04;
import java.util.List;
public class PessoaLista04 {

	protected String nomePessoa = null;
	private Double salarioPessoa = null;

	public PessoaLista04() {
		super();
	}

	public PessoaLista04(String nomePessoa, Double salarioPessoa) {
		super();
		this.nomePessoa = nomePessoa;
		this.salarioPessoa = salarioPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public Double getSalarioPessoa() {
		return salarioPessoa;
	}

	public void setSalarioPessoa(Double salarioPessoa) {
		this.salarioPessoa = salarioPessoa;
	}

	@Override
	public String toString() {
		return "Nome: " + this.nomePessoa + "\nSalário: " + this.salarioPessoa;
	}

	public static String salario_maior_que_5Mil(List<PessoaLista04> pessoaLista) {
		String retorno = "";
		List<PessoaLista04> pessoaLista02 = (List<PessoaLista04>) pessoaLista;
		for (int i = 0; i < pessoaLista.size(); i++) {

			if (pessoaLista02.get(i).getSalarioPessoa() > 5000) {
				retorno += (i + 1) + " - Nome: " + pessoaLista02.get(i).getNomePessoa() + " -- Salário: R$ "
						+ pessoaLista02.get(i).getSalarioPessoa() + "\n";
			}
		}

		return retorno;
	}

}
