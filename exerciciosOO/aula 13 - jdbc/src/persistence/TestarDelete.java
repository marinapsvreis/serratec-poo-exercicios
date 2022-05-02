package persistence;

public class TestarDelete {

	public static void main(String[] args) {
		
		ProdutoDao pdao = new ProdutoDao();
		pdao.remover(9);

	}

}
