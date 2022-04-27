package br.serratec.model;

import java.util.Collection;
import java.util.Locale;

public class TesteMyGenerics {

	public static void main(String[] args) {
		
//		MyGenerics<Integer> myg1 = new MyGenerics<Integer>(100);
//		MyGenerics<String> myg2 = new MyGenerics<String>("Hello World");
//		
//		System.out.println(myg1);
//		System.out.println(myg2);
		
		MyGenerics<? super Number> myg = new MyGenerics(1000);
		myg.setValor(10.00);
		
		System.out.println(myg);
	}

}
