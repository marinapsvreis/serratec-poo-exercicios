package br.org.serratec.enums;

import java.time.LocalDate;

public class Tucano extends Ave {
	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	public double getPeso() {
		return peso;
	}

	@Override
	public String voar() {
		return getNome() + " está voando!";
	}

	@Override
	public String emitirSom() {
		return getNome() + " gorjeou!";
	}

}
