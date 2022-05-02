package exemplos;

import java.util.Arrays;
import java.util.List;

import model.Aluno;

public class ExemploFilter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Roni", "roni@gmail.com", 46);
		Aluno a2 = new Aluno(2, "Marcos", "marcos@gmail.com", 32);
		Aluno a3 = new Aluno(3, "Silvana", "silvana@gmail.com", 18);
		Aluno a4 = new Aluno(4, "Thais", "thais@gmail.com", 55);
		Aluno a5 = new Aluno(5, "Marcelo", "marcelo@gmail.com", 23);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);
		
		alunos.stream().filter(a -> a.getIdade() > 30).forEach(System.out::println);
		System.out.println();
		alunos.stream().filter(a -> a.getNome().startsWith("M")).forEach(System.out::println);
		System.out.println();
		alunos.stream().filter(a -> a.getNome().contains("ar")).forEach(System.out::println);
		System.out.println();
		alunos.stream().skip(1).forEach(x -> System.out.println(x));
		System.out.println();
		alunos.stream().limit(3).forEach(System.out::println);

	}

}
