package lista_05;
import java.util.Scanner;

public class EntradaRetangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Retangulo novoRetangulo = null;

		double base = 0, altura = 0;
		int opcaoMenu;

		do {
			System.out.println("-------------------------------------------------------------");
			System.out.print("Informe uma das opções a seguir.\n" + "1. Criar um retângulo (Digitar valor de B e H)\n"
					+ "2. Calcular Área\n" + "3. Calcular Perímetro\n" + "0. Sair.\n-> ");
			opcaoMenu = ler.nextInt();

			switch (opcaoMenu) {
			case 1:
				base = 0;
				altura = 0;
				System.out.println("-------------------------------------------------------------");
				System.out.println("Informe o tamanho da base do Retangulo em m²: ");
				base = ler.nextDouble();
				System.out.println("-------------------------------------------------------------");
				System.out.println("Informe a Altura do Retangulo em m²: ");
				altura = ler.nextDouble();

				novoRetangulo = new Retangulo(base, altura);
				System.out.println("-------------------------------------------------------------");
				System.out.println("Retangulo Inserido com Sucesso.");
				
				
				break;
				
			case 2:
				Retangulo ret = (Retangulo) novoRetangulo;
				System.out.println("-------------------------------------------------------------");
				System.out.println("Aqui será Calculado a Área do Retangulo");
				System.out.println("A área do retangulo é: " + ret.calculaAreaRet());
				break;
				
			case 3:
				Retangulo ret2 = (Retangulo) novoRetangulo;
				System.out.println("-------------------------------------------------------------");
				System.out.println("Aqui será Calculado a Área do Retangulo");
				System.out.println("A área do retangulo é: " + ret2.calcPerimetroRet());
				break;
			case 0:
				System.out.println("-------------------------------------------------------------");
				System.out.println("Programa Encerrado. Até logo.");
				break;
				
			default:
				System.out.println("-------------------------------------------------------------");
				System.out.println("Opcao digitada de maneira incorreta.\nTente Novamente.");
				break;
			}

		} while (opcaoMenu != 0);
		
		System.out.println("-------------------------------------------------------------");
		ler.close();
		

	}

}
