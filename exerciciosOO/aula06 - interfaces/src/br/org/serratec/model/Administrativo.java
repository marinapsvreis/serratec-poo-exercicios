package br.org.serratec.model;

public class Administrativo extends Funcionario {
	private int horaExtra;
	private double salarioTotal;

	public Administrativo(String nome, int horaExtra) {
		super(nome);
		this.horaExtra = horaExtra;
		salarioTotal = 0.0;
	}

	public int getHoraExtra() {
		return horaExtra;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+"Horas Extras: " + horaExtra + "\n"
				+ "Salário Total: R$" + String.format("%.2f", salarioTotal);
	}

	@Override
	public void calcularSalario() {
		salarioTotal = salarioMinimo + horaExtra * (salarioMinimo/220 * 2); 
	}

}
