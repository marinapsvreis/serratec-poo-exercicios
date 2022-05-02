package interfaces;

import java.util.List;

import model.Produto;

public interface ProdutoImplements extends CrudGenerics<Produto>{
	public List<Produto> buscarPorNome(String nome);	
}
