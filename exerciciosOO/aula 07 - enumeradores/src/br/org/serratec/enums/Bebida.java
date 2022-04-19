package br.org.serratec.enums;

public enum Bebida {
	REFRIGERANTE("Refrigerante", 3.00), SUCO("Suco", 6.50), AGUA("Água", 3.00);

	private String nome;
	private double preco;

	private Bebida(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

}
