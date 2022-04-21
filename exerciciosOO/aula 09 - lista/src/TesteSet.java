import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
	public static void main(String[] args) {
		//Set<String> lista = new HashSet<>();
		Set<String> lista = new TreeSet<>();
		lista.add("TV 43");
		lista.add("Celular");
		lista.add("Kindle");
		lista.add("Impressora");
		lista.add("Roteador");
		lista.add("Roteador");
		lista.add("Roteador");
		
		System.out.println(lista);
	}
}
