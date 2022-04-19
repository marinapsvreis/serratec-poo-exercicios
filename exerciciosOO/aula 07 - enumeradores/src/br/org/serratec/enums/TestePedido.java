package br.org.serratec.enums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TestePedido {

	public static void main(String[] args) {
		
		Pedido.imprimirCardapio();
		
		Pedido p1 = new Pedido(LocalDate.now(), Bebida.REFRIGERANTE, Sanduiche.HOTDOG);
		Pedido p2 = new Pedido(LocalDate.now(), Bebida.SUCO, Sanduiche.MISTO);
		
		System.out.println();
		System.out.println();
		
		System.out.println(p1);
		System.out.println(p2);
		
		

	}

}
