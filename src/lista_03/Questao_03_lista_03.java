package lista_03;

import java.util.Scanner;

public class Questao_03_lista_03 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {

		/*
		 * Escreva um programa com um método que receba uma String e retorne o número de
		 * vogais dessa String.
		 */
		Scanner ler = new Scanner(System.in);
		String palavra = "";

		mostraLinhas();
		System.out.println("Digite uma palavra: ");
		palavra = ler.nextLine();
		mostraLinhas();

		char[] letras_da_Palavra = new char[palavra.length()];
		char[] vogais = { 'a', 'e', 'i', 'o', 'u' };
		int contador_vogais = 0;

		for (int i = 0; i < letras_da_Palavra.length; i++) {
			letras_da_Palavra[i] = palavra.charAt(i);
		}

		for (int i = 0; i < letras_da_Palavra.length; i++) {
			if(letras_da_Palavra[i] == vogais[0]) {
				contador_vogais +=1;
			}
			else if(letras_da_Palavra[i] == vogais[1]) {
				contador_vogais +=1;
			}
			else if(letras_da_Palavra[i] == vogais[2]) {
				contador_vogais +=1;
			}
			else if(letras_da_Palavra[i] == vogais[3]) {
				contador_vogais +=1;
			}
			else if(letras_da_Palavra[i] == vogais[4]) {
				contador_vogais +=1;
			}
		}

		System.out.println("Quantidade de Vogais: " + contador_vogais);
		mostraLinhas();
		ler.close();
	}
}
