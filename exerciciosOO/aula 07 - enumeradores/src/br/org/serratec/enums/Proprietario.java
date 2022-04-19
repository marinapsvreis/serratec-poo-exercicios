package br.org.serratec.enums;

public class Proprietario {
	private String nome;

	public Proprietario(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Proprietario: " + nome + "\n";
	}

}