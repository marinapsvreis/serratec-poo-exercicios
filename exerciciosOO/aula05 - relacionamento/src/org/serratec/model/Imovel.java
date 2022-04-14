package org.serratec.model;

public class Imovel {
	private String tipo;
	private double valor;
	private Pessoa dono;

	public Imovel(String tipo, double valor, Pessoa dono) {
		this.tipo = tipo;
		this.valor = valor;
		this.dono = dono;
	}

	public String getTipo() {
		return tipo;
	}

	public double getValor() {
		return valor;
	}

	public Pessoa getDono() {
		return dono;
	}

}
