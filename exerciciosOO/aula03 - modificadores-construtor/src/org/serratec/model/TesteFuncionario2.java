package org.serratec.model;

import java.util.Scanner;

public class TesteFuncionario2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char opcao = 's';

		do {

			System.out.println("Digite a descrição do produto: ");
			String descricao = sc.nextLine();
			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();
			System.out.println("Digite a quantidade do produto: ");
			int quantidade = sc.nextInt();

			Produto2 p = new Produto2(descricao, valor, quantidade);

			double valorTotal = p.getQuantidade() * p.getValor();

			System.out.printf("Descrição: %s%nValor: %.2f%nTotal Valor: %.2f%nICMS: %.2f%n", 
					p.getDescricao(),
					p.getValor(), 
					valorTotal, 
					p.calcIcms());

			System.out.println("Deseja encerrar o programa? (S/N)");
			opcao = sc.next().charAt(0);
			
			sc.nextLine();

		} while (opcao == 'n' || opcao == 'N');
		
		System.out.println("Até a próxima!");

		sc.close();

	}

}
