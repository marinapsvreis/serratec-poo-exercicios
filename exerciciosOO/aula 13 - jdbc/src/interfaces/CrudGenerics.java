package interfaces;

import java.util.List;

public interface CrudGenerics <T> {
	public List<T> listar();
	public T buscar(int codigo);
	public void remover(int codigo);
	public void inserir(T t);
	public void atualizar(T t);
}
