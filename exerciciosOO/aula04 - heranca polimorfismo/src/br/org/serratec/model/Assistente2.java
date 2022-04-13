package br.org.serratec.model;

public class Assistente2 extends Funcionario2 {
	private double adicional;

	public Assistente2(String nome, Double salario, String turno, double adicional) {
		super(nome, salario, turno);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}
	
	public String toString() {
		return super.toString()
				+ "Adicional: "
				+ String.format("R$ %.2f", adicional) + "\n";
	}
	
	@Override
	public void aumentarSalario() {
		salario = salario*1.02 + adicional;
	}
}
