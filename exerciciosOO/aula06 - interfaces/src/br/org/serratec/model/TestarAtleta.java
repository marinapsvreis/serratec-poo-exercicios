package br.org.serratec.model;

public class TestarAtleta {

	public static void main(String[] args) {
		Pais p1 = new Pais("Brasil");
		Pais p2 = new Pais("EUA");
		
		Atleta a1 = new Atleta("Anderson Silva", 98, p1);
		Atleta a2 = new Atleta("Jon Jone", 59, p2);
		Atleta a3 = new Atleta("Vitor Belfort", 110, p1);
		Atleta a4 = new Atleta("Atleta 4", 70, p2);
		
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		System.out.println();
		System.out.println(a3);
		System.out.println();
		System.out.println(a4);
		
		System.out.println();		
		System.out.println("Total participantes: " + Atleta.getTotalParticipantes());
		

	}

}
