package br.org.serratec.model;

public class Funcionario {
	protected String cpf;
	protected String nome;
	protected double salario;
	
	public Funcionario() {
		
	}

	public Funcionario(String cpf, String nome, double salario) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
