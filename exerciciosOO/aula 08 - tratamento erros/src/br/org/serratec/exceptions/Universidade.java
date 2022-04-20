package br.org.serratec.exceptions;

public abstract class Universidade {
	protected String nome;

	public Universidade(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Universidade: " + nome + "\n";
	}

	public abstract void fazerMatricula();

}
