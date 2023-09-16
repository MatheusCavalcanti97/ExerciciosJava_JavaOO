package lista_02;
import java.util.Scanner;

public class Questao_02_lista_02 {
	static String mostrar_linhas() {
		String linhas = "--------------------------------------------------";
		return linhas;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double[] conjuntos_numeros = new Double[10];
		double var = 0, maior_valor = 0, menor_valor = 9999, media_valores = 0;

		mostrar_linhas();
		for (int i = 0; i < conjuntos_numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º Número: ");
			var = ler.nextDouble();
			conjuntos_numeros[i] = var;
			media_valores += var;

			if (i == conjuntos_numeros.length - 1) {
				media_valores /= 10;
			}
		}

		for (int i = 0; i < conjuntos_numeros.length; i++) {

			if (conjuntos_numeros[i] < menor_valor) {
				menor_valor = conjuntos_numeros[i];
			}

			if (conjuntos_numeros[i] > maior_valor) {
				maior_valor = conjuntos_numeros[i];
			}

		}

		System.out.println(mostrar_linhas());
		System.out.println("Maior Número: " + maior_valor);
		System.out.println("Menor Número: " + menor_valor);
		System.out.println("A média dos Valores inseridos é de: " + media_valores);
		System.out.println(mostrar_linhas());
		ler.close();
	}
}
