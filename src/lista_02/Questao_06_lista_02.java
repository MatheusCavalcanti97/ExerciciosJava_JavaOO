package lista_02;
import java.util.Scanner;

public class Questao_06_lista_02 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int tamanhoVetor01 = 0, tamanhoVetor02 = 0;
		String[] vetor01;
		String[] vetor02;
		String valor = null;
		boolean flag = true;

		mostra_linhas();
		System.out.print("Informe o Tamanho do Vetor 01: ");
		tamanhoVetor01 = ler.nextInt();

		mostra_linhas();
		System.out.print("Informe o tamanho do Vetor 02: ");
		tamanhoVetor02 = ler.nextInt();

		if (tamanhoVetor01 == tamanhoVetor02) {
			vetor01 = new String[tamanhoVetor01];
			vetor02 = new String[tamanhoVetor02];

			mostra_linhas();
			valor = "";
			for (int i = 0; i < vetor01.length; i++) {
				System.out.print("Informe o " + (i + 1) + "º Valor do Vetor 01: ");
				valor = ler.next();
				vetor01[i] = valor;
			}
			valor = "";
			for (int i = 0; i < vetor02.length; i++) {
				System.out.print("Informe o " + (i + 1) + "º Valor do Vetor 02: ");
				valor = ler.next();
				vetor02[i] = valor;
			}

			for (int i = 0; i < vetor01.length; i++) {
				for (int j = 0; j < vetor02.length; j++) {
					if (i < vetor01.length) {
						if (vetor01[i].equals(vetor02[j])) {
							flag = true;
						} else {
							flag = false;
						}
					}
				}
			}

			if (flag == true) {
				mostra_linhas();
				System.out.println("Os vetores são iguals.");
			} else {
				mostra_linhas();
				System.out.println("Os vetores são diferentes.");
			}
		} else {
			mostra_linhas();
			System.out.println(
					"O tamanho dos vetores são diferentes, por isso não terá como comparar o conteudo de casa Vetor.");
		}

		mostra_linhas();
		ler.close();
	}

}
