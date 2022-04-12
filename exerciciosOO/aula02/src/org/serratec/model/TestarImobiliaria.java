package org.serratec.model;

public class TestarImobiliaria {

	public static void main(String[] args) {
		Imobiliaria imovel = new Imobiliaria();
		
		imovel.tipoImovel = "casa";
		imovel.valorImovel = 200000.00;
		imovel.local = "Rua Bingen n� 500";
		
		System.out.printf("Valor do Primeiro im�vel: R$ %.2f%n", imovel.valorImovel);
		
		imovel.reajustarImovel();
		
		Imobiliaria imovel2 = new Imobiliaria();
		
		imovel2.tipoImovel = "apartamento";
		imovel2.valorImovel = 100000.00;
		imovel2.local = "Rua do Imperador n� 234 APT 508";
		
		System.out.printf("Valor do Segundo im�vel: R$ %.2f%n", imovel2.valorImovel);
		
		imovel2.reajustarImovel();
		
		System.out.printf("O valor do Primeiro im�vel na %s foi reajustado para R$ %.2f.%n", imovel.local, imovel.valorImovel);
		System.out.printf("O valor do Segundo im�vel na %s foi reajustado para R$ %.2f.%n", imovel2.local, imovel2.valorImovel);

	}

}
