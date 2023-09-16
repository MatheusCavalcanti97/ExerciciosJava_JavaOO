package lista_04;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_03_lista_04 {
	public static void mostraLinha() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		PessoaIMC infoPessoa = null;
		Scanner ler = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("0.00");

		String nomePessoa = "";
		double pesoPessoa, alturaPessoa, imcPessoa;
		List<PessoaIMC> listaPessoas = new ArrayList<>();
		Character opcaoMenu = null;

		do {
			nomePessoa = "";
			pesoPessoa = 0;
			alturaPessoa = 0;
			imcPessoa = 0;

			mostraLinha();
			System.out.print("Informe o Nome da Pessoa: ");
			nomePessoa = ler.next();
			mostraLinha();
			System.out.print("Informe o Peso da Pessoa: ");
			pesoPessoa = ler.nextDouble();
			mostraLinha();
			System.out.print("informe a Altura da Pessoa: ");
			alturaPessoa = ler.nextDouble();

			infoPessoa = new PessoaIMC(nomePessoa, pesoPessoa, alturaPessoa, imcPessoa);
			listaPessoas.add(infoPessoa);

			mostraLinha();
			System.out.println(
					"Caso dese continuar inserindo Pessoas e duas respectivas Informações digite 's' ou 'n' para sair.\n-> ");
			opcaoMenu = ler.next().charAt(0);

		} while (opcaoMenu.equals('s') || opcaoMenu.equals('S'));
		
		mostraLinha();
		System.out.println(listaPessoas.get(0).getImcPessoa());
		System.out.println(infoPessoa.getImcPessoa());

		ler.close();

	}

}
