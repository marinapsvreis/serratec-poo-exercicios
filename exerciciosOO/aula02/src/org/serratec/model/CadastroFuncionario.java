package org.serratec.model;

public class CadastroFuncionario {
	String nome;
	String telefone;
	String email;
	Double salario;

	public CadastroFuncionario(String nome, String telefone, String email, double salario) {
		super();
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.salario = salario;
	}
	
	public void aumentarSalario() {
		salario *= 1.1; 
	}

}
