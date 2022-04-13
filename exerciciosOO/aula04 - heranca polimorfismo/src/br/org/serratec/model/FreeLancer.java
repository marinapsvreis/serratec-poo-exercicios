package br.org.serratec.model;

public class FreeLancer extends Vendedor {
	private int diasTrabalhados;
	private double valorDia;
	private double salarioTotal;

	public FreeLancer(String nome, String cpf, int diasTrabalhados) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
	}

	public int getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(int diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public double getValorDia() {
		return valorDia;
	}

	public void setValorDia(double valorDia) {
		this.valorDia = valorDia;
	}
	
	public void calcularSalario(double valorDia) {
		salarioTotal = (valorDia * diasTrabalhados);
	}
	
	@Override	
	public String toString() {
		return super.toString()
				+"Salario Bruto: "
				+ String.format("%.2f", salarioTotal) + "\n";
	}
	
}
