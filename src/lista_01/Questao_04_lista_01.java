package lista_01;
import java.util.Scanner;

public class Questao_04_lista_01 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		// Escreva um programa que leia a idade de várias pessoas e calcule a média.
		// O programa deve ler as idades até o usuário digitar 0 (zero).

		Scanner ler = new Scanner(System.in);
		Integer idade = 0, somatorio_idades = 0, contador = 0;
		double media_idades = 0;

		do {
			mostra_linhas();
			System.out.println("Informe a " + (contador + 1) + "º Idade: ");
			idade = ler.nextInt();
			somatorio_idades += idade;
			contador++;

			if (idade == 0) {
				contador--;
				media_idades = somatorio_idades / contador;
				break;
			}

		} while (idade != 0);

		mostra_linhas();
		System.out.println("A média de Idade é: " + media_idades + ".");
		mostra_linhas();
		ler.close();

	}

}
