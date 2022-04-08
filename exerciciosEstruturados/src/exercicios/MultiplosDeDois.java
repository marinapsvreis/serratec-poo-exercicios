package exercicios;

public class MultiplosDeDois {

	public static void main(String[] args) {
		int pares = 0;
		
		for(int i = 0; i <= 22; i++) {
			if(i%2 == 0) {
				System.out.printf("Java %d%n", i);
				pares++;
			}
		}
		
		System.out.printf("O periodo entre 1 e 22 possui %d multiplos de 2.", pares);

	}

}
