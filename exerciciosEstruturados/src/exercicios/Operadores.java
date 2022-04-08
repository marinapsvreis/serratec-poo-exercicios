package exercicios;

public class Operadores {

	public static void main(String[] args) {
		int idade = 19;
		double altura = 1.69;
		
		// &&(AND) e !(NOT) e ||(OR)
		if(idade > 18 || altura > 1.70) {
			System.out.println("Vai participar da competição!");
		}else {
			System.out.println("Não pode participar!");
		}
	}

}
