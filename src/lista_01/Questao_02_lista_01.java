package lista_01;
import java.util.Scanner;

public class Questao_02_lista_01 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double altura = 0, media_alturas = 0, soma_alturas = 0;
		Double[] alturas = new Double[5];

		for (int i = 0; i < alturas.length; i++) {
			mostra_linhas();
			System.out.print("Informe a " + (i + 1) + "º Altura: ");
			altura = ler.nextDouble();
			alturas[i] = altura;
			soma_alturas += alturas[i];

			if (i == alturas.length - 1) {
				mostra_linhas();
				media_alturas = soma_alturas / (alturas.length);
				System.out.println("A média das Alturas informadas é: " + media_alturas);
			}
		}
		ler.close();
	}
}
