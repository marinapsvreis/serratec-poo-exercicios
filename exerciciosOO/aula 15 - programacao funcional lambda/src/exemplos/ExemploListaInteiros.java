package exemplos;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExemploListaInteiros {

	public static void main(String[] args) {
		List<Integer> listaInteiros = Arrays.asList(1, 2, 3, 4, 5);
		
		//imprimindo a lista toda multiplicada por 2
		listaInteiros.stream().map(a -> a*2).forEach(System.out::println);
		
		System.out.println();
		
		//lista com string passando para double
		List<String> numeros2 = Arrays.asList("90.0", "10.5", "30.5", "40.5", "32.5");
		List<Double> numeros2Double = numeros2.stream().map(n -> new Double(n)).collect(Collectors.toList());
		numeros2Double.forEach(System.out::println);
		
		//usando parseDouble
		System.out.println();
		List<Double> nums2Double = numeros2.stream().mapToDouble(n -> Double.parseDouble(n)).boxed().collect(Collectors.toList());
		numeros2Double.forEach(System.out::println);
	}

}
