package lab4;

import java.util.ArrayList;
import java.util.List;

public class Estacionamento implements ControleDeEstacionamento {

	private String nome;
	private int totalVagas;
	private float taxaHora;
	private List<Automovel> automoveis;
	private List<Automovel> historico;

	public Estacionamento(String nome, int totalVagas, float taxaHora) {
		this.nome = nome;
		this.totalVagas = totalVagas;
		this.taxaHora = taxaHora;
		this.automoveis = new ArrayList<>();
		this.historico = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public int getTotalVagas() {
		return this.totalVagas;
	}

	public float getTaxaHora() {
		return this.taxaHora;
	}

	public void setTaxaHora(float taxaHora) {
		this.taxaHora = taxaHora;
	}

	@Override
	public void exibirVeiculosEstacionados() {

		for (Automovel automovel : automoveis) {
			System.out.println(automovel.toString());
		}
	}

	@Override
	public int obterNumeroTotalDeAutomoveis() {

		return automoveis.size();
	}

	@Override
	public int obterNumeroTotalDeVagas() {

		return totalVagas;
	}

	@Override
	public float obterTaxaDeOcupacao() {

		float taxaDeOcupacao = ((float) automoveis.size() / (float) totalVagas) * 100;

		return taxaDeOcupacao;
	}

	public int obterVagasDisponiveis() {

		int vagasDisponiveis = totalVagas - automoveis.size();
		return vagasDisponiveis;
	}

	public boolean verificaVeiculo(String placa) {
		for (Automovel automovel : automoveis) {
			if (automovel.getPlaca() == placa) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void cadastrarEntradaVeiculo(String placa, int horaEntrada, int minutoEntrada) {

		if (verificaVeiculo(placa) == true) {
			System.out.println("ERRO: Veículo já cadastrado!");
		}

		if (horaEntrada < 0 || horaEntrada > 24) {
			System.out.println("ERRO: verifique a hora digitada!");
		}
		if (minutoEntrada < 0 || minutoEntrada > 60) {
			System.out.println("ERRO: verifique o minuto digitado!");
		}

		else {
			Automovel automovel = new Automovel(placa, horaEntrada, minutoEntrada);
			this.automoveis.add(automovel);

		}

	}

	public float calcularTaxahora(int horaEntrada, int minutoEntrada, int horaSaida, int minutoSaida) {
		float valorTotal = (((horaSaida / 60) + minutoSaida) - (horaEntrada / 60) + minutoEntrada) * getTaxaHora();

		return valorTotal;
	}

	@Override
	public float calcularValorEstacionamento(String placa) {
		
		return 0;
	}

	@Override
	public void cadastrarSaidaVeiculo(String placa, int horaSaida, int minutoSaida) {
		
		if (placa.contains(placa) == false) {
			System.out.println("ERRO: Veículo não cadastrado!");
		}
		
		if (horaSaida < 0 || horaSaida > 24) {
			System.out.println("ERRO: verifique a hora digitada!");
		}
		if (minutoSaida < 0 || minutoSaida > 60) {
			System.out.println("ERRO: verifique o minuto digitado!");
		}

		else {
			Automovel automovel = new Automovel(placa, horaSaida, minutoSaida);
			this.automoveis.remove(automovel);
			this.historico.add(automovel);

		}


	}

}