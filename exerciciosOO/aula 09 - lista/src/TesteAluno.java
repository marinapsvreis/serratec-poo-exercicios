import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class TesteAluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Aluno> listaAlunos = new ArrayList<>();

		System.out.print("Quantos alunos você deseja cadastrar as notas e calcular a média?");
		int n = sc.nextInt();

		try {

			for (int i = 1; i <= n; i++) {
				System.out.println();
				System.out.print("Digite o nome do aluno(a) " + i + ": ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Digite a primeira nota do(a)" + nome + ": ");
				double nota1 = sc.nextDouble();
				if(nota1 < 0.0 || nota1 > 10.0) {
					throw new InputMismatchException("A nota deverá estar entre 0 e 10.");
				}
//				while(nota1 < 0.0 || nota1 > 10.0) {
//					System.out.print("Digite a primeira nota do(a)" + nome + ": ");
//					nota1 = sc.nextDouble();
//				}
				System.out.print("Digite a segunda nota do(a)" + nome + ": ");
				double nota2 = sc.nextDouble();
				if(nota2 < 0.0 || nota2 > 10.0) {
					throw new InputMismatchException("A nota deverá estar entre 0 e 10.");
				}
//				while(nota2 < 0.0 || nota2 > 10.0) {
//					System.out.print("Digite a segunda nota do(a)" + nome + ": ");
//					nota2 = sc.nextDouble();
//				}

				listaAlunos.add(new Aluno(nome, nota1, nota2));
			}

		} catch (InputMismatchException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Até a próxima!");
		}

		for (Aluno a : listaAlunos) {
			System.out.println("A média do Aluno(a) " + a.getNome() + " foi " + a.calcMedia());
		}

		sc.close();

	}

}
