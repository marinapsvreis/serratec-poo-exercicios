package br.org.serratec.exceptions;

public abstract class ColegioAplicacao extends Universidade {
	protected String nomeCoordenador;

	public ColegioAplicacao(String nome, String nomeCoordenador) {
		super(nome);
		this.nomeCoordenador = nomeCoordenador;
	}

	public abstract void reuniaoDePais();

}
