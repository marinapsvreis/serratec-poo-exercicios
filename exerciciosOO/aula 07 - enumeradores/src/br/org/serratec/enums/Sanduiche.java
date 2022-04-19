package br.org.serratec.enums;

public enum Sanduiche {
	HOTDOG("Hot Dog", 7.00), HAMBURGUER("Hamburguer", 15.00), MISTO("Misto Quente", 6.50);

	private String tipoSanduiche;
	private double valor;

	private Sanduiche(String tipoSanduiche, double valor) {
		this.tipoSanduiche = tipoSanduiche;
		this.valor = valor;
	}

	public String getTipoSanduiche() {
		return tipoSanduiche;
	}

	public double getValor() {
		return valor;
	}

}
