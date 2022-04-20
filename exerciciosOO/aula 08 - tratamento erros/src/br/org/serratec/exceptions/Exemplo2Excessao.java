package br.org.serratec.exceptions;

public class Exemplo2Excessao {

	public static void main(String[] args) {
		String fraseInicial = null;
		String fraseFinal = null;
		
		try {
			fraseFinal = fraseInicial.toUpperCase();
			System.out.println("Resultado: " + fraseFinal);
		} catch(NullPointerException e) {
			System.out.println("Caiu na excessao");
		} 		
		System.out.println("teste");

	}

}
