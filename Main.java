package lab4;

import java.util.*;

public class Main {

	static void exibirMenu() {

		System.out.println("");
		System.out.println("========================================");
		System.out.println("BEM-VINDO AO ESTACIONAMENTO");

		System.out.println("1- Cadastrar Estacionamento");
		System.out.println("2- Cadastrar entrada de veículo");
		System.out.println("3- Cadastrar saída de veículo");
		System.out.println("4- Exibir quantidade total de vagas");
		System.out.println("5- Exibir vagas disponíveis no estacionamento");
		System.out.println("6- Exibir taxa de ocupação do estacionamento");
		System.out.println("7- Exibir veículos estacionados");
		System.out.println("8- Sair");

		System.out.print("Escolha uma das opções acima (1-9): ");

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
				System.out.println("==== Cadastrar entrada de veículo ====\n");
				ler = new Scanner(System.in);
				System.out.println("Digite o número da placa: ");
				String placa = ler.nextLine();
				System.out.println("Digite a hora de entrada do veículo: ");
				int horaE = ler.nextInt();
				System.out.println("Digite o minuto de entrada do veículo: ");
				int minutoE = ler.nextInt();
				estacionamento.cadastrarEntradaVeiculo(placa, horaE, minutoE);

				break;

			case 3:
				System.out.println("==== Cadastrar saída de veículo ====\n");
				ler = new Scanner(System.in);
				System.out.println("Digite o número da placa: ");
				placa = ler.nextLine();
				System.out.println("Digite a hora de saída do veículo: ");
				int horaS = ler.nextInt();
				System.out.println("Digite o minuto de saída do veículo: ");
				int minutoS = ler.nextInt();
				estacionamento.cadastrarSaidaVeiculo(placa, horaS, minutoS);
				
				break;

			case 4:
				System.out.println("==== Exibir quantidade total de vagas ====\n");
				System.out.println("A quantidade total de vagas do estacionamento é de: "
						+ estacionamento.obterNumeroTotalDeVagas());
				break;

			case 5:
				System.out.println("==== Exibir vagas disponíveis no estacionamento ====\n");
				System.out.println("Existem: " + estacionamento.obterVagasDisponiveis() + "vagas disponíveis.");

				break;

			case 6:
				System.out.println("==== Exibir taxa de ocupação do estacionamento ====\n");
				System.out.println(
						"A taxa de ocupação do estacionamento é de: %s" + estacionamento.obterTaxaDeOcupacao());

				break;

			case 7:
				System.out.println("==== Exibir veículos estacionados ====\n");
				estacionamento.exibirVeiculosEstacionados();

				break;

			case 8:
				System.out.println("\nObrigado! Volte sempre!");

				break;

			default:
				System.out.println("\nERRO: opção inválida");

			}

		}

	}
}