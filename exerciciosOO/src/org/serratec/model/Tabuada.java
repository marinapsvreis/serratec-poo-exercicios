package org.serratec.model;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o número da tabuada que deseja exibir:");
		int numero = sc.nextInt();
		
		System.out.println();

		if (numero >= 10) {
			System.out.println("+---Resultado----+");
		} else {
			System.out.println("+---Resultado---+");
		}

		for (int i = 0; i <= 10; i++) {
			if (i * numero < 10) {
				System.out.printf("|  %d *  %d =   %d |%n", numero, i, (i * numero));
			} else if (i * numero >= 100) {
				System.out.printf("|  %d * %d = %d |%n", numero, i, (i * numero));
			} else if (i == 10) {
				System.out.printf("|  %d * %d =  %d |%n", numero, i, (i * numero));
			} else {
				System.out.printf("|  %d *  %d =  %d |%n", numero, i, (i * numero));
			}

		}

		if (numero >= 10) {
			System.out.println("+----------------+");
		} else {
			System.out.println("+---------------+");
		}

		sc.close();

	}

}
