package br.org.serratec.enums;

public enum Setor {
	RH(10), COMPRAS(20), FINANCEIRO(30), DP(40), TI(50);

	private int sala;

	private Setor(int sala) {
		this.sala = sala;
	}

	public int getSala() {
		return sala;
	}

}
