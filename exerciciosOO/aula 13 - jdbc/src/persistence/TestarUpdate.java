package persistence;

import model.Produto;

public class TestarUpdate {

	public static void main(String[] args) {
		Produto produto = new Produto(9, "Ma��", "Argentina", 9.0, 100);
		ProdutoDao pdao = new ProdutoDao();
		pdao.atualizar(produto);

	}

}
