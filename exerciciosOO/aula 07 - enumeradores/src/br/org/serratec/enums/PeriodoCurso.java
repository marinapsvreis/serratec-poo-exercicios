package br.org.serratec.enums;

public enum PeriodoCurso {
	INTEGRAL("segunda a sexta", 80, 3600), 
	NOTURNO("terca e quinta", 40, 1200), 
	MANHA("quarta e sexta", 60, 2400);

	private String diasDaSemana;
	private int cargaHoraria;
	private double valor;

	private PeriodoCurso(String diasDaSemana, int cargaHoraria, double valor) {
		this.diasDaSemana = diasDaSemana;
		this.cargaHoraria = cargaHoraria;
		this.valor = valor;
	}

	public String getDiasDaSemana() {
		return diasDaSemana;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public double getValor() {
		return valor;
	}

}
