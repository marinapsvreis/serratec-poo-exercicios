package br.serratec.model.maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExemploLinkedHash {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> cursos = new LinkedHashMap<>();
		cursos.put(1, "PHP");
		cursos.put(2, "API REST");
		cursos.put(3, "Redes");
		
		for(Map.Entry<Integer, String> dadosCurso : cursos.entrySet()) {
			System.out.println(dadosCurso);
		}

	}

}
