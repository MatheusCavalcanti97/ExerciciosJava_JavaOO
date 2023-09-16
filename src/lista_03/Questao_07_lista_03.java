package lista_03;

import java.util.Scanner;

public class Questao_07_lista_03 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static double mediasDasMedias(double[] medias) {
		double media_das_medias = 0;
		for (int i = 0; i < medias.length; i++) {
			media_das_medias += medias[i];
			if (i == medias.length - 1) {
				media_das_medias /= medias.length;
			}
		}
		return media_das_medias;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int quantidadeDeMedias = 0;
		double nota1, nota2;

		mostraLinhas();
		System.out.println("Informe a quantidade de Médias que deseja inserir no Array: ");
		quantidadeDeMedias = ler.nextInt();
		mostraLinhas();

		double[] medias = new double[quantidadeDeMedias];

		for (int i = 0; i < medias.length; i++) {
			System.out.println("Informe a primeira nota do " + (i + 1) + "º Aluno: ");
			nota1 = ler.nextDouble();
			mostraLinhas();
			System.out.println("Informe a segunda nota do " + (i + 1) + "º Aluno: ");
			nota2 = ler.nextDouble();

			medias[i] = (nota1 + nota2 / 2);
			mostraLinhas();
		}
		mostraLinhas();
		System.out.println("A média das médias inseridas é: " + mediasDasMedias(medias));
		ler.close();
	}

}
