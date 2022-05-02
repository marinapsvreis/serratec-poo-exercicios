package model;

import java.time.LocalDate;

public class Produto{
	private Integer codigo;
	private String nome;
	private Double preco;
	private Integer quantidadeEstoque;
	private LocalDate dataCadastro;

	public Produto(Integer codigo, String nome, Double preco, Integer quantidadeEstoque, LocalDate dataCadastro) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
		this.dataCadastro = dataCadastro;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	@Override
	public String toString() {
		return "Produto [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + ", quantidadeEstoque="
				+ quantidadeEstoque + ", dataCadastro=" + dataCadastro + "]";
	}


}
