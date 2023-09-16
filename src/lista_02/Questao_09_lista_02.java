package lista_02;
import java.util.Scanner;

public class Questao_09_lista_02 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String palavra = "";
		char vogais[] = { 'a', 'e', 'i', 'o', 'u' };
		int contadorDeVogais = 0;

		mostra_linhas();
		System.out.print("Informe um palavra: ");
		palavra = ler.next();
		char palavraArray[] = new char[palavra.length()];

		for (int i = 0; i < palavra.length(); i++) {
			palavraArray[i] = palavra.charAt(i);
		}

		for (int i = 0; i < palavraArray.length; i++) {
			for (int j = 0; j < vogais.length; j++) {
				if (j != vogais.length) {
					if (palavraArray[i] == vogais[j]) { // modificar para não diferenciar letras maiusculas e menusculas
						contadorDeVogais += 1;
					}
				}
			}
		}
		mostra_linhas();
		System.out.println(contadorDeVogais);
		mostra_linhas();
		ler.close();
	}
}
