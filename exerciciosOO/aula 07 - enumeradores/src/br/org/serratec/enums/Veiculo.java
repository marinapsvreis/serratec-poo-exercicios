package br.org.serratec.enums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Veiculo {
	protected String modelo;
	protected static double valorCobrado = 0.0;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;
	private String servicosSelecionados = "";
	private String descontosAplicados = "";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Veiculo(String modelo, LocalDate dataConserto, Proprietario proprietario) {
		this.modelo = modelo;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public static void setValorCobrado(double valorCobrado) {
		Veiculo.valorCobrado = valorCobrado;
	}

	public double getValorCobrado() {
		return valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setServicosSelecionados(String servicosSelecionados) {
		this.servicosSelecionados = servicosSelecionados;
	}

	public String getServicosSelecionados() {
		return servicosSelecionados;
	}	

	public String getDescontosAplicados() {
		return descontosAplicados;
	}

	public void setDescontosAplicados(String descontosAplicados) {
		this.descontosAplicados = descontosAplicados;
	}

	@Override
	public String toString() {
		return "Veiculo: " + modelo + "\nData Serviços: " + dataConserto.format(formatter) + "\n" + proprietario.toString();
	}

}
