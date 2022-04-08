package exercicios;

public class contarParesImpares {

	public static void main(String[] args) {
		int pares = 0;
		int impares = 0;
		
		for(int i = 0; i <= 30; i++) {
			if(i%2 == 0) {
				pares++;
			}else {
				impares++;
			}
		}
		
		System.out.printf("O periodo entre 1 e 30 possui %d pares e %d impares.", pares, impares);

	}

}
