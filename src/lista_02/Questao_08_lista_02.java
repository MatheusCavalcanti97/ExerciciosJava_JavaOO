package lista_02;
import java.util.Scanner;

public class Questao_08_lista_02 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra = "";

		mostra_linhas();
		System.out.print("Informe uma palavra: ");
		palavra = ler.next();

		mostra_linhas();
		System.out.println("O número de letras dessa palavra é: " + palavra.length());
		mostra_linhas();
		ler.close();
	}

}
