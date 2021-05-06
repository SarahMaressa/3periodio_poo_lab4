package lab4;

import java.util.*;

public class Main {

	static void exibirMenu() {

		System.out.println("");
		System.out.println("========================================");
		System.out.println("BEM-VINDO AO ESTACIONAMENTO");

		System.out.println("1- Cadastrar Estacionamento");
		System.out.println("2- Cadastrar entrada de ve�culo");
		System.out.println("3- Cadastrar sa�da de ve�culo");
		System.out.println("4- Exibir quantidade total de vagas");
		System.out.println("5- Exibir vagas dispon�veis no estacionamento");
		System.out.println("6- Exibir taxa de ocupa��o do estacionamento");
		System.out.println("7- Exibir ve�culos estacionados");
		System.out.println("8- Sair");

		System.out.print("Escolha uma das op��es acima (1-9): ");

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		var estacionamento = new Estacionamento(null, 0, 0);
		int op = 0;
		while (op != 8) {
			exibirMenu();

			op = sc.nextInt();

			switch (op) {

			case 1:

				System.out.println("==== Cadastrar Estacionamento ====\n");
				Scanner ler = new Scanner(System.in);
				System.out.println("Digite o nome do estacionamento: ");
				String nome = ler.nextLine();
				System.out.println("Digite a quantidade de vagas que o estacionamento possui: ");
				int vagas = ler.nextInt();
				System.out.println("Digite o valor da taxa hora do estacionamento: ");
				float taxa = ler.nextFloat();

				estacionamento = new Estacionamento(nome, vagas, taxa);

				break;

			case 2:
				System.out.println("==== Cadastrar entrada de ve�culo ====\n");
				ler = new Scanner(System.in);
				System.out.println("Digite o n�mero da placa: ");
				String placa = ler.nextLine();
				System.out.println("Digite a hora de entrada do ve�culo: ");
				int horaE = ler.nextInt();
				System.out.println("Digite o minuto de entrada do ve�culo: ");
				int minutoE = ler.nextInt();
				estacionamento.cadastrarEntradaVeiculo(placa, horaE, minutoE);

				break;

			case 3:
				System.out.println("==== Cadastrar sa�da de ve�culo ====\n");
				ler = new Scanner(System.in);
				System.out.println("Digite o n�mero da placa: ");
				placa = ler.nextLine();
				System.out.println("Digite a hora de sa�da do ve�culo: ");
				int horaS = ler.nextInt();
				System.out.println("Digite o minuto de sa�da do ve�culo: ");
				int minutoS = ler.nextInt();
				estacionamento.cadastrarSaidaVeiculo(placa, horaS, minutoS);
				
				break;

			case 4:
				System.out.println("==== Exibir quantidade total de vagas ====\n");
				System.out.println("A quantidade total de vagas do estacionamento � de: "
						+ estacionamento.obterNumeroTotalDeVagas());
				break;

			case 5:
				System.out.println("==== Exibir vagas dispon�veis no estacionamento ====\n");
				System.out.println("Existem: " + estacionamento.obterVagasDisponiveis() + "vagas dispon�veis.");

				break;

			case 6:
				System.out.println("==== Exibir taxa de ocupa��o do estacionamento ====\n");
				System.out.println(
						"A taxa de ocupa��o do estacionamento � de: %s" + estacionamento.obterTaxaDeOcupacao());

				break;

			case 7:
				System.out.println("==== Exibir ve�culos estacionados ====\n");
				estacionamento.exibirVeiculosEstacionados();

				break;

			case 8:
				System.out.println("\nObrigado! Volte sempre!");

				break;

			default:
				System.out.println("\nERRO: op��o inv�lida");

			}

		}

	}
}