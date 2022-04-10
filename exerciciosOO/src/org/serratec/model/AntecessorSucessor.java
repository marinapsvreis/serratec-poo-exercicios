package org.serratec.model;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		System.out.printf("O número que você digitou é o %d.%nSeu antecessor é o %d.%nSeu sucessor é o %d.", numero, (numero-1), (numero+1));
		
		sc.close();

	}

}
