package lista_9_3.exerc_01;

public class Assistente_Administrativo extends Funcionario {

	private String turno;
	private double adicionalNortuno;

	public Assistente_Administrativo() {
		super();
	}

	public Assistente_Administrativo(String nomeFuncionario, String sobrenomeFuncionario, int idade, String numeroDeMatricula,
			double salario, String turno, double adicionalNortuno) {
		super(nomeFuncionario, sobrenomeFuncionario, idade, numeroDeMatricula, salario);
		this.turno = turno;
		this.adicionalNortuno = adicionalNortuno;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public double getAdicionalNortuno() {
		return adicionalNortuno;
	}

	public void setAdicionalNortuno(double adicionalNortuno) {
		this.adicionalNortuno = adicionalNortuno;
	}

}
