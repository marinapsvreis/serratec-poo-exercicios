package br.org.serratec.model;

public class Medico {
	protected String crm;
	protected String nome;
	protected double valorConsulta;

	public Medico(String crm, String nome, double valorConsulta) {
		this.crm = crm;
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}

	public String getCrm() {
		return crm;
	}

	public String getNome() {
		return nome;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}
	
	@Override
	public String toString() {
		return "CRM: " + crm + "\n" 
				+ "Nome: " + nome + "\n"
				+ "Valor Consulta " + String.format("%.2f", valorConsulta) + "\n";
	}

}
