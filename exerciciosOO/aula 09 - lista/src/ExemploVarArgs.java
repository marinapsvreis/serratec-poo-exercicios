import java.util.Iterator;

public class ExemploVarArgs {

	public static void main(String[] args) {
		int total = calculaSoma(10, 100, 200, 300, 400, 500);
		System.out.println("Total: " + total);
	}
	
	private static int calculaSoma(int... numeros) {
		int soma = 0;
		
		for (int valor : numeros) {
			soma += valor;
		}
		
		return soma;
	}

}
