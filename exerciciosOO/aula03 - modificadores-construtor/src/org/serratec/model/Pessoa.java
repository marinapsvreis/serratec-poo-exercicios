package org.serratec.model;

public class Pessoa {
	private int codigoPessoa;
	private String nome;
	private double peso;
	private double altura;

	public Pessoa() {

	}

	public Pessoa(int codigoPessoa, String nome, double peso, double altura) {
		this.codigoPessoa = codigoPessoa;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}

	public int getCodigoPessoa() {
		return codigoPessoa;
	}

	public void setCodigoPessoa(int codigoPessoa) {
		this.codigoPessoa = codigoPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	private double calcularIMC() {
		return peso / (altura * altura);
	}

	public String resultado() {
		String resultado;
		if (calcularIMC() < 18.5) {
			resultado = "Abaixo do peso";
		} else if (calcularIMC() <= 24.9) {
			resultado = "Peso ideal";
		} else {
			resultado = "Acima do peso";
		}
		return resultado;
	}
}                                                                              
