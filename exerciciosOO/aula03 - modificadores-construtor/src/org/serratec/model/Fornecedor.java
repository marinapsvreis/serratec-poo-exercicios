package org.serratec.model;

public class Fornecedor {
	private String cnpj;
	private String razaoSocial;
	private String telefone;
	private static int contador;

	public Fornecedor(String cnpj, String razaoSocial, String telefone) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		this.telefone = telefone;
		contador++;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public static int getContador() {
		return contador;
	}

}
