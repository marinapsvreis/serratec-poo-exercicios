package br.org.serratec.constantes;

public class Policial {
	private String cpf;
	private String nome;
	private double salario;
	private final String lotacao;
	private static int totalPoliciais = 0;

	public Policial(String cpf, String nome, double salario, String lotacao) {
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.lotacao = lotacao;
		totalPoliciais++;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nCPF: " + cpf + "\nSalário: " + salario;
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

	public String getLotacao() {
		return lotacao;
	}

	public static int getTotalPoliciais() {
		return totalPoliciais;
	}

	public static void setTotalPoliciais(int totalPoliciais) {
		Policial.totalPoliciais = totalPoliciais;
	}

	public final String mostrarInformacoes() {
		return nome + " - " + cpf + " - " + salario + " - " + lotacao;
	}

}