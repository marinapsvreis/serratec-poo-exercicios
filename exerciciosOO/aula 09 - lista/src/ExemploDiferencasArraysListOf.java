import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploDiferencasArraysListOf {

	public static void main(String[] args) {
		String[] carros = {"Gol", "Fusca", "Fiesta"};
		
		carros[2] = "Ka";
		
		List listaCarros = Arrays.asList(carros);
		
		listaCarros.set(1, "Fox");
		
		List listaCarros2 = new ArrayList<>(listaCarros);
		//listaCarros2.addAll(listaCarros);
		
		for(Object item : listaCarros2) {
			System.out.println(item);
		}
		
		System.out.println("--------------------------");
		
		String[] cores = {"Vermelho", "Azul", "Amarelo"};
		
		List listaCores = List.of(cores);
		cores[0] = "Preto";
		
		System.out.println(listaCores);
		
		System.out.println("--------------------------");

	}

}
