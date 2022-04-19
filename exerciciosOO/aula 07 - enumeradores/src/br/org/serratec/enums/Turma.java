package br.org.serratec.enums;

public class Turma {
	private int numero;
	private String curso;
	private PeriodoCurso periodo;

	public Turma(int numero, String curso, PeriodoCurso periodo) {
		this.numero = numero;
		this.curso = curso;
		this.periodo = periodo;
	}

	public int getNumero() {
		return numero;
	}

	public String getCurso() {
		return curso;
	}

	public PeriodoCurso getPeriodo() {
		return periodo;
	}

	@Override
	public String toString() {
		return numero + " - " + curso + " - " + periodo;
	}
	
	
	
	

}
