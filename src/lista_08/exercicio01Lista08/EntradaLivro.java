package lista_08.exercicio01Lista08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaLivro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Autor novoAutor = new Autor();
		Editora novaEditora = null;
		Endereco novoEndereco = null;
		Livro novoLivro = null;
		List<Autor> listaDeAutor = new ArrayList<>();
		List<Editora> listaDeEditora = new ArrayList<>();
		List<Livro> listaDeLivros = new ArrayList<>();

		String cpfAutor, nomeAutor, cnpjEditora, nomeEditora, telefoneEditora, isbnLivro, tituloLivro, anoDaEdicaoLivro,
				nomeCidade, nomeRua, estadoCidade;

		int opcaoMenu;
		do {

			System.out.println("\n-----------------------------------------------------------");
			System.out.println("Informe uma das opções a seguir\n" + "1. Cadastrar Autor.\n" + "2. Cadastrar Editora.\n"
					+ "3. Cadastrar Livro.\n" + "4. Buscar Livro por Titulo (Buscar livro pelo titulo).\n"
					+ "5. Listar todos Autores.\n" + "6. Listar todas Editoras.\n"
					+ "7. Listar livros por Autor (Mostrar os livros buscando pelo nome do autor)\n"
					+ "8. Listar todos os Livros (Mostrar todos os livros cadastrados)\n" + "0. Sair");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {
			case 1:

				nomeAutor = "";
				cpfAutor = "";
				nomeCidade = "";
				nomeRua = "";
				estadoCidade = "";

				System.out.print("-----------------------------------------------------------");
				System.out.print("\n1. Informe a Informações Referente ao Autor\n");
				System.out.println("-----------------------------------------------------------");
				ler.nextLine();

				System.out.println("Informe o Nome do Autor: ");
				nomeAutor = ler.nextLine();

				System.out.println("Informe o CPF do Autor: ");
				cpfAutor = ler.nextLine();

				System.out.println("-----------------------------------------------------------");
				System.out.println("2. Informe a Informações Referente ao Endereço do Autor: ");
				System.out.println("-----------------------------------------------------------");

				System.out.println("Informe o Nome da Rua em que Autor se localiza: ");
				nomeRua = ler.nextLine();

				System.out.println("Informe o Nome da Cidade em que o Autor reside: ");
				nomeCidade = ler.nextLine();

				System.out.println("Informe o Nome do Estado em que o Autor reside: ");
				estadoCidade = ler.nextLine();

				novoEndereco = new Endereco(nomeRua, nomeCidade, estadoCidade);
				novoAutor = new Autor(cpfAutor, nomeAutor, novoEndereco);
				listaDeAutor.add(novoAutor);

				System.out.println("-----------------------------------------------------------");
				System.out.println("Autor Inserido com Sucesso.");

				break;

			case 2:

				cnpjEditora = null;
				nomeEditora = null;
				novoEndereco = null;
				telefoneEditora = null;
				nomeCidade = null;
				nomeRua = null;
				estadoCidade = null;

				System.out.println("-----------------------------------------------------------");
				System.out.println("1. Informe as Informações da Editora");
				System.out.println("-----------------------------------------------------------");
				ler.nextLine();

				System.out.println("Informe o CNPJ da Editora: ");
				cnpjEditora = ler.nextLine();

				System.out.println("Informe o Nome da Editora: ");
				nomeEditora = ler.nextLine();

				System.out.println("Informe o Telefone da editora (APenas Números): ");
				telefoneEditora = ler.nextLine();

				System.out.println("-----------------------------------------------------------");
				System.out.println("2. Informe as Informações referente ao Endereço da Editora");
				System.out.println("-----------------------------------------------------------");

				System.out.println("Informe o Nome da Rua: ");
				nomeRua = ler.nextLine();

				System.out.println("Informe o Nome da Cidade: ");
				nomeCidade = ler.nextLine();

				System.out.println("Informe o Estado a qual está localizada: ");
				estadoCidade = ler.nextLine();

				novoEndereco = new Endereco(nomeRua, nomeCidade, estadoCidade);

				novaEditora = new Editora(cnpjEditora, nomeEditora, novoEndereco, telefoneEditora);
				listaDeEditora.add(novaEditora);

				System.out.println("-----------------------------------------------------------");
				System.out.println("Editora Inserida com Sucesso.");

				break;
			case 3:
				System.out.println("-----------------------------------------------------------");
				System.out.println("Agora Adicione a informações necessárias para criar um Livro.");
				System.out.println("-----------------------------------------------------------");

				Integer opcaoAutorEditora = null;
				Autor selectAutor = null;
				Editora selectEditora = null;
				String msgOpcoesAutorEditora = "Informe qual do Autor a Seguir você deseja selecionar para o Livro:\n";

				if (listaDeAutor.size() != 0) {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Selecione o Autor do Livro abaixo");
					System.out.println("-----------------------------------------------------------");
					ler.nextLine();
					for (int i = 0; i < listaDeAutor.size(); i++) {

						msgOpcoesAutorEditora += (i + 1) + ". " + listaDeAutor.get(i).getNomeAutor() + "\n";
						if (i == listaDeAutor.size() - 1) {
							System.out.print(msgOpcoesAutorEditora);
							opcaoAutorEditora = ler.nextInt() - 1;
							if (opcaoAutorEditora >= 0 && opcaoAutorEditora < listaDeAutor.size()) {
								if (listaDeAutor.get(opcaoAutorEditora) instanceof Autor) {
									selectAutor = listaDeAutor.get(opcaoAutorEditora);
								}
							} else {
								System.out.println("-----------------------------------------------------------");
								System.out.println("Opção Incorreta para Selecionar o Autor.");
							}
						}
					}
				} else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Não há como criar um Livro sem que aja pelo menos um Autor inserido.");
				}

				msgOpcoesAutorEditora = null;
				opcaoAutorEditora = null;
				msgOpcoesAutorEditora = "Informe qual do Editora a Seguir você deseja selecionar para o Livro:\n";

				if (listaDeEditora.size() != 0) {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Selecione a Editora do Livro abaixo");
					System.out.println("-----------------------------------------------------------");
					ler.nextLine();
					for (int i = 0; i < listaDeEditora.size(); i++) {

						msgOpcoesAutorEditora += (i + 1) + ". " + listaDeEditora.get(i).getNomeEditora() + "\n";
						if (i == listaDeEditora.size() - 1) {
							System.out.print(msgOpcoesAutorEditora);
							opcaoAutorEditora = ler.nextInt() - 1;
							if (opcaoAutorEditora >= 0 && opcaoAutorEditora < listaDeEditora.size()) {
								if (listaDeEditora.get(opcaoAutorEditora) instanceof Editora) {
									selectEditora = listaDeEditora.get(opcaoAutorEditora);
								}
							} else {
								System.out.println("-----------------------------------------------------------");
								System.out.println("Opção Incorreta para Selecionar a Editora.");
							}
						}

					}
				} else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Não há como criar um Livro sem que aja pelo menos uma Editora inserida.");
				}
				ler.nextLine();
				System.out.println("-----------------------------------------------------------");
				if (listaDeAutor.size() != 0 && listaDeEditora.size() != 0) {

					System.out.println("Informe o ISBN do Livro: ");
					isbnLivro = ler.nextLine();

					System.out.println("Informe o Título do Livro: ");
					tituloLivro = ler.nextLine();

					System.out.println("Informe o Ano da Edição do Livro: ");
					anoDaEdicaoLivro = ler.nextLine();

					novoLivro = new Livro(selectAutor, selectEditora, isbnLivro, tituloLivro, anoDaEdicaoLivro);
					listaDeLivros.add(novoLivro);

					System.out.println("-----------------------------------------------------------");
					System.out.println("Livro Inserido com Sucesso.");
				}

				break;

			case 4:
				System.out.println("\n\n-----------------------------------------------------------");
				System.out.println("Busque Livro Cadastrados por Título.");
				System.out.println("-----------------------------------------------------------");
				ler.nextLine();

				tituloLivro = null;
				System.out.println("Informe o Título do Livro: ");
				tituloLivro = ler.nextLine();

				if (listaDeLivros.size() != 0) {
					for (int i = 0; i < listaDeLivros.size(); i++) {
						Livro mostraTitulo = listaDeLivros.get(i);
						if (mostraTitulo instanceof Livro) {
							if (tituloLivro.equalsIgnoreCase(mostraTitulo.getTituloLivro())) {
								System.out.println("\n\n-----------------------------------------------------------");
								System.out.println("Título Livro: " + mostraTitulo.getTituloLivro()
										+ "\nISBN: " + mostraTitulo.getIsbn() + "\nAno de Edição: "
										+ mostraTitulo.getAnoDeEdicaoLivro() + "\n");
							} else {
								System.out.println("-----------------------------------------------------------");
								System.out.println("Título do Livro não encontrado ou Livro não Cadastrado.");
								System.out.println("-----------------------------------------------------------");
							}
						}
					}
				} else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Não há Título de Livro(s) ser Listado(s).");
					System.out.println("-----------------------------------------------------------");
				}

				break;

			case 5:
				System.out.println("\n\n-----------------------------------------------------------");
				System.out.println("Listagem de Autor(es) Cadastrado(s) à Livro(s).");
				System.out.println("-----------------------------------------------------------");

				if (listaDeLivros.size() != 0) {
					for (int i = 0; i < listaDeLivros.size(); i++) {
						Livro mostraAutor = listaDeLivros.get(i);
						if (mostraAutor instanceof Livro) {
							System.out.println("-----------------------------------------------------------");
							System.out.println(mostraAutor.toStringNomeAutores());
						}
					}
				} else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Não há Autor(es) Cadastrado(s) à Livro(s) para ser Listado(s).");
					System.out.println("-----------------------------------------------------------");
				}

				break;

			case 6:
				System.out.println("\n\n-----------------------------------------------------------");
				System.out.println("Listagem de Editora(s) de Livro(s) Cadastrado(s).");
				System.out.println("-----------------------------------------------------------");

				if (listaDeLivros.size() != 0) {
					for (int i = 0; i < listaDeLivros.size(); i++) {
						Livro mostraEditoras = listaDeLivros.get(i);
						if (mostraEditoras instanceof Livro) {
							System.out.println("-----------------------------------------------------------");
							System.out.println((i + 1) + " - " + mostraEditoras.toStringNomeEditoras());
							System.out.println("-----------------------------------------------------------");
						}
					}
				} else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Não há Editora(as) Cadastrada(s) à Livro(s) para ser Listado(s).");
					System.out.println("-----------------------------------------------------------");
				}

				break;

			case 7:

				System.out.println("\n\n-----------------------------------------------------------");
				System.out.println("Busque Livro Cadastrado(s) pelo Nome do Autor.");
				System.out.println("-----------------------------------------------------------");
				ler.nextLine();
				
				nomeAutor = null;
				System.out.println("Informe o Nome do Autor: ");
				nomeAutor = ler.nextLine();
				
				if(listaDeLivros.size() != 0) {
					for(int i  = 0; i < listaDeAutor.size(); i++) {
						Livro mostraLivro = listaDeLivros.get(i);
						if(nomeAutor.equalsIgnoreCase(mostraLivro.getAutorLivro().getNomeAutor())) {
							if(mostraLivro instanceof Livro) {
								System.out.println("-----------------------------------------------------------");
								System.out.println("Nome Livro: " + mostraLivro.getTituloLivro() +
										"Edição: " + mostraLivro.getAnoDeEdicaoLivro() + 
										"Nome Autor: " + mostraLivro.getAutorLivro().getNomeAutor());
							}
						}
					}
				} else {
					System.out.println("-----------------------------------------------------------");
					System.out.println("Não há Autor(es) Cadastrada(s) à Livro(s) para ser Listado(s).");
					System.out.println("-----------------------------------------------------------");
				}

				break;

			case 8:
				System.out.println("\n\n\\n-----------------------------------------------------------");
				System.out.println("Todos os Livros Cadastrados.");
				System.out.println("-----------------------------------------------------------");

				for (int i = 0; i < listaDeLivros.size(); i++) {
					Livro mostraL = listaDeLivros.get(i);

					if (mostraL instanceof Livro) {
						System.out.println("-----------------------------------------------------------");
						System.out.println((i + 1) + " - " + mostraL.toString());
						System.out.println("-----------------------------------------------------------");
					}
				}

				break;

			case 0:

				break;

			default:

				break;
			}

		} while (opcaoMenu != 0);
		
		ler.close();
	}

}
