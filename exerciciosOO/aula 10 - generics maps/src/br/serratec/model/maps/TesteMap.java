package br.serratec.model.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TesteMap {

	public static void main(String[] args) {
		Map<String, String> mapaEstados = new HashMap<>();
		mapaEstados.put("RJ", "Rio de Janeiro");
		mapaEstados.put("SP", "São Paulo");
		mapaEstados.put("MG", "Minas Gerais");
		mapaEstados.put("SC", "Santa Catarina");
		mapaEstados.put("SC", "Santa Catarina");
		
		for(String sigla : mapaEstados.keySet()) {
			System.out.println(sigla);
		}
		
		for(String nome : mapaEstados.values()) {
			System.out.println(nome);
		}
		
		for(Entry<String, String> nome : mapaEstados.entrySet()) {
			System.out.println(nome);
		}
		
		for(Map.Entry<String, String> dados : mapaEstados.entrySet()) {
			//System.out.println(nome);
			System.out.println(dados.getKey() + "---" + dados.getValue());
		}
		
		TreeMap<String, String> mapaOrdenados = new TreeMap<>();
		System.out.println("-------------------------------");
		System.out.println(mapaOrdenados.descendingMap()); //ordena ao contrario
		System.out.println(mapaOrdenados);
	}

}
