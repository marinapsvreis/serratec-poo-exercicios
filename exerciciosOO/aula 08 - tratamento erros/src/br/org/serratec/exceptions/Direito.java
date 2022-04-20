package br.org.serratec.exceptions;

public final class Direito extends Faculdade implements Oab, Eventos {
	private int tempoDuracao;

	public Direito(String nome, String nomeFaculdade, int bloco, int tempoDuracao) {
		super(nome, nomeFaculdade, bloco);
		this.tempoDuracao = tempoDuracao;
	}

	public int getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(int tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	@Override
	public String matrizCurricular() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void fazerMatricula() {
		// TODO Auto-generated method stub

	}
	
	public String programacao() {
		return null;
	}
	
	public void conteudoEventos() {
		
	}
	
	public boolean realizarProva() {
		return false;
	}

}
