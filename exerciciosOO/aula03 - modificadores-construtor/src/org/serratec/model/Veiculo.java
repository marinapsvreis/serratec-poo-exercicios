package org.serratec.model;

public class Veiculo {
	String placa;
	String tipoCombustivel;
	double valor;
	
	public double calcIPVA() {
		if(tipoCombustivel.equals("Flex") || tipoCombustivel.equals("Gasolina")) {
			return valor * 0.04;
		}else {
			return valor * 0.015;
		}
	}
}
