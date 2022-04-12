package org.serratec.model;

import java.util.Scanner;

public class TesteProduto {

	public static void main(String[] args) {
		Produto produto = new Produto(01, "TV", 500.00);
		Produto produto2 = new Produto(02, "Celular", 2500.00);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("%d, %s, R$ %.2f", produto2.getCodigo(), produto2.getDescricao(), produto2.getValor());
		
		sc.close();

	}

}
