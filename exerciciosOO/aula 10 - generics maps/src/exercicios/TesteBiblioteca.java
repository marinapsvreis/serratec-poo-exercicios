package exercicios;

public class TesteBiblioteca {

	public static void main(String[] args) {
		Biblioteca b1 = new Biblioteca("Marina");
		
		Livro l1 = new Livro("Titulo 1", "Autor 1" , 50.00);
		Livro l2 = new Livro("Titulo 2", "Autor 2" , 100.00);
		Livro l3 = new Livro("Titulo 3", "Autor 3" , 25.00);
		
		b1.addLivro(l1);
		b1.addLivro(l2);
		b1.addLivro(l3);
		
		System.out.println(b1);
		
		System.out.println("Pesquisa de livro entre R$90,00 e R$120,00: ");		
		b1.pesquisarFaixaDePreco(90.00, 120.00);
		
		System.out.println();
		System.out.println("O valor total dos livros da biblioteca é: " + String.format("R$ %.2f",  b1.calcularTotalLivros()));

	}

}
