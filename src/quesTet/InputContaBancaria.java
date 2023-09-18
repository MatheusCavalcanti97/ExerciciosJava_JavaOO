package quesTet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputContaBancaria {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Cliente cliente = null;
		Banco banco = null;
		ContaBancaria contaBancaria = null;
		ContaPoupanca contaPoupanca = null;
		List<ContaBancaria> listaDeContas = new ArrayList<ContaBancaria>();

		// Atributos Banco e Cliente e Conta
		String numeroAgencia = "", nomeAgencia = "", nomeCliente = "", cpfCliente = "", numeroConta = "",
				buscadorCpfCliente = null;
		;
		double saldoConta = 0., jurosConta = 0;
		Integer opcaoMenu = null, opcaoConta = null;

		do {

			System.out.print("\n----------------------------------------------\n");
			System.out.print(
					"\nInforme uma das Opções a Seguir: \n\nObs.: O sistema deve permitir o cadastro de 10 (dez) clientes.\n"
							+ "\n1. Cadastrar Conta ou Poupança (Pergunte aos clientes o que ele quer cadastrar)."
							+ "\n2. Realizar depósito (Buscar pelo CPF do cliente)."
							+ "\n3. Render Juros (Buscar pelo CPF do cliente)."
							+ "\n4. Consultar número e nome da agência (Mostrar nome e o CPF do cliente)"
							+ "\n5. Alterar o número e nome da agência (Buscar pelo nome do cliente)"
							+ "\n0. Sair --> ");
			opcaoMenu = ler.nextInt();

			if (listaDeContas.size() <= 10) {
				switch (opcaoMenu) {

				// CASE 0
				case 0:
					System.out.print("\n\n----------------------------------------------\n\n");
					System.out.print("Sistema Encerrado com Sucesso.");
					System.out.print("\n\n----------------------------------------------");
					break;

				// CASE 1
				case 1:

					opcaoConta = 0;
					System.out.print("----------------------------------------------");
					System.out.println("\nInforme uma das Opções a Seguir:\n1. Criar Conta.\n2. Criar Conta Poupança.");
					opcaoConta = ler.nextInt();

					if (opcaoConta == 1) {
						numeroAgencia = "";
						nomeAgencia = "";
						nomeCliente = "";
						cpfCliente = "";
						numeroConta = "";
						saldoConta = 0.;

						System.out.print("\n----------------------------------------------");
						System.out.print("\nInforme o Nome do Cliente: ");
						nomeCliente = ler.next();

						System.out.print("Informe o CPF do Cliente: ");
						cpfCliente = ler.next();

						System.out.print("\n----------------------------------------------");

						System.out.print("\nInforme o nome da Agência Bancária: ");
						nomeAgencia = ler.next();

						System.out.print("\nInforme o Número da Agência Bancária: ");
						numeroAgencia = ler.next();

						System.out.print("\n----------------------------------------------");

						System.out.print("\nInforme o número da Conta Bancária: ");
						numeroConta = ler.next();

						System.out.print(
								"\nInforme o valor que deseja depositar para abertura da conta, senão, digito R$ 0,00: R$ ");
						saldoConta = ler.nextDouble();

						cliente = new Cliente(nomeCliente, cpfCliente);
						banco = new Banco(numeroAgencia, nomeAgencia);
						contaBancaria = new ContaBancaria(numeroConta, banco, cliente, saldoConta);
						listaDeContas.add(contaBancaria);

						System.out.print("\n\n----------------------------------------------");
						System.out.print("\nConta Adicionada com Sucesso.");
						System.out.print("\n----------------------------------------------\n\n");

					} else if (opcaoConta == 2) {
						numeroAgencia = "";
						nomeAgencia = "";
						nomeCliente = "";
						cpfCliente = "";
						numeroConta = "";
						saldoConta = 0.;

						System.out.print("\n----------------------------------------------");
						System.out.print("\nInforme o Nome do Cliente: ");
						nomeCliente = ler.next();

						System.out.print("Informe o CPF do Cliente: ");
						cpfCliente = ler.next();

						System.out.print("\n----------------------------------------------");

						System.out.print("\nInforme o nome da Agência Bancária: ");
						nomeAgencia = ler.next();

						System.out.print("\nInforme o Número da Agência Bancária: ");
						numeroAgencia = ler.next();
						System.out.print("\n----------------------------------------------");

						System.out.print("\nInforme o número da Conta Bancária: ");
						numeroConta = ler.next();

						System.out.print("Informe a taxa de Rendimento da Conta Poupança: ");
						jurosConta = ler.nextDouble();

						System.out.print(
								"\nInforme o valor que deseja depositar para abertura da conta, senão, digito R$ 0,00: R$ ");
						saldoConta = ler.nextDouble();

						cliente = new Cliente(nomeCliente, cpfCliente);
						banco = new Banco(numeroAgencia, nomeAgencia);
						contaPoupanca = new ContaPoupanca(numeroConta, banco, cliente, saldoConta, jurosConta);
						listaDeContas.add(contaPoupanca);

						System.out.print("\n\n----------------------------------------------");
						System.out.print("\nConta Poupança Adicionada com Sucesso.");
						System.out.print("----------------------------------------------\n\n");
					} else {
						System.out.print("\n\n----------------------------------------------\n\n");
						System.out.print("Opção Inserida Incorretamente.\n\n");

					}

					break;

				// CASE 2
				case 2:
					double depositoV = 0.;
					opcaoConta = 0;
					System.out.print("----------------------------------------------");
					System.out.println(
							"\nInforme uma das Opções a Seguir:\n1. Depositar na Conta.\n2. Depositar na Conta Poupança.");
					opcaoConta = ler.nextInt();

					if (opcaoConta == 1) {
						buscadorCpfCliente = null;
						System.out.print("\n----------------------------------------------");
						System.out.println("\nInforme o CPF do Cliente que deseja depositar um valor na conta: ");
						buscadorCpfCliente = ler.next();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria cb = listaDeContas.get(i);

							if (buscadorCpfCliente.equalsIgnoreCase(cb.getCliente().getCpfCliente())) {
								if (cb instanceof ContaBancaria) {
									ContaBancaria cb1 = (ContaBancaria) listaDeContas.get(i);

									System.out.print("\n----------------------------------------------");
									System.out.print("\nInforme o Valor que deseja Depositar: ");
									depositoV = ler.nextDouble();

									System.out.print("\n----------------------------------------------\n");
									System.out.print("\nSaldo Anterior: R$ " + cb1.getSaldoConta());
									System.out.print("\n----------------------------------------------");
									cb1.depositarConta(depositoV);

									System.out.print("\n----------------------------------------------\n");
									System.out.print("\nNovo Saldo: R$ " + cb1.getSaldoConta());

								} else {
									System.out.print("\n----------------------------------------------");
									System.out.print(
											"\nNenhum Cliente Cadastrado para o tipo de Conta Bancaria Simples.");
								}
							} else {
								System.out.print("\n----------------------------------------------");
								System.out.println("\nO Cpf do Cliente não foi Encontrado!!");
							}
						}
					} else if (opcaoConta == 2) {
						buscadorCpfCliente = null;
						System.out.print("\n----------------------------------------------");
						System.out.print("\nInforme o CPF do Cliente que deseja depositar um valor na conta: ");
						buscadorCpfCliente = ler.next();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria cb = listaDeContas.get(i);

							if (buscadorCpfCliente.equalsIgnoreCase(cb.getCliente().getCpfCliente())) {
								if (cb instanceof ContaPoupanca) {
									ContaPoupanca cp = (ContaPoupanca) listaDeContas.get(i);

									System.out.print("\n----------------------------------------------");
									System.out.print("\nInforme o Valor que deseja Depositar: ");
									depositoV = ler.nextDouble();

									System.out.print("\n----------------------------------------------");
									System.out.print("\nSaldo Anterior: R$ " + cp.getSaldoConta());
									System.out.print("\n----------------------------------------------");
									cp.depositarConta(depositoV);

									cp.renderJuros();
									System.out.print("\nNovo Saldo: R$ " + cp.getSaldoConta());

								} else {
									System.out.print("\n----------------------------------------------");
									System.out.print(
											"\nNenhum Cliente Cadastrado para o tipo de Conta Bancaria Simples.");
								}
							} else {
								System.out.print("\n----------------------------------------------");
								System.out.print("\nO Cpf do Cliente não foi Encontrado!!");
							}
						}

					} else {
						System.out.print("\n\n----------------------------------------------\n\n");
						System.out.print("Opção Inserida Incorretamente.\n\n");

					}

					break;

				// CASE 3
				case 3:
					buscadorCpfCliente = null;
					System.out.print("\n----------------------------------------------");
					System.out.print("\nInforme o CPF do Cliente que deseja render Juros na conta: ");
					buscadorCpfCliente = ler.next();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria cb = listaDeContas.get(i);
						if (buscadorCpfCliente.equalsIgnoreCase(cb.getCliente().getCpfCliente())) {
							if (cb instanceof ContaPoupanca) {
								ContaPoupanca cp = (ContaPoupanca) cb;
								System.out.print("\n\n----------------------------------------------\n\n");
								System.out.print("Saldo Anterior: R$ " + cp.getSaldoConta());
								cp.renderJuros();
								System.out.print("\nNovo Saldo: R$ " + cp.getSaldoConta());
							} else {
								System.out.print("\n----------------------------------------------");
								System.out.print("\nNenhum Cliente Cadastrado para o tipo de Conta Poupança Simples.");
							}

						} else {
							System.out.print("\n----------------------------------------------");
							System.out.print("\nO Cpf do Cliente não foi Encontrado!!");
						}
					}
					break;

				// CASE 4
				case 4:
					nomeAgencia = null;
					numeroAgencia = null;

					System.out.print("\n----------------------------------------------");
					System.out.print("\nInforme o Nome da Agencia: ");
					nomeAgencia = ler.next();

					System.out.print("\nInforme o Número Agência: ");
					numeroAgencia = ler.next();
					System.out.print("\n----------------------------------------------");

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria c_b = listaDeContas.get(i);
						if (nomeAgencia.equalsIgnoreCase(c_b.getBanco().getNomeAgencia())
								&& numeroAgencia.equalsIgnoreCase(c_b.getBanco().getNumeroAgencia())) {
							if (c_b instanceof ContaBancaria) {
								ContaBancaria cb1 = (ContaBancaria) c_b;
								System.out.print("\n----------------------------------------------\n");
								System.out.println("\nNome do Cliente: " + cb1.getCliente().getNomeCliente()
										+ "\nNúmero do CPF: " + cb1.getCliente().getCpfCliente()
										+ "\nTipo Conta: Conta Bancaria Simples.");
								System.out.print("\n----------------------------------------------\n");
							}

							if (c_b instanceof ContaPoupanca) {
								ContaPoupanca c_p = (ContaPoupanca) c_b;
								System.out.print("\n----------------------------------------------\n");
								System.out.println("\nNome do Cliente: " + c_p.getCliente().getNomeCliente()
										+ "\nNúmero do CPF: " + c_p.getCliente().getCpfCliente()
										+ "\nTipo Conta: Conta Bancaria Poupança.");
								System.out.print("\n----------------------------------------------\n");
							}
						} else {
							System.out.print("\n----------------------------------------------");
							System.out.print("\nNenhuma Informação encontrada.");
						}

					}

					break;

				// CASE 5
				case 5:

					opcaoConta = 0;
					System.out.print("----------------------------------------------");
					System.out.print("\nInforme uma das Opções a Seguir:\n1. Criar Conta.\n2. Criar Conta Poupança.");
					opcaoConta = ler.nextInt();

					if (opcaoConta == 1) {

						buscadorCpfCliente = null;
						System.out.print("\n----------------------------------------------");
						System.out.print("\nInforme o Número do CPF: ");
						buscadorCpfCliente = ler.next();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria cb = listaDeContas.get(i);

							if (buscadorCpfCliente.equalsIgnoreCase(cb.getCliente().getCpfCliente())) {
								if (cb instanceof ContaBancaria) {
									ContaBancaria cb1 = (ContaBancaria) cb;

									System.out.print("\n----------------------------------------------");
									System.out.print("\nInforme o Novo Nome da Agencia: ");
									nomeAgencia = ler.next();

									System.out.print("\n Informe o Novo Número da Agência: ");
									numeroAgencia = ler.next();
									System.out.print("\n----------------------------------------------\n");
									System.out.print("Nome Atual Agencia: " + cb1.getBanco().getNomeAgencia()
											+ "\nNúmero Atual da Ag.: " + cb1.getBanco().getNumeroAgencia());
									System.out.print("\n----------------------------------------------\n");
									cb1.getBanco().setNomeAgencia(nomeAgencia);
									cb1.getBanco().setNumeroAgencia(numeroAgencia);
									System.out.print("Nome ATUALIZADO da Agencia: " + cb1.getBanco().getNomeAgencia()
											+ "\nNúmero ATUALIZADO da Ag.: " + cb1.getBanco().getNumeroAgencia());
									System.out.print("\n----------------------------------------------\n");
								} else {
									System.out.print("\n----------------------------------------------");
									System.out.print("\nCliente Não possui Conta Poupança.");
								}
							} else {
								System.out.print("\n----------------------------------------------");
								System.out.print("\nO Cpf do Cliente não foi Encontrado!!");
							}

						}

					} else if (opcaoConta == 2) {

						buscadorCpfCliente = null;
						System.out.print("\n----------------------------------------------");
						System.out.print("\nInforme o Número do CPF: ");
						buscadorCpfCliente = ler.next();

						for (int i = 0; i < listaDeContas.size(); i++) {
							ContaBancaria cb = listaDeContas.get(i);

							if (buscadorCpfCliente.equalsIgnoreCase(cb.getCliente().getCpfCliente())) {
								if (cb instanceof ContaPoupanca) {
									ContaPoupanca cp = (ContaPoupanca) cb;

									System.out.print("\n----------------------------------------------");
									System.out.print("\nInforme o Novo Nome da Agencia: ");
									nomeAgencia = ler.next();

									System.out.print("\n Informe o Novo Número da Agência: ");
									numeroAgencia = ler.next();
									System.out.print("\n----------------------------------------------\n");
									System.out.print("Nome Atual Agencia: " + cp.getBanco().getNomeAgencia()
											+ "\nNúmero Atual da Ag.: " + cp.getBanco().getNumeroAgencia());
									System.out.print("\n----------------------------------------------\n");
									cp.getBanco().setNomeAgencia(nomeAgencia);
									cp.getBanco().setNumeroAgencia(numeroAgencia);
									System.out.print("Nome ATUALIZADO da Agencia: " + cp.getBanco().getNomeAgencia()
											+ "\nNúmero ATUALIZADO da Ag.: " + cp.getBanco().getNumeroAgencia());
									System.out.print("\n----------------------------------------------\n");

								} else {
									System.out.print("\n----------------------------------------------");
									System.out.print("\nCliente Não possui Conta Poupança.");
								}
							} else {
								System.out.print("\n----------------------------------------------");
								System.out.print("\nO Cpf do Cliente não foi Encontrado!!");
							}

						}

					} else {
						System.out.print("----------------------------------------------");
						System.out.println("\nInforme uma Opção Válida.");
					}

					break;

				// DEFAULT
				default:
					System.out.println("----------------------------------------------");
					System.out.println("\nInsira uma opção Correta.");
					break;

				}
			} else {
				System.out.println("\n----------------------------------------------");
				System.out.println("\nO sistema só permite o cadastramento de 10 Clientes.");
			}

		} while (opcaoMenu != 0 || listaDeContas.size() == 10);
		
		ler.close();

	}
}
