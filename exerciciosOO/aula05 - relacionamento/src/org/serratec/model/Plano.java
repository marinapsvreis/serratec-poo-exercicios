package org.serratec.model;

public class Plano {
	protected String empresa;
	protected double valorPago = 80.0;
	protected double valorISS = 5.0;

	public Plano(String empresa) {
		this.empresa = empresa;
	}

	public String getEmpresa() {
		return empresa;
	}

	public double getValorPago() {
		return valorPago;
	}

	public double getValorISS() {
		return valorISS;
	}

	@Override
	public String toString() {
		return "Plano: " 
				+ empresa + "\n"
				+ "Valor pago: "
				+ String.format("%.2f", valorPago) + "\n";
	}

	public double calcularPagamento() {
		valorPago = valorPago - valorPago*valorISS/100;
		return valorPago;
	}

}
