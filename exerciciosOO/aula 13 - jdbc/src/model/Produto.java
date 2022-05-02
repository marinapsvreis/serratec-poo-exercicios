package model;

public class Produto {
	private Integer codigo;
	private String nome;
	private String descricao;
	private Double preco;
	private Integer quantidadeEstoque;
	
	public Produto(Integer codigo, String nome, String descricao, Double preco, Integer quantidadeEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public Integer getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	@Override
	public String toString() {
		return codigo + " - " + nome + " - " + descricao + " - " + preco
				+ " - " + quantidadeEstoque;
	}
	
}
