package org.serratec.model;

import java.util.Scanner;

public class TesteVeiculo {

	public static void main(String[] args) {

		char resposta = 's';
		Scanner sc = new Scanner(System.in);

		do {

			Veiculo v1 = new Veiculo();
			
			System.out.println("Digite a placa do veiculo: ");
			
			v1.placa = sc.nextLine();
			System.out.println("Digite o combustivel do veiculo: ");
			v1.tipoCombustivel = sc.nextLine();
			System.out.println("Digite o valor do veiculo: ");
			v1.valor = sc.nextDouble();

			System.out.printf("O valor do IPVA �: R$ %.2f%n", v1.calcIPVA());

			System.out.print("Deseja continuar (S/s)");
			resposta = sc.next().charAt(0);
			sc.nextLine();

		} while (resposta == 'S' || resposta == 's');
		
		System.out.println("At� a pr�xima!");

		sc.close();

	}

}
