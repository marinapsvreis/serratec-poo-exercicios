package br.com.senai.model;

import java.util.Objects;

public class Empregado {
	private String nome;
	private String profissao;

	public Empregado(String nome, String profissao) {
		this.nome = nome;
		this.profissao = profissao;
	}

	public String getNome() {
		return nome;
	}

	public String getProfissao() {
		return profissao;
	}

	@Override
	public String toString() {
		return nome + ";" + profissao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empregado other = (Empregado) obj;
		return Objects.equals(nome, other.nome);
	}

}
