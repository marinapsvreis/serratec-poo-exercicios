package exemplos;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import model.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		Produto p1 = new Produto(1, "Arroz", 10.00, 50, LocalDate.of(2022, 04, 01));
		Produto p2 = new Produto(2, "Farinha de Trigo", 5.00, 100, LocalDate.of(2022, 04, 02));
		Produto p3 = new Produto(3, "Macarrão", 7.00, 20, LocalDate.of(2022, 03, 01));
		Produto p4 = new Produto(4, "Feijão", 12.00, 120, LocalDate.of(2022, 05, 10));
		Produto p5 = new Produto(5, "Sal", 4.00, 30, LocalDate.of(2022, 01, 15));
		Produto p6 = new Produto(6, "Arroz Integral", 10.00, 50, LocalDate.of(2021, 11, 05));
		
		//Forma tradicional
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5, p6);
//		Collections.sort(produtos);
//		produtos.forEach(System.out::println);
		
		//produtos.stream().sorted().forEach(System.out::println);
		
		//ordem crescente quantidade estoque
		Comparator<Produto> compareQuantidade = (a, b) -> a.getQuantidadeEstoque().compareTo(b.getQuantidadeEstoque());
		Collections.sort(produtos, compareQuantidade);
		produtos.forEach(System.out::println);
		
		System.out.println();
		
		//ordem decrescente quantidade estoque
		Comparator<Produto> compareQuantidadeDecrescente = (a, b) -> b.getQuantidadeEstoque().compareTo(a.getQuantidadeEstoque());
		Collections.sort(produtos, compareQuantidadeDecrescente);
		produtos.forEach(System.out::println);
		
		System.out.println();
		
		//ordem crescente por nome
		Comparator<Produto> compareNome = (a, b) -> a.getNome().compareTo(b.getNome());
		Collections.sort(produtos, compareNome);
		produtos.forEach(System.out::println);
		
		System.out.println();
		
		//Outra forma (ordenando pelo nome do produto)
		produtos.sort((a,b)-> a.getNome().compareTo(b.getNome()));
		produtos.forEach(System.out::println);
		
		System.out.println();
		
		//Aplicando filter com contains
		produtos.stream().distinct().filter(p -> p.getNome().contains("Arroz")).forEach(System.out::println);

	}

}
