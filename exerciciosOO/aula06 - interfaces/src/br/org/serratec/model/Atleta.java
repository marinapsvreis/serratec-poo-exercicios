package br.org.serratec.model;

public class Atleta implements Olimpiadas {
	private String nome;
	private double peso;
	private String modalidade;
	private Pais pais;
	private static int totalParticipantes = 0;
	private String status;

	public Atleta(String nome, double peso, Pais pais) {
		this.nome = nome;
		this.peso = peso;
		this.pais = pais;
		verificaSituacao();
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public String getModalidade() {
		return modalidade;
	}

	public Pais getPais() {
		return pais;
	}

	public static int getTotalParticipantes() {
		return totalParticipantes;
	}

	@Override
	public String toString() {
		return "Atleta: " + nome + "\n" 
				+ "Peso: " + peso + "kg \n" 
				+ "Modalidade: " + modalidade + "\n" 
				+ pais.toString()
				+ "Status: " + status + "\n";
	}

	@Override
	public void verificaSituacao() {
		if (peso >= 90) {
			modalidade = "PESO PESADO";
			totalParticipantes++;
			status = "Participará!";
		} else if (peso >= 60) {
			modalidade = "PESO MEDIO";
			totalParticipantes++;
			status = "Participará!";
		} else {
			modalidade = "DESCLASSIFICADO";
			status = "Não participará!";
		}
	}

}
