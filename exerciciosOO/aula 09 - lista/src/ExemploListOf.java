import java.util.List;

public class ExemploListOf {

	public static void main(String[] args) {
		List lista = List.of("TV 43", "Kindle", "Celular");
		
		//n�o deixa (restri��es)
		//lista.add
		//lista.remove
		//lista.set
		
		for(Object item : lista) {
			System.out.println(item);
		}
	}

}
