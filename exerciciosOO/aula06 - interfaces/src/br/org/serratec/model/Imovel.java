package br.org.serratec.model;

public abstract class Imovel {
	private String local;
	private double valor;

	public Imovel(String local, double valor) {
		this.local = local;
		this.valor = valor;
	}

	public String getLocal() {
		return local;
	}
	
	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "Local: " + local + "\n"
				+ "Valor: R$" + String.format("%.2f", valor) + "\n";
	}
	
	public double calcularITBI() {
		return valor * 0.035;
	}

}
