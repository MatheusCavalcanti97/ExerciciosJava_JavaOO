package lista_02;
import java.util.Scanner;

public class Questao_03_lista_02 {
	public static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double nota = 0, media = 0, soma_notas = 0;
		int contador_notas_media = 0;
		Double[] notas_array = new Double[10];

		mostra_linhas();
		for (int i = 0; i < notas_array.length; i++) {
			System.out.println("Informe a " + (i + 1) + "º Nota: ");
			nota = ler.nextDouble();
			notas_array[i] = nota;
			soma_notas += nota;

			if (i == notas_array.length - 1) {
				media = soma_notas / notas_array.length;
			}

			if (notas_array[i] >= 7) {
				contador_notas_media += 1;
			}
		}

		mostra_linhas();
		System.out.println("A média das Notas Informadas é: " + media);
		System.out.println("A quantidade de Alunos com nota maior ou igual a média (7,0) é: " + contador_notas_media);
		mostra_linhas();
		ler.close();
	}
}
