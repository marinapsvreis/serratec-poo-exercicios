package org.serratec.model;

public class TesteLuta {

	public static void main(String[] args) {
		CategoriaLuta cl1 = new CategoriaLuta(1, "Peso Médio");
		CategoriaLuta cl2 = new CategoriaLuta(2, "Peso Pesado");
		
		Lutador l1 = new Lutador("Lutador 1", cl1, 30, 80.0);
		Lutador l2 = new Lutador("Lutador 2", cl1, 35, 85.0);
		Lutador l3 = new Lutador("Lutador 3", cl2, 25, 100.0);
		
		Luta luta1 = new Luta(l1, l3, 5);
		Luta luta2 = new Luta(l1, l2, 5);
		Luta luta3 = new Luta(l1, l1, 5);
		
		System.out.println(luta1);
		System.out.println();
		System.out.println(luta2);
		System.out.println();
		System.out.println(luta3);

	}

}
