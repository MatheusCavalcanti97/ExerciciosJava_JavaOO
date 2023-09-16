package lista_01;
import java.util.Scanner;

public class Questao_05_lista_01 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		// Escreva um programa que leia dois números e a operação aritmética
		// desejada.
		// Se o usuário digita ‘+’, retorne o resultado da soma entre os números;
		// Se o usuário digita ‘-’, retorne o resultado da subtração entre os números;
		// Se o usuário digita ‘*’, retorne o resultado da multiplicação entre os
		// números;
		// Se o usuário digita ‘/’, retorne o resultado da divisão entre os números;

		Scanner ler = new Scanner(System.in);
		double n1, n2;
		Character operacao = null;

		do {
			mostra_linhas();
			System.out.print("Informe qual das Operações a seguir voce deseja realizar:" + "\n-> '+'. Soma."
					+ "\n-> '-'. Subtracao." + "\n-> '*'. Multiplicacao." + "\n-> '\' Divisao."
					+ "\n-> Para Sair digite qualquer caracter: ");
			operacao = ler.next().charAt(0);

			if (operacao.equals('+') || operacao.equals('-') || operacao.equals('*') || operacao.equals('/')) {

				mostra_linhas();
				System.out.println("Informe o Primeiro Número: ");
				n1 = ler.nextInt();
				mostra_linhas();

				System.out.println("Informe o Segundo Número: ");
				n2 = ler.nextInt();
				mostra_linhas();

				switch (operacao) {

				case '+':
					System.out.println("O Resultado da SOMA entre os número é: " + (n1 + n2));
					break;

				case '-':
					System.out.println("O Resultado da SUBTRAÇÃO entre os número é: " + (n1 - n2));
					break;

				case '*':
					System.out.println("O Resultado da MULTIPLICAÇÃO entre os número é: " + (n1 * n2));
					break;

				case '/':
					System.out.println("O Resultado da divisão entre os número é: " + (n1 / n2));
					break;

				}
			} else {
				mostra_linhas();
				System.err.println("Voce Inseriu alguma opcao errada.\nTente Novamente.");
				System.exit(1);
				mostra_linhas();
			}

		} while (operacao.equals('+') || operacao.equals('-') || operacao.equals('*') || operacao.equals('/'));
		ler.close();
	}

}
