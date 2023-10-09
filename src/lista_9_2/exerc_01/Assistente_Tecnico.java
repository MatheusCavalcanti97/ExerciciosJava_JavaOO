package lista_9_2.exerc_01;

public class Assistente_Tecnico extends Funcionario {

	private double bonusSalarial;

	public Assistente_Tecnico() {
		super();
	}

	public Assistente_Tecnico(String nomeFuncionario, String sobrenomeFuncionario, int idade, String numeroDeMatricula,
			double salario, double bonusSalarial) {
		super(nomeFuncionario, sobrenomeFuncionario, idade, numeroDeMatricula, salario);
		this.bonusSalarial = bonusSalarial;
	}

	public double getBonusSalarial() {
		return bonusSalarial;
	}

	public void setBonusSalarial(double bonusSalarial) {
		this.bonusSalarial = bonusSalarial;
	}

}
