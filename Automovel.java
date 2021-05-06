package lab4;

import java.util.Objects;

public class Automovel {

	private String placa;
	private int horaEntrada;
	private int minutoEntrada;
	private int horaSaida;
	private int minutoSaida;
	private float tempo;
	private float valor;

	public Automovel(String placa, int horaEntrada, int minutoEntrada) {
		this.placa = placa;
		this.horaEntrada = horaEntrada;
		this.minutoEntrada = minutoEntrada;
		this.horaSaida = horaSaida;
		this.minutoSaida = minutoSaida;
		this.tempo = tempo;
		this.valor = valor;

	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getHoraEntrada() {
		return this.horaEntrada;
	}

	public void setHoraEntrada(int horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public int getMinutoEntrada() {
		return this.minutoEntrada;
	}

	public void setMinutoEntrada(int minutoEntrada) {
		this.minutoEntrada = minutoEntrada;
	}

	public int getHoraSaida() {
		return this.horaSaida;
	}

	public void setHoraSaida(int horaSaida) {
		this.horaSaida = horaSaida;
	}

	public int getMinutoSaida() {
		return this.minutoSaida;
	}

	public void setMinutoSaida(int minutoSaida) {
		this.minutoSaida = minutoSaida;
	}

	public float getTempo() {
		return this.tempo;
	}

	public void setTempo(float tempo) {
		this.tempo = tempo;
	}

	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "{" + " placa='" + getPlaca() + "'" + ", horaEntrada='" + getHoraEntrada() + "'" + ", minutoEntrada='"
				+ getMinutoEntrada() + "'" + ", horaSaida='" + getHoraSaida() + "'" + ", minutoSaida='"
				+ getMinutoSaida() + "'" + ", tempo='" + getTempo() + "'" + ", valor='" + getValor() + "'" + "}";
	}

	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Automovel)) {
			return false;
		}
		Automovel automovel = (Automovel) o;
		return Objects.equals(placa, automovel.placa);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(placa);
	}

}