package lista_03;

import java.util.Scanner;

public class Questao_02_lista_03 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static String retorna_resultado_Operacao(char operacao, double num1, double num2) {
		double resultadoOperacoes = 0;
		String resultado = "";
		
		switch(operacao){
			case '+':
				resultadoOperacoes = num1 + num2;
				resultado = "A Soma entre " + num1 + " + " + num2 + " é: " +  resultadoOperacoes;
			break;
			case '-':
				resultadoOperacoes = num1 - num2;
				resultado = "A Subtração entre " + num1 + " - " + num2 + " é: " +  resultadoOperacoes;
			break;
			case '*':
				resultadoOperacoes = num1 * num2;
				resultado = "A Multiplicação entre " + num1 + " * " + num2 + " é: " +  resultadoOperacoes;
			break;
			case '/':
				resultadoOperacoes = num1 / num2;
				resultado = "A divisão entre " + num1 + " / " + num2 + " é: " +  resultadoOperacoes;
			break;
			
		}
		return resultado;
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double num1 = 0, num2 = 0;
		char operacao = ' ';

		mostraLinhas();
		System.out.println("Informe uma das Operações a Seguir:\n'+'. Somar.\n'-'. Subtrair.\n'*'. Multiplicar.\n'/'. Dividir.\n-> ");
		operacao = ler.next().charAt(0);
		mostraLinhas();
		
		mostraLinhas();
		System.out.println("Informe o 1º Número: ");
		num1 = ler.nextDouble();
		mostraLinhas();
		
		mostraLinhas();
		System.out.println("Informe o 2º Número: ");
		num2 = ler.nextDouble();
		mostraLinhas();
		
		if(num1 >= 0 && num2 > 0 ) {
			if (operacao == '+' || operacao == '-' || operacao == '*' || operacao == '/') {
				System.out.println(retorna_resultado_Operacao(operacao, num1, num2));
			}
			else {
				mostraLinhas();
				System.err.print("O operador foi inserido de maneira Incorreta.\nTente Novamente.");
			}
		} else {
			mostraLinhas();
			System.err.print("Insira valores Válidos.\nTente Novamente.");
		}
		mostraLinhas();
		ler.close();

	}
}
