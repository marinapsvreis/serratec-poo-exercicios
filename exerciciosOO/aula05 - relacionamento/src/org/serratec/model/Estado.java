package org.serratec.model;

public class Estado {
	private String nomeEstado;
	private String siglaEstado;

	public Estado(String nomeEstado, String siglaEstado) {
		this.nomeEstado = nomeEstado;
		this.siglaEstado = siglaEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public String getSiglaEstado() {
		return siglaEstado;
	}

	@Override
	public String toString() {
		return nomeEstado + " - " + siglaEstado;
	}
	
	

}
