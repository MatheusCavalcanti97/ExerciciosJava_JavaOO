package lista_9_2.exerc_01;

public class Funcionario extends Pessoa {

	private String numeroDeMatricula;
	private double salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String nomeFuncionario, String sobrenomeFuncionario, int idade, String numeroDeMatricula, double salario) {
		super(nomeFuncionario, sobrenomeFuncionario, idade);
		this.numeroDeMatricula = numeroDeMatricula;
		this.salario = salario;
	}

	public String getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(String numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
}
