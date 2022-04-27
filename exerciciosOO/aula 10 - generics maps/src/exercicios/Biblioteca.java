package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private String responsavel;
	List<Livro> listaLivros = new ArrayList<>();
	List<Livro> listaLivrosPreco = new ArrayList<>();

	public Biblioteca(String responsavel) {
		this.responsavel = responsavel;
	}

	public List<Livro> getListaLivros() {
		return listaLivros;
	}

	public String mostrarListaLivros() {
		String mensagemComLista = "\n";
		for (Livro livro : listaLivros) {
			mensagemComLista += livro + "\n";
		}
		return mensagemComLista;
	}

	public void addLivro(Livro livro) {
		listaLivros.add(livro);
	}

	@Override
	public String toString() {
		return "Biblioteca: " + responsavel + mostrarListaLivros();
	}
	
	public void pesquisarFaixaDePreco(Double valorInicial, Double valorFinal) {
		listaLivrosPreco.clear();
		for(Livro livro: listaLivros) {
			if(livro.getPreco() >= valorInicial && livro.getPreco() <= valorFinal) {
				listaLivrosPreco.add(livro);
			}
		}
		for(Livro livro: listaLivrosPreco) {
			System.out.println(livro);
		}
		
	}
	
	public Double calcularTotalLivros() {
		Double valorTotal = 0.0;
		for(Livro livro: listaLivros) {
		 valorTotal += livro.getPreco();
		}
		return valorTotal;
	}

}
