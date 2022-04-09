package org.serratec.model;

public class Imobiliaria {
	String tipoImovel;
	double valorImovel;
	String local;
	
	
	//Metodo que aumenta em 10% o valor de apartamentos e 5% o valor de casas
	public void reajustarImovel() {
		if(tipoImovel.equals("apartamento")) {
			valorImovel *= 1.1;
		}else if(tipoImovel.equals("casa")) {
			valorImovel *= 1.05;
		}
	}
}
