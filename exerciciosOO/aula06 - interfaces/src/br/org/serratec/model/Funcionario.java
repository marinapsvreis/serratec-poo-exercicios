package br.org.serratec.model;

public abstract class Funcionario {
	protected String nome;
	protected double salarioMinimo = 1200.00;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Funcionario: " + nome + "\n";
	}

	public abstract void calcularSalario();

}
