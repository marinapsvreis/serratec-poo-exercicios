package br.org.serratec.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite um número inteiro: ");
			int numero = sc.nextInt();
			
			System.out.println(numero);
		} catch (InputMismatchException e) {
			System.out.println("Falha ao ler número!");
		} catch (Exception e) {
			System.out.println("Falha não prevista!");
			e.printStackTrace();
		}

		sc.close();

	}

}
