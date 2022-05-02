package persistence;

import model.Produto;

public class TestarListar {

	public static void main(String[] args) {
		ProdutoDao pdao = new ProdutoDao();
		
		for(Produto produto : pdao.listar()) {
			System.out.println(produto);
		}

	}

}
