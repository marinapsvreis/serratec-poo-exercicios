package br.org.serratec.model;

public abstract class Vendedor {
	protected String nome;
	protected String cpf;
	protected static double totalVendido = 0.0;

	public Vendedor(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override	
	public String toString() {
		return "Nome: "
				+ nome + "\n";
	}
	
	public abstract void calcularSalario(double valor);

}
