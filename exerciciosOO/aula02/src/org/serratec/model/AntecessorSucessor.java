package org.serratec.model;

import java.util.Scanner;

public class AntecessorSucessor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int numero = sc.nextInt();
		System.out.printf("O n�mero que voc� digitou � o %d.%nSeu antecessor � o %d.%nSeu sucessor � o %d.", numero, (numero-1), (numero+1));
		
		sc.close();

	}

}
