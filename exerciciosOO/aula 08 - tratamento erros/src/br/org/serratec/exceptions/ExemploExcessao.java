package br.org.serratec.exceptions;

import java.util.Scanner;

public class ExemploExcessao {
	
	public static int divisao(int i, int j) {
		if(j==0) {
			throw new ArithmeticException("Digite um divisor diferente de 0");
		}
		return i/j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Digite um numero: ");
			int n1 = sc.nextInt();
			System.out.println("Digite outro numero: ");
			int n2 = sc.nextInt();
			
			System.out.println("O resultado da divisão é: " + divisao(n1, n2));
		}catch(ArithmeticException e) {
			System.out.println("Erro: " + e.getMessage());
		}
				
		
		
		sc.close();

	}

}
