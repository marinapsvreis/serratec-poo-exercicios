package br.org.serratec.model;

public interface Tributos extends Taxas, ImpostoDeRenda {
	double calcularICMS();
	
}
