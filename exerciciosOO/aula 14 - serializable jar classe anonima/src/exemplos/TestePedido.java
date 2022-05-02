package exemplos;

import java.util.ArrayList;
import java.util.List;

import model.Pedido;

public class TestePedido {

	public static void main(String[] args) {
		Pedido p1 = new Pedido();
		p1.finalizarPedido();
		
		System.out.println("-------------------------");
		System.out.println("-----Classe Anônima------");
		Pedido p2 = new Pedido() {
			@Override
			public void finalizarPedido() {
				System.out.println("Pedido encerrado!");
			}
			
		};
		
		p2.finalizarPedido();
		
		List<Pedido> lista = new ArrayList<>(); 

	}

}
