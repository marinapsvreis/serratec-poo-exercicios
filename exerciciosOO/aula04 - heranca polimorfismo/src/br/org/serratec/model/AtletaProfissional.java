package br.org.serratec.model;

public class AtletaProfissional extends Maratona {
	private double peso;

	public AtletaProfissional(String nome, String sexo, int idade, double altura, double peso) {
		super(nome, sexo, idade, altura);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Peso: " + String.format("%.2f", peso) + "\n";
	}

}
