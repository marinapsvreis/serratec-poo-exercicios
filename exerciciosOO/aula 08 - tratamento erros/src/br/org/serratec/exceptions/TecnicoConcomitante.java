package br.org.serratec.exceptions;

public final class TecnicoConcomitante extends ColegioAplicacao {
	private String nomeCurso;

	public TecnicoConcomitante(String nome, String nomeCoordenador, String nomeCurso) {
		super(nome, nomeCoordenador);
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	@Override
	public void reuniaoDePais() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}

}
