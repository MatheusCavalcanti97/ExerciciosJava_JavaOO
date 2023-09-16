package lista_03;

import java.util.Scanner;

public class Questao_06_lista_03 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static double conversao_de_temperaturas(int opcaoTemperatura, double temperatura) {
		double temperaturaConvertida = 0;

		if (opcaoTemperatura == 1) {
			temperaturaConvertida = 5 * ((temperatura - 32) / 9);
		}

		if (opcaoTemperatura == 2) {
			temperaturaConvertida = temperatura - 273.15;
		}

		return temperaturaConvertida;
	}

	public static void main(String[] args) {
		/*
		 * Escreva um programa com métodos que façam a conversão de Fahrenheit para
		 * Celsius e de Kelvin para Celsius).
		 * 
		 * Forneça as seguintes opções ao usuário: 1. Transformar de Fahrenheit para
		 * Celsius 2. Transformar de Kelvin para Celsius
		 */
		Scanner ler = new Scanner(System.in);
		double temperatura = 0;
		int opcaoTemperatura = 0, contador = 0;

		mostraLinhas();
		System.out.print(
				"Informe uma das Opções a Seguir.\n1. Transformar de Fahrenheit para Celsius.\n2. Transformar de Kelvin para Celsius.\n0. Sair.\n-> ");
		opcaoTemperatura = ler.nextInt();
		mostraLinhas();

		while (opcaoTemperatura != 0) {
			if (contador >= 1) {
				mostraLinhas();
				System.out.print(
						"Para Continuar Calculando Informe uma das Opções a Seguir.\n1. Transformar de Fahrenheit para Celsius.\n2. Transformar de Kelvin para Celsius.\n0. Sair.\n-> ");
				opcaoTemperatura = ler.nextInt();
				mostraLinhas();
			}

			if (opcaoTemperatura != 0) {

				if (opcaoTemperatura == 1) {
					System.out.println("Informe a Temperantura em Fahrenheit: ");
					temperatura = ler.nextDouble();
					mostraLinhas();
					System.out.println("A temperatura de Fahrenheit para Celsius é: "
							+ conversao_de_temperaturas(opcaoTemperatura, temperatura) + "°.");

				} else if (opcaoTemperatura == 2) {
					System.out.println("Informe a Temperantura em Kelvin: ");
					temperatura = ler.nextDouble();
					mostraLinhas();
					System.out.println("A temperatura de Kelvin para Celsius é: "
							+ conversao_de_temperaturas(opcaoTemperatura, temperatura) + "°.");
				} else {
					mostraLinhas();
					System.out.println("Informe uma opção Válida\nTente Novamente.");
				}
			} else {
				mostraLinhas();
				System.out.println("Programa Encerrado. Até logo.");
			}
			contador++;
		}
		mostraLinhas();
		ler.close();

	}

}
