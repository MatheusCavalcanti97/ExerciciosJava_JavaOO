package lista_02;
import java.util.Scanner;

public class Questao_04_lista_02 {
	public static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		double numero = 0;
		Double[] numeros_em_sequencia = new Double[10];
		String mostra_numeros_em_sequencia = "", mostra_numeros_ordem_inversa = "";

		mostra_linhas();
		for (int i = 0; i < numeros_em_sequencia.length; i++) {
			System.out.println("Digite o " + (i + 1) + "º Número: ");
			numero = ler.nextDouble();
			mostra_numeros_em_sequencia += (i + 1) + "º - " + numero + "\n";
			numeros_em_sequencia[i] = numero;
		}

		mostra_linhas();
		System.out.println(mostra_numeros_em_sequencia);
		mostra_linhas();

		for (int j = numeros_em_sequencia.length - 1; j >= 0; j--) {
			mostra_numeros_ordem_inversa += (j + 1) + "º - " + numeros_em_sequencia[j] + "\n";
		}

		System.out.println(mostra_numeros_ordem_inversa);
		mostra_linhas();
	}

}
