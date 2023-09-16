package lista_01;
import java.util.Scanner;

public class Questao_06_lista_01 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		// Leia o peso e a altura de 05 pessoas e calcule o IMC e armazene em um
		// vetor. Após o termino do programa, imprima as seguintes informações:
		// 1. O Número de pessoas que estão abaixo do peso (IMC < 18,5);
		// 2. O Número de pessoas que estão dentro do peso ideal (IMC > 18,5 e IMC <
		// 25);
		// 3. O Número de pessoas que estão acima do peso (IMC > = 25)

		Scanner ler = new Scanner(System.in);
		Double[] imc = new Double[5];
		double peso, altura, imc_calc = 0;
		int imc_menor = 0, imc_intermediario = 0, imc_alto = 0;

		for (int i = 0; i < imc.length; i++) {
			mostra_linhas();
			mostra_linhas();
			System.out.println("Informe as Informações da " + (i + 1) + "º Pessoa:");

			System.out.println("Informe o Peso da Pessoa em KG: ");
			peso = ler.nextDouble();

			System.out.println("Informe a Altura da Pessoa em Metros: ");
			altura = ler.nextDouble();

			imc_calc = (peso / (altura * altura));
			imc[i] = imc_calc;
		}

		for (int i = 0; i < imc.length; i++) {
			if (imc[i] < 18.5) {
				imc_menor += 1;
			}

			if (imc[i] > 18.5 && imc[i] < 25) {
				imc_intermediario += 1;
			}

			if (imc[i] > 25) {
				imc_alto += 1;
			}
		}
		mostra_linhas();
		mostra_linhas();
		System.out.println("Quantidade de Pessoas com IMC MENOR do que 18.5: " + imc_menor);
		mostra_linhas();
		System.out.println("Quantidade de Pessoas com IMC entre 18.5 e menor do que 25: " + imc_intermediario);
		mostra_linhas();
		System.out.println("Quantidade de Pessoas com IMC MAIOR do que 25: " + imc_alto);
		mostra_linhas();
		ler.close();
	}

}
