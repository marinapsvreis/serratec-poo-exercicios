package org.serratec.model;

public class Pessoa {
	private String cpf;
	private String nome;
	private String telefone;

	public Pessoa(String cpf, String nome, String telefone) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [cpf=" + cpf + ", nome=" + nome + ", telefone=" + telefone + "]";
	}

}
