package org.serratec.model;

public class Medico {
	private String crm;
	private String nome;
	private double salario;
	private double valorConsulta;
	private static int contador;

	public Medico(String crm, String nome, double salario, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.salario = salario;
		this.valorConsulta = valorConsulta;
		contador++;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
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

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}
	
	public double pagamentoDinheiro() {
		return valorConsulta;
	}
	
	public double pagamentoPlano() {
		return valorConsulta *= 0.7;
	}
	
	public static int getContador() {
		return contador;
	}

}
