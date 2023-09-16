package lista_01;


import java.util.Scanner;

public class Questao_01_lista_01 {
	static String mostrar_linhas() {
		String linhas = "--------------------------------------------------";
		return linhas;
	}

	public static void main(String[] args) {
		// Escreva um programa que calcule a idade do usuário. Para isso, o
		// programa deve ler o ano de nascimento, o ano atual e depois mostrar a idade.
		// Obs.: O ano deve ser informado no formato AAAA (ex.: 1980).

		Scanner ler = new Scanner(System.in);
		int ano_nascimento = 0, ano_atual = 0, idade = 0;

		System.out.println(mostrar_linhas());
		System.out.print("Informe o ano de nascimento: ");
		ano_nascimento = ler.nextInt();

		System.out.print("Informe o Ano Atual: ");
		ano_atual = ler.nextInt();

		System.out.println(mostrar_linhas());
		idade = ano_atual - ano_nascimento;

		System.out.println("O idade da Pessoa é: " + idade);
		System.out.println(mostrar_linhas());
		ler.close();

	}

}
