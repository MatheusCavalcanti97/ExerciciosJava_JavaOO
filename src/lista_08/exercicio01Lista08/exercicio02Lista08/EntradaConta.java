package lista_08.exercicio01Lista08.exercicio02Lista08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaConta {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		ContaEspecial contaEspecial = null;
		ContaPoupanca contaPoupanca = null;

		List<ContaBancaria> listaDeContas = new ArrayList<>();

		String nomeAgencia, numeroAgencia, nomeCliente, cpfCliente, numeroContaCliente;
		double saldoConta, limiteConta, depositarValor, sacarValor;
		int diaDeRendimento;

		Integer opcaoMenu;

		/*
		 * 1. Cadastrar Conta 2. Realizar depósito (Buscar pelo CPF do cliente) 3.
		 * Realizar saque (Buscar pelo CPF do cliente) 4. Verificar saldo (Buscar pelo
		 * CPF do cliente) 5. Consultar número e nome da agência (Mostrar nome e o CPF
		 * do cliente) 6. Alterar o número e nome da agência (Buscar pelo nome do
		 * cliente) 0. Sair
		 */

		do {
			opcaoMenu = null;
			System.out.println("------------------------------------------------------------");
			System.out.println("Informuma da Opções a Seguir:" + "\n1. Cadastrar Conta\n"
					+ "2. Realizar depósito (Buscar pelo CPF do cliente)\n"
					+ "3. Realizar saque (Buscar pelo CPF do cliente)\n"
					+ "4. Verificar saldo (Buscar pelo CPF do cliente)\n"
					+ "5. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)\n"
					+ "6. Alterar o número e nome da agência (Buscar pelo nome do cliente)\n" + "0. Sair");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {
			case 1:
				int opcaoConta = 0;

				do {
					System.out.println("------------------------------------------------------------");
					System.out.println("Informe o tipo de Conta que deseja Cadastrar." + "\n1. Conta Especial."
							+ "\n2. Conta Poupança." + "\n0. Sair.");
					opcaoConta = ler.nextInt();

					switch (opcaoConta) {
					case 1:

						nomeAgencia = null;
						numeroAgencia = null;
						nomeCliente = null;
						cpfCliente = null;
						numeroContaCliente = null;
						saldoConta = 0.;
						limiteConta = 0.;

						System.out.println("------------------------------------------------------------");
						System.out.println("Insira as Informações da Conta Especial");
						System.out.println("------------------------------------------------------------\n\n");
						ler.nextLine();

						System.out.println("Informe o NOME DA AGÊNCIA BANCARIA do Cliente: ");
						nomeAgencia = ler.nextLine();

						System.out.println("Informe o NÚMERO DA AGÊNCIA BANCÁRIA do Cliente: ");
						numeroAgencia = ler.nextLine();

						System.out.println("Informe o NOME COMPLETO do Cliente: ");
						nomeCliente = ler.nextLine();

						System.out.println("Informe o NÚMERO DO CPF do Cliente: ");
						cpfCliente = ler.nextLine();

						System.out.println("Informe o NÚMERO DA CONTA do Cliente: ");
						numeroContaCliente = ler.nextLine();

						System.out.println("Informe o SALDO DA CONTA do Cliente: ");
						saldoConta = ler.nextDouble();

						System.out.println("Informe o LIMITE DA CONTA ESPECIAL do Cliente: ");
						limiteConta = ler.nextDouble();

						contaEspecial = new ContaEspecial(nomeAgencia, numeroAgencia, nomeCliente, cpfCliente,
								numeroContaCliente, saldoConta, limiteConta);
						listaDeContas.add(contaEspecial);

						System.out.println("\n\n------------------------------------------------------------");
						System.out.println("Conta Especial Adicionada com Sucesso.");
						System.out.println("------------------------------------------------------------\n\n");

						break;
					case 2:
						nomeAgencia = null;
						numeroAgencia = null;
						nomeCliente = null;
						cpfCliente = null;
						numeroContaCliente = null;
						saldoConta = 0.;

						System.out.println("------------------------------------------------------------");
						System.out.println("Insira as Informações da Conta Poupança");
						System.out.println("------------------------------------------------------------\n\n");
						ler.nextLine();

						System.out.println("Informe o NOME DA AGÊNCIA BANCARIA do Cliente: ");
						nomeAgencia = ler.nextLine();

						System.out.println("Informe o NÚMERO DA AGÊNCIA BANCÁRIA do Cliente: ");
						numeroAgencia = ler.nextLine();

						System.out.println("Informe o NOME COMPLETO do Cliente: ");
						nomeCliente = ler.nextLine();

						System.out.println("Informe o NÚMERO DO CPF do Cliente: ");
						cpfCliente = ler.nextLine();

						System.out.println("Informe o NÚMERO DA CONTA do Cliente: ");
						numeroContaCliente = ler.nextLine();

						System.out.println("Informe o SALDO DA CONTA do Cliente: ");
						saldoConta = ler.nextDouble();

						System.out.println("Informe o DIA DE RENDIMENTO DA CONTA POUPANÇA do Cliente: ");
						diaDeRendimento = ler.nextInt();

						contaPoupanca = new ContaPoupanca(nomeAgencia, numeroAgencia, nomeCliente, cpfCliente,
								numeroContaCliente, saldoConta, diaDeRendimento);
						listaDeContas.add(contaPoupanca);

						System.out.println("\n\n------------------------------------------------------------");
						System.out.println("Conta Poupança Adicionada com Sucesso.");
						System.out.println("------------------------------------------------------------\n\n");

						break;
					case 0:
						System.out.println("\n\n------------------------------------------------------------");
						System.out.println("Inserção de Conta Encerrado com Sucesso\nProssiga para o MENU PRINCIPAL.");
						System.out.println("------------------------------------------------------------\n\n");
						break;
					default:
						System.out.println("\n\n------------------------------------------------------------");
						System.out.println("Opção Inserida Incorretamente.\nTente Novamente.");
						System.out.println("------------------------------------------------------------\n\n");
						break;

					}
				} while (opcaoConta != 0);

				break;

			// CASE 02
			case 2:
				/* Realizar depósito (Buscar pelo CPF do cliente) */

				opcaoConta = 0;

				do {
					System.out.println("\n\n------------------------------------------------------------");
					System.out.println("Informe o tipo de Conta que deseja REALIZAR UM DEPÓSITO através CPF do Cliente."
							+ "\n1. Conta Especial." + "\n2. Conta Poupança." + "\n0. Sair.");
					opcaoConta = ler.nextInt();

					switch (opcaoConta) {
					case 1:

						depositarValor = 0;
						cpfCliente = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o Cpf do Cliente: ");
						cpfCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp = listaDeContas.get(i);

							if (cpfCliente.equalsIgnoreCase(temp.getCpfCliente())) {
								if (temp instanceof ContaEspecial) {
									ContaEspecial c_e = (ContaEspecial) temp;

									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Informe quanto você deseja Depositar na C. ESPECIAL: R$ ");
									depositarValor = ler.nextDouble();
									c_e.depositarValor(depositarValor);

								} else {
									System.out.println("------------------------------------------------------------");
									System.out.println("CLIENTE NÃO ENCONTRADO.");
								}
							}
						}

						break;
					case 2:

						depositarValor = 0;
						cpfCliente = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o Cpf do Cliente: ");
						cpfCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp2 = listaDeContas.get(i);

							if (cpfCliente.equalsIgnoreCase(temp2.getCpfCliente())) {
								if (temp2 instanceof ContaPoupanca) {
									ContaPoupanca c_p = (ContaPoupanca) temp2;

									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Informe quanto você deseja Depositar na C. POUPANÇA: R$ ");
									depositarValor = ler.nextDouble();
									c_p.depositarValor(depositarValor);

								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}
					}
				} while (opcaoConta != 0);

				break;

			// CASE 3
			case 3:

				/* Realizar Saque (Buscar pelo CPF do cliente) */

				opcaoConta = 0;

				do {
					System.out.println("\n\n------------------------------------------------------------");
					System.out.println("Informe o tipo de Conta que deseja REALIZAR UM SAQUE através CPF do Cliente."
							+ "\n1. Conta Especial." + "\n2. Conta Poupança." + "\n0. Sair.");
					opcaoConta = ler.nextInt();

					switch (opcaoConta) {
					case 1:

						sacarValor = 0;
						cpfCliente = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o Cpf do Cliente: ");
						cpfCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp = listaDeContas.get(i);

							if (cpfCliente.equalsIgnoreCase(temp.getCpfCliente())) {
								if (temp instanceof ContaEspecial) {
									ContaEspecial c_e = (ContaEspecial) temp;

									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Informe quanto você deseja Sacar da C. ESPECIAL: R$ ");
									sacarValor = ler.nextDouble();
									if (c_e.getSaldoConta() <= (-1 * 500)) {
										c_e.sacarValor(sacarValor);
									} else {
										System.out.println(
												"\n------------------------------------------------------------");
										System.out.println(
												"Você não pode sacar mais do que o seu limite Permite.\nTente Novamente.");
									}

								} else {
									System.out.println("------------------------------------------------------------");
									System.out.println("CLIENTE NÃO ENCONTRADO.");
								}
							}
						}

						break;
					case 2:

						sacarValor = 0;
						cpfCliente = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o Cpf do Cliente: ");
						cpfCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp2 = listaDeContas.get(i);

							if (cpfCliente.equalsIgnoreCase(temp2.getCpfCliente())) {
								if (temp2 instanceof ContaPoupanca) {
									ContaPoupanca c_p = (ContaPoupanca) temp2;

									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Informe quanto você deseja Sacar da C. POUPANÇA: R$ ");
									sacarValor = ler.nextDouble();
									c_p.sacarValor(sacarValor);

								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}
					}
				} while (opcaoConta != 0);

				break;

			// CASE 04
			case 4:
				/* Verificar Saldo (Buscar pelo CPF do cliente) */

				opcaoConta = 0;

				do {
					System.out.println("\n\n------------------------------------------------------------");
					System.out.println("Informe o tipo de Conta que deseja VERIFICAR O SALDO através CPF do Cliente."
							+ "\n1. Conta Especial." + "\n2. Conta Poupança." + "\n0. Sair.");
					opcaoConta = ler.nextInt();

					switch (opcaoConta) {
					case 1:

						depositarValor = 0;
						cpfCliente = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o Cpf do Cliente: ");
						cpfCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp = listaDeContas.get(i);

							if (cpfCliente.equalsIgnoreCase(temp.getCpfCliente())) {
								if (temp instanceof ContaEspecial) {
									ContaEspecial c_e = (ContaEspecial) temp;
									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Cliente: " + c_e.getNomeCliente() + " --- " + "Saldo: R$ "
											+ c_e.getSaldoConta());

								} else {
									System.out.println("------------------------------------------------------------");
									System.out.println("CLIENTE NÃO ENCONTRADO.");
								}
							}
						}

						break;
					case 2:

						depositarValor = 0;
						cpfCliente = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o Cpf do Cliente: ");
						cpfCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp2 = listaDeContas.get(i);

							if (cpfCliente.equalsIgnoreCase(temp2.getCpfCliente())) {
								if (temp2 instanceof ContaPoupanca) {
									ContaPoupanca c_p = (ContaPoupanca) temp2;
									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Cliente: " + c_p.getNomeCliente() + " --- " + "Saldo: R$ "
											+ c_p.getSaldoConta());
								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}
					}
				} while (opcaoConta != 0);

				break;

			// CASE 05
			case 5:
				/* Consultar número e nome da agência (Mostrar nome e o CPF do cliente) */

				nomeAgencia = null;
				numeroAgencia = null;
				opcaoConta = 0;

				System.out.println("------------------------------------------------------------");
				System.out
						.println("Consultar através do Número e do Nome da Agência (Mostrar nome e o CPF do cliente).");
				System.out.println("------------------------------------------------------------\n\n");
				ler.nextLine();

				do {
					System.out.println("------------------------------------------------------------");
					System.out
							.println("Informe o tipo de Conta que deseja Buscar Informações como Nome e CPF do Cliente."
									+ "\n1. Conta Especial." + "\n2. Conta Pupança." + "\n0. Sair.");
					opcaoConta = ler.nextInt();

					switch (opcaoConta) {
					case 1:

						nomeAgencia = null;
						numeroAgencia = null;

						System.out.println("------------------------------------------------------------");
						System.out.println("Insira as Informações da Conta Especial e vizualize o que deseja.");
						System.out.println("------------------------------------------------------------\n\n");
						ler.nextLine();

						System.out.println("------------------------------------------------------------");
						System.out.println("Informe o Nome da Agencia: ");
						nomeAgencia = ler.nextLine();

						System.out.println("Informe o Número da Agencia: ");
						numeroAgencia = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp = listaDeContas.get(i);

							if (nomeAgencia.equalsIgnoreCase(temp.getNomeAgencia())
									&& numeroAgencia.equalsIgnoreCase(temp.getNumeroAgencia())) {
								if (temp instanceof ContaEspecial) {
									ContaEspecial c_e = (ContaEspecial) temp;
									System.out
											.println("\n------------------------------------------------------------");
									System.out.println((i + 1) + ". " + c_e.nome_e_cpf());
								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}

						break;
					case 2:

						nomeAgencia = null;
						numeroAgencia = null;

						System.out.println("------------------------------------------------------------");
						System.out.println("Insira as Informações da Conta Poupança e vizualize o que deseja.");
						System.out.println("------------------------------------------------------------\n\n");
						ler.nextLine();

						System.out.println("------------------------------------------------------------");
						System.out.println("Informe o Nome da Agencia: ");
						nomeAgencia = ler.nextLine();

						System.out.println("Informe o Número da Agencia: ");
						numeroAgencia = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp = listaDeContas.get(i);

							if (nomeAgencia.equalsIgnoreCase(temp.getNomeAgencia())
									&& numeroAgencia.equalsIgnoreCase(temp.getNumeroAgencia())) {
								if (temp instanceof ContaPoupanca) {
									ContaPoupanca c_p = (ContaPoupanca) temp;
									System.out
											.println("\n------------------------------------------------------------");
									System.out.println((i + 1) + ". " + c_p.nome_e_cpf());
								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}

						break;
					case 0:
						System.out.println("\n\n------------------------------------------------------------");
						System.out.println("Prossiga Para o MENU PRINCIPAL.");
						System.out.println("------------------------------------------------------------\n\n");
						break;
					default:
						System.out.println("\n\n------------------------------------------------------------");
						System.out.println("Opção Inserida Incorretamente.\nTente Novamente.");
						System.out.println("------------------------------------------------------------\n\n");
						break;
					}

				} while (opcaoConta != 0);

				break;

			// CASE 6
			case 6:
				// Alterar o número e nome da agência (Buscar pelo nome do cliente)

				opcaoConta = 0;

				do {
					System.out.println("\n\n------------------------------------------------------------");
					System.out.println(
							"Informe o tipo de Conta que deseja ALTERAR O NÚMERO E O NOME DA AGÊNCIA DO CLIENTE através NOME do Cliente."
									+ "\n1. Conta Especial." + "\n2. Conta Poupança." + "\n0. Sair.");
					opcaoConta = ler.nextInt();

					switch (opcaoConta) {
					case 1:

						nomeCliente = "";
						nomeAgencia = "";
						numeroAgencia = "";

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o NOME do Cliente: ");
						nomeCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp = listaDeContas.get(i);

							if (nomeCliente.equalsIgnoreCase(temp.getNomeCliente())) {
								if (temp instanceof ContaEspecial) {
									ContaEspecial c_e = (ContaEspecial) temp;
									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Informe o Nome da AGÊNCIA: ");
									nomeAgencia = ler.nextLine();

									System.out.println("Informe o NúMERO DA AGENCIA: ");
									numeroAgencia = ler.nextLine();

									c_e.setNomeAgencia(nomeAgencia);
									c_e.setNumeroAgencia(numeroAgencia);

									System.out.println("------------------------------------------------------------");
									System.out.println("Informações Alteradas com Sucesso.");

								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}

						break;
					case 2:

						nomeCliente = null;
						nomeAgencia = null;
						numeroAgencia = null;

						System.out.println("------------------------------------------------------------");
						ler.nextLine();
						System.out.println("Informe o NOME do Cliente: ");
						nomeCliente = ler.nextLine();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria temp2 = listaDeContas.get(i);

							if (nomeCliente.equalsIgnoreCase(temp2.getNomeCliente())) {
								if (temp2 instanceof ContaPoupanca) {
									ContaPoupanca c_p = (ContaPoupanca) temp2;
									System.out
											.println("\n------------------------------------------------------------");
									System.out.println("Informe o Nome da AGÊNCIA: ");
									nomeAgencia = ler.nextLine();

									System.out.println("Informe o NúMERO DA AGENCIA: ");
									numeroAgencia = ler.nextLine();

									c_p.setNomeAgencia(nomeAgencia);
									c_p.setNumeroAgencia(numeroAgencia);

									System.out.println("------------------------------------------------------------");
									System.out.println("Informações Alteradas com Sucesso.");

								}
							} else {
								System.out.println("------------------------------------------------------------");
								System.out.println("CLIENTE NÃO ENCONTRADO.");
							}
						}

					}

				} while (opcaoConta != 0);

				break;

			case 0:
				System.out.println("\n\n------------------------------------------------------------");
				System.out.println("Programa Encerrado com Sucesso.");
				System.out.println("------------------------------------------------------------\n\n");
				break;
			}

		} while (opcaoMenu != 0);

		ler.close();
	}

}
