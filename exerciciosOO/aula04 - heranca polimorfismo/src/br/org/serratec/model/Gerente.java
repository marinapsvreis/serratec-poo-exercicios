package br.org.serratec.model;

public class Gerente extends Funcionario {
	private int senha;
	private int numeroDeFuncionarios;
	
	public Gerente() {
		super();
	}

	public Gerente(String cpf, String nome, double salario, int senha, int numeroDeFuncionarios) {
		super(cpf, nome, salario);
		this.senha = senha;
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public boolean autentica(int senha) {
		return false;
	}
}
