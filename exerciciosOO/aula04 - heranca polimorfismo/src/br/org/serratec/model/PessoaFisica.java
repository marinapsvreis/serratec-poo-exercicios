package br.org.serratec.model;

public class PessoaFisica extends ImpostoDeRenda {
	private String cpf;
	private String rg;

	public PessoaFisica(String nome, String telefone, String email, double rendimentos, String cpf, String rg) {
		super(nome, telefone, email, rendimentos);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
	public double calculoIR() {
		return rendimentos * 0.12;
	}

}
