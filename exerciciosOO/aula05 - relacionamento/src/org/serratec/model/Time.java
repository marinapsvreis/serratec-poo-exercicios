package org.serratec.model;

public class Time {
	private String nome;
	private String tecnico;
	private Atleta[] atletas;

	public Time(String nome, String tecnico, Atleta[] atletas) {
		this.nome = nome;
		this.tecnico = tecnico;
		this.atletas = atletas;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTecnico() {
		return tecnico;
	}

	public void setTecnico(String tecnico) {
		this.tecnico = tecnico;
	}

	public Atleta[] getAtletas() {
		return atletas;
	}

	public void setAtletas(Atleta[] atletas) {
		this.atletas = atletas;
	}

	public void inserirAtletas(Atleta atleta) {
		for (int i = 0; i < atletas.length; i++) {
			if (atletas[i] == null) {
				atletas[i] = atleta;
				break;
			}
		}
	}

	public void listaTime() {
		for (int i = 0; i < atletas.length; i++) {
			System.out.println("Nome do Atleta: " + atletas[i].getNome());
		}
	}

}
