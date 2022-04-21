import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploArrays {

	public static void main(String[] args) {
		List lista = Arrays.asList("TV 43", "Celular", "Kindle");
		//lista.add("Aparelho de Som"); // nao funciona
		
		if(lista.isEmpty()) {
			System.out.println("Imprime quando a lista não tem elementos");
		}else {
			lista.set(1, "Iphone"); // consigo fazer atualizacoes, só não consigo inserir mais
			System.out.println(lista.get(1));
			System.out.println("O elemento da possição 1 é Kindle?" + lista.get(1).equals("Kindle"));
			System.out.println(lista.get(2));
		}
		
		Collections.sort(lista);
		System.out.println(lista);
	}

}
