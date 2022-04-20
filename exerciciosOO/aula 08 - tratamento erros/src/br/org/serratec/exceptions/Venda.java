package br.org.serratec.exceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda {
	private LocalDate dataCompra;
	List<Produto_Venda> listaProdutos = new ArrayList<>();
	private double totalVenda;

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Venda(LocalDate dataCompra) {
		this.dataCompra = dataCompra;
	}

	public LocalDate getDataCompra() {
		return dataCompra;
	}

	public double getTotalVenda() {
		return totalVenda;
	}

	public void addProduto(Produto produto, int quantidade) {
		Produto_Venda pv = new Produto_Venda(quantidade*produto.getValor(), produto, this);
		produto.venderItem(quantidade);
		listaProdutos.add(pv);		
		calcularVenda(produto.getValor(), quantidade);
	}

	public void calcularVenda(double valor, int quantidade) {
		totalVenda += valor*quantidade;
	}

	public String mostrarVenda() {
		String produtos = "";
		
		for (Produto_Venda produto : listaProdutos) {
			produtos += produto;
		}

		return "Data Pedido: " + dataCompra.format(formatter) + "\n"
				+ "-----------------------------------\n"
				+ "Total por item:\n"
				+ produtos
				+ "-----------------------------------\n" 
				+ "Total Geral Venda: "
				+ String.format("R$ %.2f", totalVenda);
	}

}
