package persistence;

import model.Produto;

public class TestarInsert {
	public static void main(String[] args) {
		Produto produto = new Produto(null, "Ma��", "Gala", 9.0, 100);
		ProdutoDao pdao = new ProdutoDao();
		pdao.inserir(produto);
	}	
}
