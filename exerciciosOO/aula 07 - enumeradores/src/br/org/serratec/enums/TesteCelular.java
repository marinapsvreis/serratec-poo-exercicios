package br.org.serratec.enums;

public class TesteCelular {

	public static void main(String[] args) {
		Celular c1 = new Celular(7, "Galaxy 9", Marca.SAMSUNG);

		System.out.println(c1);

		for (Marca marca : Marca.values()) {
			System.out.println(marca);
		}

	}

}
