package org.serratec.model;

import java.util.Scanner;

public class LendoDados {

	public static void main(String[] args) {
		
		int a, b;
		
		//Instanciando o leitor
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		a = sc.nextInt();
		
		System.out.print("Digite o segundo valor: ");
		b = sc.nextInt();
		
		System.out.println();
		
		System.out.printf("A soma de %d e %d é igual a: %d%n", a, b, (a+b));
		System.out.printf("A subtração de %d e %d é igual a: %d%n", a, b, (a-b));
		System.out.printf("A multiplicação de %d e %d é igual a: %d%n", a, b, (a*b));
		System.out.printf("A divisão de %d e %d é igual a: %d com resto %d %n", a, b, (a/b), (a%b));
		
		
		//Encerrando o leitor
		sc.close();

	}

}
