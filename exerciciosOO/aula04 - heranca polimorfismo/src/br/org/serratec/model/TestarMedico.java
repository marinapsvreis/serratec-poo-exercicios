package br.org.serratec.model;

public class TestarMedico {

	public static void main(String[] args) {
		Medico a1 = new Anestesista("12345", "Bob Amarildo", 200.00, 1000.00);
		Medico m1 = new Medico("54321", "Rob Moura", 200.00);
		
		System.out.println(m1);
		System.out.println(a1);

	}

}
