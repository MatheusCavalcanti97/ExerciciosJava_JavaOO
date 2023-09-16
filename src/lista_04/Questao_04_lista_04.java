package lista_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_04_lista_04 {

	public static void retornaLinha() {
		System.out.println("----------------------------------------------------------------------");
	}

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		CalculaImpostoPessoa calcP;
		String nomePessoa = "";
		double salarioPessoa = 0, imposto = 0;

		List<CalculaImpostoPessoa> infoPessoa = new ArrayList<>();
		char opcaoMenu = ' ';

		do {
			retornaLinha();
			System.out.print("Insira o Nome da Pessoa: ");
			nomePessoa = ler.next();

			System.out.print("Informe o Salário da Pessoa: ");
			salarioPessoa = ler.nextDouble();

			imposto = 0.;

			calcP = new CalculaImpostoPessoa(nomePessoa, salarioPessoa, imposto);
			infoPessoa.add(calcP);

			nomePessoa = null;
			salarioPessoa = 0;

			retornaLinha();
			System.out.print("'S' -> Inserir\n'N' -> Sair\n-> ");
			opcaoMenu = ler.next().charAt(0);

		} while (opcaoMenu == 's' || opcaoMenu == 'S');

		retornaLinha();

		for (int i = 0; i < infoPessoa.size(); i++) {

			System.out.print(infoPessoa.get(i).getNomePessoa() + "\n");

		}

		retornaLinha();
		do {

			nomePessoa = "";
			System.out.print("Informe o nome da Pessoa que Você deseja Procurar: ");
			nomePessoa = ler.next();

			for (int i = 0; i < infoPessoa.size(); i++) {
				CalculaImpostoPessoa c_i = infoPessoa.get(i);
				if (nomePessoa.equalsIgnoreCase(c_i.getNomePessoa())) {
					CalculaImpostoPessoa p2 = (CalculaImpostoPessoa) c_i;
					System.out.println("A média do aluno é: " + p2.calculaImposto(nomePessoa, p2));

				}
			}

			retornaLinha();
			System.out.print("'S' -> Buscar Outra Pessoa\n'N' -> Sair\n-> ");
			opcaoMenu = ler.next().charAt(0);

		} while (opcaoMenu == 's' || opcaoMenu == 'S');

		ler.close();
	}

}
