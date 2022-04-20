package br.org.serratec.exceptions;

public class Produto_Venda {
	private double totalPorProduto;
	private Produto produto;
	private Venda venda;

	public Produto_Venda(double totalPorProduto, Produto produto, Venda venda) {
		this.totalPorProduto = totalPorProduto;
		this.produto = produto;
		this.venda = venda;
	}

	public double getTotalPorProduto() {
		return totalPorProduto;
	}

	public Produto getProduto() {
		return produto;
	}

	public Venda getVenda() {
		return venda;
	}

	@Override
	public String toString() {
		return produto + " - " + String.format("R$%.2f", totalPorProduto) + "\n";
	}
	
	

}
