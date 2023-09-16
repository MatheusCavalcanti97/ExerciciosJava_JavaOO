package lista_02;
import java.util.Scanner;

public class Questao_07_lista_02 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		String palavra = "", palavraInvertida = "";

		mostra_linhas();
		System.out.println("Informe uma Palavra: ");
		palavra = ler.next();
		mostra_linhas();
		char[] vetorPalavra = new char[palavra.length()];

		for (int i = 0; i < vetorPalavra.length; i++) {
			vetorPalavra[i] = palavra.charAt(i);
		}

		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraInvertida += vetorPalavra[i];
		}
		System.out.println("Palavra Inserida: " + palavra);
		System.out.println("Palavra Invertida: " + palavraInvertida);
		mostra_linhas();
		ler.close();

	}

}
