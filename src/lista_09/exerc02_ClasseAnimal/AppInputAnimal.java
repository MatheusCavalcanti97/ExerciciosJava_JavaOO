package lista_09.exerc02_ClasseAnimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppInputAnimal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Peixe novoPeixe = null;
		Mamifero novoMamifero = null;
		List<Animal> listaDeAnimais = new ArrayList<Animal>();

		String nomeAnimal = null, corAnimal = null, ambienteAnimal = null, alimentoAnimal = null;
		double comprimentoAnimal = 0, velocidadeAnimal = 0;
		int numeroDePatas = 0;
		boolean barbatanas = false, cauda = false;

		Integer opcaoMenu = null, opcaoAnimal = null;

		do {

			System.out.println("---------------------------------------------" + "\nInforme uma das Opções a seguir:"
					+ "\n1. Incluir dados relativo a um peixe." + "\n2. Incluir dados relativo a um mamífero."
					+ "\n3. Listar todos os animais cadastrados." + "\n4. Lista todos os peixes cadastrados."
					+ "\n0. Sair.");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {

			case 1:
				nomeAnimal = null;
				comprimentoAnimal = 0.;
				corAnimal = null;
				ambienteAnimal = null;
				numeroDePatas = 0;
				velocidadeAnimal = 0;
				barbatanas = false;
				cauda = false;
				String opcaoBarbatanaAndCauda = null;

				System.out.println("---------------------------------------------");
				System.out.println("Insira as Informações referentes ao Peixe");
				System.out.println("---------------------------------------------");
				ler.nextLine();

				System.out.println("Informe o nome do Nome do Peixe: ");
				nomeAnimal = ler.nextLine();

				System.out.println("Informe o Tamanho do Peixe: ");
				comprimentoAnimal = ler.nextDouble();

				System.out.println("Informe a Velocidade que o peixe se locomove em m/s: ");
				velocidadeAnimal = ler.nextDouble();

				ler.nextLine();
				System.out.println("Informe a cor do Peixe: ");
				corAnimal = ler.nextLine();

				System.out.println("O peixe possui Barbatana? Digite SIM ou NÃO.");
				opcaoBarbatanaAndCauda = ler.nextLine();

				if (opcaoBarbatanaAndCauda.equalsIgnoreCase("SIM")) {
					barbatanas = true;

				} else {
					barbatanas = false;
				}

				ambienteAnimal = "OCEANO";
				numeroDePatas = 0;
				cauda = true;

				novoPeixe = new Peixe(nomeAnimal, comprimentoAnimal, numeroDePatas, corAnimal, ambienteAnimal,
						velocidadeAnimal, barbatanas, cauda);
				listaDeAnimais.add(novoPeixe);

				System.out.println("--------------------------------------------");
				System.out.println("Peixe Adicionado com Sucesso.");

				break;

			// inicio switch case 2
			case 2:
				nomeAnimal = null;
				comprimentoAnimal = 0.;
				corAnimal = null;
				ambienteAnimal = null;
				numeroDePatas = 0;
				velocidadeAnimal = 0;
				alimentoAnimal = null;

				System.out.println("---------------------------------------------");
				System.out.println("Insira as Informações referentes ao Mamifero");
				System.out.println("---------------------------------------------");
				ler.nextLine();

				System.out.println("Informe o nome do Animal: ");
				nomeAnimal = ler.nextLine();

				System.out.println("Informe o Tamanho do Animal: ");
				comprimentoAnimal = ler.nextDouble();

				ler.nextLine();

				System.out.println("Informe a cor do Animal: ");
				corAnimal = ler.nextLine();

				System.out.println("Informe o Número de Patas do Animal: ");
				numeroDePatas = ler.nextInt();

				System.out.println("Informe a velocidade Máxima de Locomoção do Animal: ");
				velocidadeAnimal = ler.nextDouble();
				
				ler.nextLine();
				System.out.println("Informe a Comida predileta do Animal: ");
				alimentoAnimal = ler.nextLine();

				ambienteAnimal = "TERRESTRE";

				novoMamifero = new Mamifero(nomeAnimal, comprimentoAnimal, numeroDePatas, corAnimal, ambienteAnimal,
						velocidadeAnimal, alimentoAnimal);
				listaDeAnimais.add(novoMamifero);

				break;

			// inicio switch case 3
			case 3:
				System.out.println("-----------------------------------------------------");
				System.out.println("Todos Peixes Inseridos no Sistema:");
				System.out.println("-----------------------------------------------------\n");
				for (int i = 0; i < listaDeAnimais.size(); i++) {
					Animal new_animal = listaDeAnimais.get(i);
					if (new_animal instanceof Peixe) {
						Peixe new_p = (Peixe) listaDeAnimais.get(i);
						System.out.println(new_p.toString());
						System.out.println("\n-----------------------------------------------------\n");
					}
				}

				System.out.println("-----------------------------------------------------");
				System.out.println("Todos Mamiferos Inseridos no Sistema:");
				System.out.println("-----------------------------------------------------\n");

				for (int i = 0; i < listaDeAnimais.size(); i++) {
					Animal new_animal = listaDeAnimais.get(i);
					if (new_animal instanceof Mamifero) {
						Mamifero new_m = (Mamifero) listaDeAnimais.get(i);
						System.out.println(new_m.toString());
						System.out.println("\n-----------------------------------------------------\n");
					}
				}
				break;

			// inicio switch case 4
			case 4:

				for (int i = 0; i < listaDeAnimais.size(); i++) {
					Peixe new_p = (Peixe) listaDeAnimais.get(i);

					if (new_p instanceof Peixe) {
						System.out.println("--------------------------------------------");
						System.out.println(new_p.toString());
					}
				}

				break;

			case 0:
				System.out.println("---------------------------------------------");
				System.out.println("Programa Encerrado. Até lOgo.\n");

				break;
			} // FIM SWICTH CASE PRINCIPAL

		} while (opcaoMenu != 0);

		ler.close();

	}

}
