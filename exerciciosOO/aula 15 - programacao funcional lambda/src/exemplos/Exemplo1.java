package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import model.Aluno;
import model.ExibeDados;

public class Exemplo1 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno(1, "Roni", "roni@gmail.com", 46);
		Aluno a2 = new Aluno(2, "Marcos", "marcos@gmail.com", 32);
		Aluno a3 = new Aluno(3, "Silvana", "silvana@gmail.com", 18);
		Aluno a4 = new Aluno(4, "Thais", "thais@gmail.com", 55);
		Aluno a5 = new Aluno(5, "Marcelo", "marcelo@gmail.com", 23);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		// alunos.forEach(a -> System.out.println(a));

//		ExibeDados exibeDados = new ExibeDados();
//		alunos.forEach(exibeDados);

//		Consumer<Aluno> cAluno = new Consumer<Aluno>() {
//			@Override
//			public void accept(Aluno t) {
//				System.out.println(t);
//
//			}
//
//		};
//
//		alunos.forEach(cAluno);
		
//		alunos.forEach(a ->{
//			System.out.println(a);
//		});
		
//		System.out.println("Imprimindo com Method Reference!");
//		alunos.forEach(System.out::println);
		
		List<String> listEletronicos = Arrays.asList("TV", "Controle", "Computador", "Celular", "Calculadora");

        listEletronicos.forEach(System.out::println); //method reference
        listEletronicos.forEach(e -> System.out.println(e)); //lambda

	}

}
