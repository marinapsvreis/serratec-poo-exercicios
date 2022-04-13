package br.org.serratec.model;

public class PessoaJuridica extends ImpostoDeRenda {
	private String cnpj;
	private String inscEstadual;

	public PessoaJuridica(String nome, String telefone, String email, double rendimentos, String cnpj,
			String inscEstadual) {
		super(nome, telefone, email, rendimentos);
		this.cnpj = cnpj;
		this.inscEstadual = inscEstadual;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}
	
	public double calculoIR() {
		return rendimentos * 0.15;
	}

}
