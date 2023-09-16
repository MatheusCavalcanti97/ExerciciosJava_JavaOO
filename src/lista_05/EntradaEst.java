package lista_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaEst {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Aluno novoAluno = null;
		Endereco enderecoAluno = null;

		String nomeAluno = null, numeroDeMatricula = null, nomeRua = null, logradouro = null, bairro = null,
				numeroCasa = null, cidade = null, cepCidade = null, estado = null;
		double[] notasAluno;
		double nota = 0;

		List<Aluno> listaAlunos = new ArrayList<>();

		char opcaoMenu = ' ';

		do {
			System.out.println("------------------------------------------------------------");
			opcaoMenu = ' ';
			System.out.println("Informe uma das Opções a Seguir.\n" + "1. Criar um Estudante\n"
					+ "2. Calcular Média (Se o Aluno foi Aprovado, informe ao usuário)\n"
					+ "3. Obter número de matricula\n" + "4. Obter Endereço\n" + "0. Sair.\n-> ");
			opcaoMenu = ler.next().charAt(0);
			System.out.println("------------------------------------------------------------");

			switch (opcaoMenu) {

			case '1':
				nomeAluno = "";

				System.out.print("Informe o Nome do Aluno: ");
				nomeAluno = ler.next();
				System.out.println("------------------------------------------------------------");

				System.out.print("Informe o Número da Matrícula do Aluno: ");
				numeroDeMatricula = ler.next();
				System.out.print("------------------------------------------------------------");

				nomeRua = "Rua 13 de Novembro";
				logradouro = "Casa";
				bairro = "Centro";
				numeroCasa = "399A";
				cepCidade = "55415000";
				
				System.out.print("\nInforme a Cidade do Aluno: ");
				cidade = ler.nextLine();
				
				System.out.print("Informe o Estado do Aluno: ");
				estado = ler.nextLine();

				System.out.println("------------------------------------------------------------");
				notasAluno = new double[4];
				for (int i = 0; i < notasAluno.length; i++) {
					nota = 0;
					System.out.print("Informe a " + (i + 1) + "º Nota do Aluno: ");
					nota = ler.nextDouble();
					notasAluno[i] = nota;
				}

				enderecoAluno = new Endereco(nomeRua, logradouro, bairro, numeroCasa, cidade, cepCidade, estado);
				novoAluno = new Aluno(nomeAluno, numeroDeMatricula, enderecoAluno, notasAluno);
				listaAlunos.add(novoAluno);

				System.out.println("------------------------------------------------------------");
				System.out.println("Aluno Inserido com Sucesso.");

				break;

			case '2':

				System.out.println("------------------------------------------------------------");
				nomeAluno = null;
				System.out.println("Informe o nome do Aluno: ");
				nomeAluno = ler.next();

				for (int i = 0; i < listaAlunos.size(); i++) {
					Aluno p = listaAlunos.get(i);
					if (p.getNomePessoa().equalsIgnoreCase(nomeAluno)) {
						if (p instanceof Aluno) {
							Aluno a = (Aluno) p;
							if (a.calculaMedia() >= 7) {
								System.out.println("Média: " + a.calculaMedia() + " -- Situação: APROVADO.");
							} else {
								System.out.println("Média: " + a.calculaMedia() + " -- Situação: REPROVADO.");
							}

						}
					}
				}
				break;

			case '3':
				System.out.println("------------------------------------------------------------");
				nomeAluno = null;
				System.out.println("Informe o nome do Aluno: ");
				nomeAluno = ler.next();

				for (int i = 0; i < listaAlunos.size(); i++) {
					Aluno p = listaAlunos.get(i);
					if (p.getNomePessoa().equalsIgnoreCase(nomeAluno)) {
						if (p instanceof Aluno) {
							Aluno a = (Aluno) p;
							System.out.println("A Matricula do Aluno é: " + a.getNumeroDeMatricula() + ".");
						}
					}
				}

				break;

			case '4':
				System.out.println("------------------------------------------------------------");
				nomeAluno = null;
				System.out.println("Informe o nome do Aluno: ");
				nomeAluno = ler.next();

				for (int i = 0; i < listaAlunos.size(); i++) {
					Aluno p = listaAlunos.get(i);
					if (p.getNomePessoa().equalsIgnoreCase(nomeAluno)) {
						if (p instanceof Aluno) {
							Aluno a = (Aluno) p;
							System.out.println("O Endereço do Aluno é: " + a.getEnderecoAluno().getNomeRua() + ", "
									+ a.getEnderecoAluno().getLogradouro() + ", " 
									+ a.getEnderecoAluno().getBairro() + ", "
									+ a.getEnderecoAluno().getCidade() + ", " 
									+ a.getEnderecoAluno().getCepCidade() + " - " 
									+ a.getEnderecoAluno().getEstado() + ".");
						}
					}
				}

				break;

			default:
				break;

			}

		} while (opcaoMenu != '0');

	}

}
