package lista_03;

import java.util.Scanner;

public class Questao_01_lista_03 {
	public static boolean verifica_se_par_ou_impar(int numero) {
		boolean flag = false;
		if (numero % 2 == 0) {
			return flag = true;
		} else {
			return flag = false;
		}
	}

	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0;

		mostraLinhas();
		System.out.println("Informe um Número: ");
		numero = ler.nextInt();
		mostraLinhas(); 

		if (verifica_se_par_ou_impar(numero) == true) {
			System.out.println("O numero inserido " + numero + " é: PAR.");
			mostraLinhas();
		} else {
			System.out.println("O numero inserido " + numero + " é: ÍMPAR.");
			mostraLinhas();
		}
		ler.close();
	}

}
