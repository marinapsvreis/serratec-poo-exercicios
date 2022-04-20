package br.org.serratec.exceptions;

public abstract class Faculdade extends Universidade {
	protected String nomeFaculdade;
	protected int bloco;

	public Faculdade(String nome, String nomeFaculdade, int bloco) {
		super(nome);
		this.nomeFaculdade = nomeFaculdade;
		this.bloco = bloco;
	}

	public String getNomeFaculdade() {
		return nomeFaculdade;
	}

	public int getBloco() {
		return bloco;
	}

	@Override
	public String toString() {
		return super.toString() + "Faculdade: " + nomeFaculdade + "\n" + "Bloco: " + bloco + "\n";
	}

	public abstract String matrizCurricular();

}
