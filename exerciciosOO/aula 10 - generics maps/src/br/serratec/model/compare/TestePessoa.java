package br.serratec.model.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Adriana", "12345678900", 45);
		Pessoa p2 = new Pessoa("Marcos", "12345678901", 25);
		Pessoa p3 = new Pessoa("Joaquim", "12345678902", 19);
		
		List<Pessoa> pessoas = new ArrayList();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		//System.out.println(pessoas);
		
		for(Pessoa p : pessoas) {
			System.out.println(p);
		}
	}

}
