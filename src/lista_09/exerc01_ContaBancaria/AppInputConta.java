package lista_09.exerc01_ContaBancaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppInputConta {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		Pessoa pessoa = null;
		ContaPoupanca c_p = null;
		ContaEspecial c_e = null;
		List<ContaBancaria> listaDeContas = new ArrayList<>();

		// ATRIBUTOS CONTA POUPANCA e ESPECIAL
		String nomeDoBanco, nomeCliente = null, numeroAgencia = null, numeroConta = null;
		double saldoConta = 0, taxaDeRendimento = 0, limiteContaEspecial = 0, sacarValor = 0, depositoValor = 0;
		int diaDeRendimento;

		Integer opcaoMenu = null, opcaoConta = null;

		do {
			System.out.println("-------------------------------------------------");
			System.out.println("Informe uma das Opções a Seguir:"
					+ "\n1) Incluir dados relativos a conta de um cliente (Limitado a 5 contas)."
					+ "\n2) Sacar um determinado valor de uma conta (Procure pelo número da conta)."
					+ "\n3) Depositar um determinado valor na sua conta (Procure pelo número da conta)."
					+ "\n4) Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança."
					+ "\n5) Mostrar os dados de todas as contas cadastradas." + "\n0.  SAIR. ");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {

			case 0:
				System.out.println("-------------------------------------------------");
				System.out.println("Programa Encerrado. Até logo.");
				break;

			// CASE 1
			case 1:
				opcaoConta = null;
				System.out.println("\n-------------------------------------------------");
				System.out
						.println("Selecione um dos Tipos de Contas:" + "\n1. Conta Poupança." + "\n2. Conta Especial.");
				opcaoConta = ler.nextInt();
				ler.nextLine();

				if (opcaoConta == 1) {
					System.out.println("\n-------------------------------------------------");
					nomeCliente = null;
					nomeDoBanco = null;
					numeroAgencia = null;
					numeroConta = null;
					saldoConta = 0;
					diaDeRendimento = 0;
					taxaDeRendimento = 0;

					System.out.println("Informe o Nome do Cliente: ");
					nomeCliente = ler.nextLine();

					System.out.println("Informe o Nome do Banco: ");
					nomeDoBanco = ler.nextLine();

					System.out.println("Informe o Número da Agencia: ");
					numeroAgencia = ler.nextLine();

					System.out.println("Informe o número do Conta: ");
					numeroConta = ler.nextLine();

					System.out.println("Informe o Saldo Inicial: ");
					saldoConta = ler.nextDouble();

					System.out.println("Informe o dia do Rendimento: ");
					diaDeRendimento = ler.nextInt();

					System.out.println("Informe a taxa de Rendimento: ");
					taxaDeRendimento = ler.nextDouble();

					pessoa = new Pessoa(nomeCliente);
					c_p = new ContaPoupanca(pessoa, nomeDoBanco, numeroAgencia, numeroConta, saldoConta,
							diaDeRendimento, taxaDeRendimento);
					listaDeContas.add(c_p);

					System.out.println("\n-------------------------------------------------");
					System.out.println("Conta Adicionada com Sucesso.\n");

				}

				else if (opcaoConta == 2) {
					System.out.println("\n-------------------------------------------------");
					nomeCliente = null;
					nomeDoBanco = null;
					numeroAgencia = null;
					numeroConta = null;
					saldoConta = 0;
					limiteContaEspecial = 0;

					System.out.println("Informe o Nome do Cliente: ");
					nomeCliente = ler.nextLine();

					System.out.println("Informe o Nome do Banco: ");
					nomeDoBanco = ler.nextLine();

					System.out.println("Informe o Número da Agencia: ");
					numeroAgencia = ler.nextLine();

					System.out.println("Informe o número do Conta: ");
					numeroConta = ler.nextLine();

					System.out.println("Informe o Saldo Inicial: ");
					saldoConta = ler.nextDouble();

					System.out.println("Informe o Limite da Conta Especial: ");
					limiteContaEspecial = ler.nextDouble();

					pessoa = new Pessoa(nomeCliente);
					c_e = new ContaEspecial(pessoa, nomeDoBanco, numeroAgencia, numeroConta, saldoConta,
							limiteContaEspecial);
					listaDeContas.add(c_e);
				}

				else {
					System.out.println("-------------------------------------------------");
					System.out.println("Opcao Incorreta. Tente Novamente.");
				}

				break;

			// CASE 02
			case 2:
				numeroConta = null;
				opcaoConta = null;

				System.out.println("\n-------------------------------------------------");
				System.out
						.println("Selecione um dos Tipos de Contas:" + "\n1. Conta Poupança." + "\n2. Conta Especial.");
				opcaoConta = ler.nextInt();
				ler.nextLine();

				if (opcaoConta == 1) {

					numeroConta = null;

					System.out.println("\n-------------------------------------------------");
					System.out.println("Informe o Número da Conta que deseja Sacar um valor: ");
					numeroConta = ler.nextLine();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria contaB = listaDeContas.get(i);
						if (numeroConta.equalsIgnoreCase(contaB.getNumeroConta())) {
							if (contaB instanceof ContaPoupanca) {
								ContaPoupanca contaP = (ContaPoupanca) contaB;

								System.out.println("\n-------------------------------------------------");
								System.out.println("Informe o Valor que deseja Sacar: ");
								sacarValor = ler.nextDouble();

								if (sacarValor <= contaP.getSaldoConta()) {

									contaP.sacarConta(sacarValor);
									System.out.println("\n-------------------------------------------------");
									System.out.println("Valor Sacado.\nNovo Saldo: R$ " + contaP.getSaldoConta());

								} else {
									System.out.println("\n-------------------------------------------------");
									System.out.println("Valor não poderá ser Sacado. Verifique o seu Saldo.\n");
								}

							}
						}
					}
				}

				else if (opcaoConta == 2) {

					numeroConta = null;

					System.out.println("\n-------------------------------------------------");
					System.out.println("Informe o Número da Conta que deseja Sacar um valor: ");
					numeroConta = ler.nextLine();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria contaB = listaDeContas.get(i);

						if (numeroConta.equalsIgnoreCase(contaB.getNumeroConta())) {
							if (contaB instanceof ContaEspecial) {
								ContaEspecial contaE = (ContaEspecial) contaB;

								System.out.println("\n-------------------------------------------------");
								System.out.println("Informe o Valor que deseja Sacar: ");
								sacarValor = ler.nextDouble();

								if (sacarValor > 0) {
									if (contaE.getSaldoConta() >= (-1 * contaE.getLimiteContaEspecial())) {

										contaE.sacarConta(sacarValor);
										System.out.println("\n-------------------------------------------------");
										System.out.println("Valor Sacado.\nNovo Saldo: R$ " + contaE.getSaldoConta());

									} else {
										System.out.println("\n-------------------------------------------------");
										System.out.println(
												"Valor não poderá ser Sacado mais do que o Limite da sua Conta. Verifique o seu Saldo/Limite.\n");
									}
								} else {
									System.out.println("\n-------------------------------------------------");
									System.out.println("Valor Para Ser Sacado tem que ser maior do que zero.\n");

								}
							}
						}
					}
				}

				else {
					System.out.println("-------------------------------------------------");
					System.out.println("Opcao Incorreta. Tente Novamente.");
				}

				break;

			// CASE 03
			case 3:

				numeroConta = null;
				opcaoConta = null;

				System.out.println("\n-------------------------------------------------");
				System.out
						.println("Selecione um dos Tipos de Contas:" + "\n1. Conta Poupança." + "\n2. Conta Especial.");
				opcaoConta = ler.nextInt();
				ler.nextLine();

				if (opcaoConta == 1) {

					numeroConta = null;

					System.out.println("\n-------------------------------------------------");
					System.out.println("Informe o Número da Conta que deseja Depositar um valor: ");
					numeroConta = ler.nextLine();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria contaB = listaDeContas.get(i);

						if (numeroConta.equalsIgnoreCase(contaB.getNumeroConta())) {
							if (contaB instanceof ContaPoupanca) {
								ContaPoupanca contaP = (ContaPoupanca) contaB;

								System.out.println("\n-------------------------------------------------");
								System.out.println("Informe o Valor que deseja Depositar: ");
								depositoValor = ler.nextDouble();

								if (depositoValor >= 0) {
									contaP.depositarConta(depositoValor);

									System.out.println("\n-------------------------------------------------");
									System.out.println("Valor Depositado.\nNovo Saldo: R$ " + contaP.getSaldoConta());

								} else {
									System.out.println("\n-------------------------------------------------");
									System.out.println("Informe o valor da forma correta.");
								}
							}
						}

					}
				}

				else if (opcaoConta == 2) {

					numeroConta = null;

					System.out.println("\n-------------------------------------------------");
					System.out.println("Informe o Número da Conta que deseja Depositar um valor: ");
					numeroConta = ler.nextLine();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria contaB = listaDeContas.get(i);

						if (numeroConta.equalsIgnoreCase(contaB.getNumeroConta())) {
							if (contaB instanceof ContaEspecial) {
								ContaEspecial contaE = (ContaEspecial) contaB;

								System.out.println("\n-------------------------------------------------");
								System.out.println("Informe o Valor que deseja Depositar: ");
								depositoValor = ler.nextDouble();

								if (depositoValor >= 0) {
									contaE.depositarConta(depositoValor);
									System.out.println("\n-------------------------------------------------");
									System.out.println("Valor Depositado.\nNovo Saldo: R$ " + contaE.getSaldoConta());
								} else {
									System.out.println("\n-------------------------------------------------");
									System.out.println("Informe o valor da forma correta.");
								}
							}
						}

					}
				}

				else {
					System.out.println("-------------------------------------------------");
					System.out.println("Opcao Incorreta. Tente Novamente.");
				}

				break;

			// CASE 04
			case 4:

				numeroConta = null;
				opcaoConta = null;

				System.out.println("\n-------------------------------------------------");
				System.out
						.println("Selecione um dos Tipos de Contas:" + "\n1. Conta Poupança." + "\n2. Conta Especial.");
				opcaoConta = ler.nextInt();
				ler.nextLine();

				if (opcaoConta == 1) {

					numeroConta = null;

					System.out.println("\n-------------------------------------------------");
					System.out.println("Informe o Número da Conta que deseja Verificar o Saldo: ");
					numeroConta = ler.nextLine();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria contaB = listaDeContas.get(i);

						if (numeroConta.equalsIgnoreCase(contaB.getNumeroConta())) {
							if (contaB instanceof ContaPoupanca) {
								ContaPoupanca contaP = (ContaPoupanca) contaB;

								System.out.println("\n-------------------------------------------------");
								System.out.println("Saldo Atual: R$ " + contaP.getSaldoConta() + "\nDia de Rendimento: "
										+ contaP.getDiaDeRendimento() + "\nTaxa de Rendimento: "
										+ contaP.getTaxaDeRendimento() + "%" + "\nValor do Rendimento: R$ "
										+ (contaP.getSaldoConta() * (contaP.taxaDeRendimento / 100.0)
												+ "\nNovo Saldo: R$ " + contaP.renderJuros()));
							}
						}
					}
				}

				else if (opcaoConta == 2) {

					numeroConta = null;
					System.out.println("\n-------------------------------------------------");
					System.out.println("Informe o Número da Conta que deseja Verificar o Saldo: ");
					numeroConta = ler.nextLine();

					for (int i = 0; i < listaDeContas.size(); i++) {
						ContaBancaria contaB = listaDeContas.get(i);

						if (numeroConta.equalsIgnoreCase(contaB.getNumeroConta())) {
							if (contaB instanceof ContaEspecial) {
								ContaEspecial contaE = (ContaEspecial) contaB;

								System.out.println("\n-------------------------------------------------");
								System.out.println("Saldo Atual: R$ " + contaE.getSaldoConta());

							}
						}
					}
				}

				else {
					System.out.println("-------------------------------------------------");
					System.out.println("Opcao Incorreta. Tente Novamente.");
				}

				break;

			case 5:
				System.out.println("\n\n-------------------------------------------------");
				System.out.println("Contas do Tipo Poupança\n\n");

				for (int i = 0; i < listaDeContas.size(); i++) {
					ContaBancaria contaB = listaDeContas.get(i);

					if (contaB instanceof ContaPoupanca) {
						ContaPoupanca contaP = (ContaPoupanca) contaB;
						System.out.println(contaP.toString());
					}
				}

				System.out.println("\n\n-------------------------------------------------");
				System.out.println("Contas do Tipo Especial\n\n");
				for (int i = 0; i < listaDeContas.size(); i++) {
					ContaBancaria contaB = listaDeContas.get(i);

					if (contaB instanceof ContaEspecial) {
						ContaEspecial contaE = (ContaEspecial) contaB;
						System.out.println(contaE.toString());
					}
				}

				break;
			}

		} while (opcaoMenu != 0 || listaDeContas.size() == 5);

		ler.close();
	}
}
