import java.util.ArrayList;
import java.util.List;

public class ExemploListas {

	public static void main(String[] args) {

		List lista = new ArrayList<>();
		lista.add("Celular");
		lista.add("TV 42");
		lista.add("Kindle");
		System.out.println(lista);
		System.out.println(lista.size());
		System.out.println(lista.contains("Celular"));
		System.out.println(lista.remove(2));
		System.out.println(lista.get(1));
		lista.set(1, "TV 43");

		for (Object item : lista) {
			System.out.println(item);
		}

	}

}
