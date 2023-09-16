package lista_03;

import java.util.Scanner;

public class Questao_05_lista_03 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static double calculo_de_area_ou_perimetro(int opcao, double base, double altura) {
		double resultado = 0;

		if (opcao == 1) {
			resultado = base * altura;
		}
		if (opcao == 2) {
			resultado = ((2 * base) + (2 * altura));
		}
		return resultado;
	}

	public static void main(String[] args) {
		/*
		 * Escreva um programa com métodos para calcular a área (B x H) e o perímetro de
		 * um retângulo (2B * 2H).
		 * 
		 * Forneça as seguintes opções ao usuário: 1. Calcular a área do retângulo. 2.
		 * Calcular o perímetro do retângulo.
		 * 
		 */

		Scanner ler = new Scanner(System.in);
		int opcao, contador = 0;
		double base, altura;

		mostraLinhas();
		System.out.print(
				"Informe uma das opções a seguir:\n1. Calcular Aréa do Retângulo.\n2. Calcular Perimento do Retânculo.\n0. Sair. -> ");
		opcao = ler.nextInt();
		mostraLinhas();

		while (opcao != 0) {
			if (contador >= 1 && opcao != 0) {
				mostraLinhas();
				System.out.print(
						"Se deseja Continuar realizando Calculos Informe uma das opções a seguir:\n1. Calcular Aréa do Retângulo.\n2. Calcular Perimento do Retânculo.\n0. Sair. -> ");
				opcao = ler.nextInt();
				mostraLinhas();
			}

			if (opcao != 0) {
				System.out.println("Informe o tamanho da base do Retângulo: ");
				base = ler.nextDouble();
				mostraLinhas();
				System.out.println("Informe a altura do Retângulo: ");
				altura = ler.nextDouble();

				if (opcao == 1) {
					mostraLinhas();
					System.out.println(
							"Você selecionou para Calcular a Área do Retangulo.\n- base: " + base + "\n- altura: "
									+ altura + "\n- Área: " + calculo_de_area_ou_perimetro(opcao, base, altura));
				} else if (opcao == 2) {
					mostraLinhas();
					System.out.println(
							"Você selecionou para Calcular o Perímetro do Retangulo.\n- base: " + base + "\n- altura: "
									+ altura + "\n- Área: " + calculo_de_area_ou_perimetro(opcao, base, altura));
				}
			} else {
				System.out.println("Programa Encerrado. Até Logo.");
				break;
			}
			contador++;
		}
		mostraLinhas();
		ler.close();
	}

}
