package lista_02;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_05_lista_02 {
	static void mostra_linhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		List<String> nomes = new ArrayList<>();
		int cont = 0;
		String pesquisa_nome = "", nome = null;

		nome = "";
		mostra_linhas();
		while (nome != null || nome.isEmpty()) {
			cont += 1;
			System.out.print("Informe o " + cont + "º Nome: ");
			nome = ler.nextLine();

			if (nome == "") {
				break;
			}

			if (nome != "" || nome != null) {
				nomes.add(nome);
			}
		}

		mostra_linhas();
		System.out.print("Informe um Nome para buscar na lista: ");
		pesquisa_nome = ler.nextLine();
		boolean flag = true;

		for (int i = 0; i < nomes.size(); i++) {

			if (pesquisa_nome.equalsIgnoreCase(nomes.get(i))) {
				mostra_linhas();
				System.out.println("O nome esta adicionado a lista.");
				flag = true;
				break;
			} else {
				flag = false;
			}

			if (i == nomes.size() - 1 && flag == false) {
				mostra_linhas();
				System.out.println("Nome nao encontrado.");
			}
		}
		mostra_linhas();
		ler.close();
	}
}
