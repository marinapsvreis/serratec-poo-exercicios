package br.org.serratec.model;

public class TestarLivraria {

	public static void main(String[] args) {
		Livro l1 = new Livro("Autor 1", "Titulo 1", 50.00);
		Livro l2 = new Livro("Autor 2", "Titulo 2", 75.00);
		Operacao o1 = new Operacao(TipoOperacaoEnum.VENDA, l1);
		Operacao o2 = new Operacao(TipoOperacaoEnum.ALUGUEL, l2);
		
		System.out.println(o1);
		System.out.println(o2);
	}

}
