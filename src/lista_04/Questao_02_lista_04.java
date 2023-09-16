package lista_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_02_lista_04 {
	public static void mostraLinha() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno aluno = null;
		String nomeAluno = null;
		Double[] notas = null;
		Double mediaAluno = null, somatorio = null;
		Character opcaoMenu = null;
		List<Aluno> lista_Alunos_Notas_Medias = new ArrayList<>();

		mostraLinha();
		System.out.println(
				"Informe uma das Opções a seguir\n'S'-> Adicionar Aluno, notas e Calcular Média.\n'N'-> Sair.\n-> ");
		opcaoMenu = ler.next().charAt(0);

		do {
			nomeAluno = null;
			notas = new Double[2];
			mediaAluno = 0.;
			somatorio = 0.;
			mostraLinha();
			System.out.print("Informe o nome do Aluno: ");
			nomeAluno = ler.next();

			for (int i = 0; i < notas.length; i++) {
				System.out.print("Informe a " + (1 + i) + "º Nota: ");
				notas[i] = ler.nextDouble();

				somatorio += notas[i];
			}

			mediaAluno = somatorio / 2;

			aluno = new Aluno(nomeAluno, notas, mediaAluno);
			lista_Alunos_Notas_Medias.add(aluno);

			mostraLinha();
			System.out.println(
					"Se deseja Prosseguir adicionando, informe uma das Opções a seguir\n'S'-> Adicionar Aluno, notas e Calcular Média.\n'N'-> Sair.\n-> ");
			opcaoMenu = ler.next().charAt(0);

			if (!(opcaoMenu == 's' || opcaoMenu == 'S')) {
				mostraLinha();
				System.err.println("programa Encerrado.");
				break;
			}

		} while (opcaoMenu == 's' || opcaoMenu == 'S');

		
		System.out.println(aluno.alunosAprovados(lista_Alunos_Notas_Medias));
		mostraLinha();
		System.out.println(aluno.alunosReprovados(lista_Alunos_Notas_Medias));
		mostraLinha();
		ler.close();
	}

}
