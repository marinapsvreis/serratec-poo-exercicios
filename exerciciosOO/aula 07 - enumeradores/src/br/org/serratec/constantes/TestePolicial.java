package br.org.serratec.constantes;

public class TestePolicial {

	public static void main(String[] args) {
		Policial p1 = new Policial("123456789-00", "John Wick", 7000.00, "Brasilia");
		Policial p2 = new Policial("123456789-00", "Robert Maverick", 7000.00, "Rio de Janeiro");
		
		System.out.println("Total Policiais: " + p1.getTotalPoliciais());

	}

}
