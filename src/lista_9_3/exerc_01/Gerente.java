package lista_9_3.exerc_01;

public class Gerente extends Funcionario {

	private String numeroMatGerente;
	private String departamentoGerenciado;
	private double gratificacao;

	public Gerente() {
		super();
	}

	public Gerente(String nomeFuncionario, String sobrenomeFuncionario, int idade, String numeroDeMatricula, double salario,
			String numeroMatString, String departamentoGerenciado, double gratificacao) {
		super(nomeFuncionario, sobrenomeFuncionario, idade, numeroDeMatricula, salario);
		this.numeroMatGerente = numeroMatString;
		this.departamentoGerenciado = departamentoGerenciado;
		this.gratificacao = gratificacao;

	}

	public String getNumeroMatGerente() {
		return numeroMatGerente;
	}

	public void setNumeroMatGerente(String numeroMatGerente) {
		this.numeroMatGerente = numeroMatGerente;
	}

	public String getDepartamentoGerenciado() {
		return departamentoGerenciado;
	}

	public void setDepartamentoGerenciado(String departamentoGerenciado) {
		this.departamentoGerenciado = departamentoGerenciado;
	}

	public double getGratificacao() {
		return gratificacao;
	}

	public void setGratificacao(double gratificacao) {
		this.gratificacao = gratificacao;
	}

}
