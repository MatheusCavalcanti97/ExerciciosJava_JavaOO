package lista_05;

public class Aluno extends Pessoa {

	protected String numeroDeMatricula = null;
	protected Endereco enderecoAluno = null;
	protected double[] notas = new double[4];

	public Aluno() {
		super();

	}

	public Aluno(String nomePessoa, String numeroDeMatricula, Endereco enderecoAluno, double[] notas) {
		super(nomePessoa);
		this.nomePessoa = nomePessoa;
		this.numeroDeMatricula = numeroDeMatricula;
		this.enderecoAluno = enderecoAluno;
		this.notas = notas;

	}

	public String getNumeroDeMatricula() {
		return numeroDeMatricula;
	}

	public void setNumeroDeMatricula(String numeroDeMatricula) {
		this.numeroDeMatricula = numeroDeMatricula;
	}

	public Endereco getEnderecoAluno() {
		return enderecoAluno;
	}

	public void setEnderecoAluno(Endereco enderecoAluno) {
		this.enderecoAluno = enderecoAluno;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double calculaMedia() {
		double soma = 0, media = 0;
		for (int i = 0; i < this.notas.length; i++) {
			soma += this.getNotas()[i];
		}
		media = soma / 4;
		return media;
	}

	@Override
	public String toString(String nome, String numeroMat, double[] notas) {
		String strNotas = "";

		for (int i = 0; i < notas.length; i++) {
			if (i != notas.length - 1) {
				strNotas += notas[i] + ", ";
			}

			if (i == notas.length - 1) {
				strNotas += notas[i] + ".";
			}
		}
		return "Nome: " + nome + " -- Numero Matrícula: " + numeroMat + " -- Notas: " + strNotas;
	}
}
