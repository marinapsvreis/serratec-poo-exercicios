package br.org.serratec.enums;

public class Celular {
	private int tamanho;
	private String modelo;
	private Marca marca;

	public Celular(int tamanho, String modelo, Marca marca) {
		this.tamanho = tamanho;
		this.modelo = modelo;
		this.marca = marca;
	}

	public int getTamanho() {
		return tamanho;
	}

	public String getModelo() {
		return modelo;
	}

	public Marca getMarca() {
		return marca;
	}

	@Override
	public String toString() {
		return tamanho + " - " + modelo + " - " + marca;
	}
	
	
}
