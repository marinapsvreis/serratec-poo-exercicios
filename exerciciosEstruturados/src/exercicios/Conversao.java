package exercicios;

public class Conversao {

	public static void main(String[] args) {
		int a = 100;
		float b = 2.1f;
		int d = 5;
		double c = 4.25;
		b = a;
		
		//casting
		d = (int) c;
		b = (float) c;
		
		System.out.printf("%d %.2f", d, b);

	}

}
