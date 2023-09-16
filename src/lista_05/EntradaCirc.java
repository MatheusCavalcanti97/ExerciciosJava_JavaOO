package lista_05;

import java.util.Scanner;

public class EntradaCirc {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Circulo novoCirc = null;

		double raioCirc = 0;
		int opcaoMenu;
		int nome = 0;

		do {
			System.out.println("-------------------------------------------------------------");
			System.out.print("Informe uma das opções a seguir.\n" + "\n1. Criar um círculo (Digitar valor de r)\n"
					+ "2. Calcular Área\n" + "3. Calcular Perímetro\n" + "0. Sair\n-> ");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {
			case 1:
				raioCirc = 0;
				System.out.println("-------------------------------------------------------------");
				System.out.println("Informe o tamanho do Raio do Circulo em m²: ");
				raioCirc = ler.nextDouble();

				novoCirc = new Circulo(raioCirc);
				System.out.println("-------------------------------------------------------------");
				System.out.println("Circulo Inserido com Sucesso.");

				break;

			case 2:
				Circulo circ = (Circulo) novoCirc;
				System.out.println("-------------------------------------------------------------");
				System.out.println("Aqui será Calculado a Área do Circulo");
				System.out.println("A área do retangulo é: " + circ.calculaAreaCirculo() + " m².");
				break;

			case 3:
				Circulo circ2 = (Circulo) novoCirc;
				System.out.println("-------------------------------------------------------------");
				System.out.println("Aqui será Calculado o Perimetro do Retangulo");
				System.out.println("A área do retangulo é: " + circ2.calculaPerimetroCirculo() + " m².");
				break;
			case 0:
				System.out.println("-------------------------------------------------------------");
				System.out.println("Programa Encerrado. Até logo.");
				break;

			default:
				System.out.println("-------------------------------------------------------------");
				System.out.println("Opcao digitada de maneira incorreta.\nTente Novamente.");
				break;
			}

		} while (opcaoMenu != 0);

		System.out.println("-------------------------------------------------------------");
		ler.close();

	}

}