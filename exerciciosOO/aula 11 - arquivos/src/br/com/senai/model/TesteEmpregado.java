package br.com.senai.model;

public class TesteEmpregado {

	public static void main(String[] args) {
		Empregado e1 = new Empregado("Pedro", "Analista");
		Empregado e2 = new Empregado("Pedro2", "Analista");
		
		if(e1.equals(e2)) {
			System.out.println("Igual");
		}else {
			System.out.println("Diferente");
		}

	}

}
