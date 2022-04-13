package br.org.serratec.model;

public abstract class ImpostoDeRenda {
	protected String nome;
	protected String telefone;
	protected String email;
	protected double rendimentos;

	public ImpostoDeRenda(String nome, String telefone, String email, double rendimentos) {
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.rendimentos = rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(double rendimentos) {
		this.rendimentos = rendimentos;
	}
	
	public abstract double calculoIR();

}
