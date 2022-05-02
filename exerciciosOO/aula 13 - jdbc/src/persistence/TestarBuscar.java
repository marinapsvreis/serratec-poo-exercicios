package persistence;

import model.Produto;

public class TestarBuscar {

	public static void main(String[] args) {
		ProdutoDao pdao = new ProdutoDao();
		
		//System.out.println(pdao.buscar(1));
		
		for(Produto produto : pdao.buscarPorNome("Sal")) {
			System.out.println(produto);
		}

	}

}
