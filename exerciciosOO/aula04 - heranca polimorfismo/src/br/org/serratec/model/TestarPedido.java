package br.org.serratec.model;

import java.time.LocalDate;

public class TestarPedido {

	public static void main(String[] args) {
		Pedido p1 = new Pedido(123, LocalDate.of(2022, 04, 12), 4, 12.0);
		Pedido p2 = new Pedido(321, LocalDate.of(2022, 04, 17), 2, 10.0);
		Pedido p3 = new Pedido(567, LocalDate.now(), 3, 100.0);

		System.out.println(p1.finalizarPedido());
		System.out.println(p2.finalizarPedido());
		System.out.println(p3.finalizarPedido());
		
		System.out.println(p1.getDataDoPedido());
		System.out.println(p2.getDataDoPedido());
		System.out.println(p3.getDataDoPedido());
		
		System.out.println("Total geral do pedido: " + String.format("%.2f", Pedido.getTotalPedidos()));

	}

}
