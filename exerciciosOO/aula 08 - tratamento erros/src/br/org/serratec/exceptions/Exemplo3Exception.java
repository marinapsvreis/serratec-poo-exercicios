package br.org.serratec.exceptions;

public class Exemplo3Exception {

	public static void main(String[] args) {
		int vetor[] = {10,30,60};
		int a = 30, b = 0, c = 0;
		String nome = null;
		
		try {
			//c=a/b;
			//System.out.println("Vetor posicao 3:" + vetor[3]);
			nome = nome.toUpperCase();
					
		} catch (ArithmeticException e) {
			System.out.println("Erro de aritimética!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indice maior que o tamanho do vetor!");
		} catch (NullPointerException e) {
			System.out.println("Erro de atributo nulo");
		}
		
		System.out.println("Teste");

	}

}
