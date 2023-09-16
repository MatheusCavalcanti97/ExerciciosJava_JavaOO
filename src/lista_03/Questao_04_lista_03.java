package lista_03;

import java.util.Scanner;

public class Questao_04_lista_03 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static double calculoDeImposto(double salario) {
		double valorDoImposto = 0;

		if (salario <= 2000) {
			valorDoImposto = salario;
		} else if (salario > 2000 && salario <= 3500) {
			valorDoImposto = salario * (15 / 100.0);
		} else if (salario > 3000 && salario <= 5000) {
			valorDoImposto = salario * (22 / 100.0);
		} else {
			valorDoImposto = salario * (30 / 100.0);
		}

		return valorDoImposto;
	}

	public static void main(String[] args) {
		/*
		 * Escreva um programa com um método que receba o salário de um funcionário e
		 * calcule o imposto que ele deve pagar. Utilize os seguintes valores para
		 * calcular o imposto:
		 * 
		 * • Até R$ 2.000,00 – Isento de imposto • De R$ 2.000,01 até R$ 3.500,00 – 15%
		 * de imposto • De R$ 3.500,01 até R$ 5.000,00 – 22% de imposto • Acima de R$
		 * 5.000,01 – 30% de imposto
		 */

		Scanner ler = new Scanner(System.in);
		double salario = 0;

		mostraLinhas();
		System.out.println("Informe o Salário do Trabalhador: ");
		salario = ler.nextDouble();
		mostraLinhas();
		mostraLinhas();
		if (salario <= 2000) {
			System.out.println("O trabalhador estar isento do IR.");
		} else if (salario > 2000 && salario <= 3500) {
			System.out.println(
					"O trabalhador não está isento do IR.\nEle pagará 15% dos rendiemento que giram em torno de R$ "
							+ calculoDeImposto(salario));
		} else if (salario > 3000 && salario <= 5000) {
			System.out.println(
					"O trabalhador não está isento do IR.\nEle pagará 22% dos rendiemento que giram em torno de R$ "
							+ calculoDeImposto(salario));
		} else {
			System.out.println(
					"O trabalhador não está isento do IR.\nEle pagará 30% dos rendiemento que giram em torno de R$ "
							+ calculoDeImposto(salario));
		}
		mostraLinhas();
		ler.close();

	}

}
