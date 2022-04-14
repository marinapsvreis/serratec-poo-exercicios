package org.serratec.model;

public class Clinica extends Plano {
	private String nomeClinica;
	private String cnpj;
	
	public Clinica(String nomePlano, String nomeClinica, String cnpj) {
		super(nomePlano);
		this.nomeClinica = nomeClinica;
		this.cnpj = cnpj;
	}
	
	@Override
	public String toString() {
		return super.toString() 
				+ "Clínica: " 
				+ nomeClinica + "\n"
				+ "CNPJ: " 
				+ cnpj + "\n";
	}

	public String getNomeClinica() {
		return nomeClinica;
	}

	public void setNomeClinica(String nomeClinica) {
		this.nomeClinica = nomeClinica;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
