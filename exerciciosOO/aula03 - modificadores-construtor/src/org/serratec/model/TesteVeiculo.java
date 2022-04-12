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

			System.out.printf("O valor do IPVA é: R$ %.2f", v1.calcIPVA());

			System.out.println("Deseja continuar (S/s)");
			resposta = sc.next().charAt(0);

		} while (resposta == 'S' || resposta == 's');

		sc.close();

	}

}
