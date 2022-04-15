package br.org.serratec.model;

public abstract class Pessoa {
	protected String nome;
	protected String endereco;
	protected double rendimentos;

	public Pessoa(String nome, String endereco, double rendimentos) {
		this.nome = nome;
		this.endereco = endereco;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\n" 
				+"Endereco: " + endereco + "\n"
				+"Rendimentos: " + rendimentos + "\n";
	}

}
