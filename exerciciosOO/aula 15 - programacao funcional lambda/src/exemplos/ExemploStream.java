package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Aluno;

public class ExemploStream {

	public static void main(String[] args) {
		List<String> cores = Arrays.asList("Preto", "Amarelo", "Vermelho", "Verde", "Azul");
		Stream<String> streamCores = cores.stream();
		streamCores.forEach(c -> System.out.println(c));
		
		System.out.println();
		
		Aluno a1 = new Aluno(1, "Roni", "roni@gmail.com", 46);
		Aluno a2 = new Aluno(2, "Marcos", "marcos@gmail.com", 32);
		Aluno a3 = new Aluno(3, "Silvana", "silvana@gmail.com", 18);
		Aluno a4 = new Aluno(4, "Thais", "thais@gmail.com", 55);
		Aluno a5 = new Aluno(5, "Marcelo", "marcelo@gmail.com", 23);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		Stream<Aluno> streamAlunos = alunos.stream();
		List<String> nomes = streamAlunos.map(x -> x.getNome().substring(0, 3)).collect(Collectors.toList());
		nomes.forEach(System.out::println);
	}

}
