package br.org.serratec.exceptions;

import java.time.LocalDate;

public class TesteVenda {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Celular", 1500.00, 3, Categoria.ELETRONICO);
		Produto p2 = new Produto(2, "Carro", 20000.00, 1, Categoria.AUTOMOTIVO);
		Produto p3 = new Produto(3, "Remedio", 50.00, 3, Categoria.FARMACEUTICO);
		Produto p4 = new Produto(4, "Camisa", 30.00, 10, Categoria.ROUPAS);

		System.out.println("Imprimindo lista de produtos cadastrados: ");
		for (Produto produto : Produto.getListaProdutos()) {
			System.out.println(produto + " - (" + produto.getQuantidadeEstoque() + ")");
		}
		System.out.println();

		Venda v1 = new Venda(LocalDate.now());
		v1.addProduto(p1, 2);
		v1.addProduto(p3, 3);
		Venda v2 = new Venda(LocalDate.now());
		v2.addProduto(p1, 1);
		v2.addProduto(p2, 1);

		System.out.println(v1.mostrarVenda());
		System.out.println();
		System.out.println();
		System.out.println(v2.mostrarVenda());

		System.out.println();

		System.out.println("Imprimindo lista de produtos com quantidade estoque atualizada: ");
		for (Produto produto : Produto.getListaProdutos()) {
			System.out.println(produto + " - (" + produto.getQuantidadeEstoque() + ")");
		}
		System.out.println();

		p1.incluirItem(5);
		p2.incluirItem(5);
		p3.incluirItem(5);

		System.out.println(
				"Imprimindo lista de produtos com quantidade estoque atualizada depois de adicionar mais quantidade: ");
		for (Produto produto : Produto.getListaProdutos()) {
			System.out.println(produto + " - (" + produto.getQuantidadeEstoque() + ")");
		}

	}

}
