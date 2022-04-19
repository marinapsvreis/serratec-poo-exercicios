package br.org.serratec.enums;

public enum EstadoCivil {
	SOLTEIRO('S'), CASADO('C'), VIUVO('V'), DIVORCIADO('D');

	private char valor;

	private EstadoCivil(char valor) {
		this.valor = valor;
	}

	public char getEstadoCivil() {
		return valor;
	}

}
