package br.serratec.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sorteio<T> {
	private List<T> lista;
	private Random random;
	
	public Sorteio() {
		lista = new ArrayList<>();
		random = new Random();
	}
	
	public void adicionar(T elemento) {
		lista.add(elemento);
	}
	
	public void rmeover(T elemento) {
		lista.remove(elemento);
	}
	
	public T sortear() {
		int pos = random.nextInt(lista.size());
		return lista.get(pos);
	}
}
