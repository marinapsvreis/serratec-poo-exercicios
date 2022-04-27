package br.serratec.model;

public class Funcionario {
	private String nome;
	private String cargo;
	private String depto;

	public Funcionario(String nome, String cargo, String depto) {
		this.nome = nome;
		this.cargo = cargo;
		this.depto = depto;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public String getDepto() {
		return depto;
	}

	@Override
	public String toString() {
		return nome + " - " + cargo + " - " + depto;
	}
	
	

}
