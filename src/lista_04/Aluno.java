package lista_04;

import java.util.List;

public class Aluno extends Pessoa {

	protected Double[] notas = null;
	protected Double mediaAluno = null;

	public Aluno() {
		super();
	}

	public Aluno(String nomeAluno, Double[] notas, Double mediaAluno) {
		super(nomeAluno);
		this.notas = notas;
		this.mediaAluno = mediaAluno;
	}
	

	public Double[] getNotas() {
		return notas;
	} 

	public void setNotas(Double[] notas) {
		this.notas = notas;
	}

	public Double getMediaAluno() {
		return mediaAluno;
	} 

	public void setMediaAluno(Double mediaAluno) {
		this.mediaAluno = mediaAluno;
	}

	public String alunosAprovados(List<Aluno> todosAlunos) {
		List<Aluno> listaAlunosAprovados = (List<Aluno>) todosAlunos;
		String x = "               \tALUNOS APROVADOS\n";
		x += "Nome do Aluno\t    Média Notas\t\tSituação";

		for (int i = 0; i < listaAlunosAprovados.size(); i++) {
			if (listaAlunosAprovados.get(i).getMediaAluno() >= 7) {
				x += "\n" + listaAlunosAprovados.get(i).getNomePessoa() + "\t\t\t"
						+ listaAlunosAprovados.get(i).getMediaAluno() + "\t\t" + "Aprovado.";
			}
		}
		return x;
	}
	
	

	public String alunosReprovados(List<Aluno> todosAlunos) {
		List<Aluno> listaAlunosAprovados = (List<Aluno>) todosAlunos;
		String x = "               \tALUNOS REPROVADOS\n";
		x += "Nome do Aluno\t    Média Notas\t\tSituação";

		for (int i = 0; i < listaAlunosAprovados.size(); i++) {
			if (listaAlunosAprovados.get(i).getMediaAluno() < 7) {
				x += "\n" + listaAlunosAprovados.get(i).getNomePessoa() + "\t\t\t"
						+ listaAlunosAprovados.get(i).getMediaAluno() + "\t\t" + "Reprovado.";
			}
		}
		return x;
	}

}
