package lista_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao_01_lista_04 {
	public static void mostraLinhas() {
		System.out.println("--------------------------------------------------");
	}

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		PessoaLista04 p1 = null;
		List<PessoaLista04> listaP = new ArrayList<>();
		char opcao_de_break = 's';
		String nomePessoa = null;
		Double salarioPessoa = null;

		do {
			nomePessoa = "";
			salarioPessoa = 0.0;
			mostraLinhas();
			System.out.print("Informe um Nome: ");
			nomePessoa = ler.next();
			System.out.print("Informe o Salário da Pessoa: ");
			salarioPessoa = ler.nextDouble();

			p1 = new PessoaLista04(nomePessoa, salarioPessoa);
			listaP.add(p1);

			System.out.print("Deseja continuar cadastrando mais pessoas e salarios? s/n -> ");
			opcao_de_break = ler.next().charAt(0);

			if (!(opcao_de_break == 's') || !(opcao_de_break != 'S')) {
				mostraLinhas();
				System.out.println("O programa foi Encerrado.");
			}
		} while (opcao_de_break == 's' || opcao_de_break == 'S');

		mostraLinhas();
		System.out.println("Funcionário com Rendimentos acima de R$5000,00.");
		System.out.print(p1.salario_maior_que_5Mil(listaP));
		mostraLinhas();
		System.out.println("Lista de Todos as Pessoas e Salários.");
		System.out.print(p1.toString() + "\n");
		mostraLinhas();
		ler.close();
	}

}
