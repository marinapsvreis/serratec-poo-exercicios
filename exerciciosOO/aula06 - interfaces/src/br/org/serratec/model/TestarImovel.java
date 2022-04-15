package br.org.serratec.model;

public class TestarImovel {

	public static void main(String[] args) {
		Imovel a1 = new Apartamento("Centro", 150000.00, 5, 505);
		Imovel c1 = new Casa("Bingen", 200000.00, true);
		Proprietario p1 = new Proprietario("Marina", a1);
		Proprietario p2 = new Proprietario("Mateus", c1);
		
		System.out.println(p1);
		System.out.println(p2);

	}

}
