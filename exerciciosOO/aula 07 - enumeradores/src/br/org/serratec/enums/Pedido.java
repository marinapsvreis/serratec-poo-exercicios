package br.org.serratec.enums;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
	private LocalDate dataPedido;
	private Bebida bebida;
	private Sanduiche sanduiche;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Pedido(LocalDate dataPedido, Bebida bebida, Sanduiche sanduiche) {
		this.dataPedido = dataPedido;
		this.bebida = bebida;
		this.sanduiche = sanduiche;
	}

	public LocalDate getDataPedido() {
		return dataPedido;
	}

	public Bebida getBebida() {
		return bebida;
	}

	public Sanduiche getSanduiche() {
		return sanduiche;
	}

	@Override
	public String toString() {
		return dataPedido.format(formatter) + " - " + bebida + " - " + sanduiche;
	}
	
	public static void imprimirCardapio() {
		for(Bebida bebida : Bebida.values()) {
			System.out.println("-----------------");
			System.out.println(bebida.getNome() + ":" + bebida.getPreco());
		}
		
		for(Sanduiche sanduiche : Sanduiche.values()) {
			System.out.println("-----------------");
			System.out.println(sanduiche.getTipoSanduiche() + ":" + sanduiche.getValor());
		}
	}
	
	public double calcularPedido() {
		return bebida.getPreco() + sanduiche.getValor();
	}
	
	

}
