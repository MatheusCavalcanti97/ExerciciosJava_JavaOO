package lista_02;
import java.util.Scanner;

public class Questao_01_lista_02 {
	static String mostrar_linhas() {
		String linhas = "--------------------------------------------------";
		return linhas;
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double numero, soma = 0;
		String mensagem = "";
		Double[] array_numeros = new Double[10];

		for (int i = 0; i < array_numeros.length; i++) {
			mostrar_linhas();
			System.out.print("Informe o " + (i + 1) + "º Número: ");
			numero = ler.nextDouble();
			array_numeros[i] = numero;
			mensagem += array_numeros[i] + " ";
			soma += array_numeros[i];

			if (i == array_numeros.length - 1) {
				mostrar_linhas();
				System.out.println("A soma dos Numeros " + mensagem + "é: " + soma);
				mostrar_linhas();
			}
		}

		ler.close();

	}

}
