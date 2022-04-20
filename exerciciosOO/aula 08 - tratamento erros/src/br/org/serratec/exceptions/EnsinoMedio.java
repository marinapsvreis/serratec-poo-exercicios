package br.org.serratec.exceptions;

public final class EnsinoMedio extends ColegioAplicacao {
	
	private int numeroAlunos;
	
	public EnsinoMedio(String nome, String nomeCoordenador, int numeroAlunos) {
		super(nome, nomeCoordenador);
		this.numeroAlunos = numeroAlunos;
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
