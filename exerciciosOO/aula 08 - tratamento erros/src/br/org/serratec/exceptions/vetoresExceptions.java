package br.org.serratec.exceptions;

public class vetoresExceptions {

	public static void main(String[] args) {
		int[] numerador = { 1, 2, 3, 4, 5 };
		//int[] denominador = {3, 0, 2};
		//int[] denominador = {3, 2, 2};
		int[] denominador = {3, 1, 2, 4, 5};

		try {
			for (int i = 0; i < numerador.length; i++) {
				System.out.println(
						"Dividindo: " + numerador[i] + "/" + denominador[i] + " = " + (numerador[i] / denominador[i]));
			}

		} catch (ArithmeticException e) {
			System.out.println("Erro divisão por 0 ou de aritimética!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Indice de vetor maior que o tamanho do vetor!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
