package lista_01;

public class Questao_03_lista_01 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");

	}

	public static void main(String[] args) {
		// Escreva um programa que imprima os números pares entre 0 e 30.

		String numerosPares = "Os Números Pares de 0 a 30 são: ";
		mostra_linhas();
		for (int i = 0; i <= 30; i++) {
			if (i < 30) {
				if (i % 2 == 0) {
					numerosPares += i + ", ";
				}
			} else if (i == 30) {
				if (i % 2 == 0) {
					numerosPares += i + ".";
				}
			}
		}
		System.out.println(numerosPares);
	}

}
