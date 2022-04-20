package br.org.serratec.exceptions;

import java.util.ArrayList;
import java.util.List;

public class Produto {
	private int codigo;
	private String descricao;
	private double valor;
	private int quantidadeEstoque;
	private Categoria categoria;
	private static List<Produto> listaProdutos = new ArrayList<>();

	public Produto(int codigo, String descricao, double valor, int quantidadeEstoque, Categoria categoria) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.valor = valor;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
		listaProdutos.add(this);
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValor() {
		return valor;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public Categoria getCategoria() {
		return categoria;
	}
	
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	@Override
	public String toString() {
		return descricao;
	}
	
	public void venderItem(int quantidade) {
		quantidadeEstoque -= quantidade;
	}
	
	public void incluirItem(int quantidade) {
		quantidadeEstoque += quantidade;
	}

}
