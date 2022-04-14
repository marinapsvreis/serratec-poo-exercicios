package org.serratec.model;

public class TestarImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("12345678900", "Marina", "+5524999407781");
		Imovel i1 = new Imovel("Apartamento", 250000.00, p1);
		
		//Imovel i2 = new Imovel("Apartamento", 250000.00, new Pessoa("12345678900", "Marina", "+5524999407781"));
		System.out.println("Imovel: " + i1.getTipo() 
							+ "\nValor: " + String.format("%.2f", i1.getValor()) 
							+ "\nNome: " + i1.getDono().getNome());
		

	}

}
