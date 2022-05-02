package exemplos;

import interfaces.Calculo;

public class ExemploSoma {

	public static void main(String[] args) {
//		Calculo calculo = new Calculo() {
//
//			@Override
//			public int operacao(int a, int b) {				
//				return a + b;
//			}
//			
//		};
		
		Calculo calculo = (a, b) -> a + b;
		
		System.out.println("O resultado da soma é: " + calculo.operacao(5, 4));

	}

}
