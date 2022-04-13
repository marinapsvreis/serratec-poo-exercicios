package br.org.serratec.model;

import java.util.Scanner;

public class TestarVendedor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Vendedor fixo = new Fixo("Joao", "12345678900", 1200.00, 0.05);		
		Vendedor fixo2 = new Fixo("Maria", "12345678901", 1200.00, 0.05);
		FreeLancer freela = new FreeLancer("Marina", "12365498700", 15);
		freela.setValorDia(100.00);
		freela.calcularSalario(freela.getValorDia());

		char opcao = 's';

		System.out.println("----------Sistema de Vendas----------");

		System.out.println("Vendedores:");
		System.out.println("1 - João");
		System.out.println("2 - Maria");

		do {

			System.out.print("Escolha o vendedor?");
			int vendedor = sc.nextInt();

			if (vendedor == 1) {
				System.out.print("Digite o valor da venda: ");
				double valorVenda = sc.nextDouble();

				fixo.calcularSalario(valorVenda);
			} else {
				System.out.print("Digite o valor da venda: ");
				double valorVenda = sc.nextDouble();

				fixo2.calcularSalario(valorVenda);
			}

			System.out.println("Deseja encerrar o programa (S/N)?");
			opcao = sc.next().charAt(0);

		} while (opcao == 'n' || opcao == 'N');
		
		System.out.println("---------Salario dos Vendedores-------");
		System.out.println(fixo.toString());
		System.out.println(fixo2.toString());
		System.out.println(freela.toString());
		
		System.out.println("------------Total Vendido----------");
		System.out.println("Total: " + String.format("%.2f", Vendedor.totalVendido));

		sc.close();

	}

}
