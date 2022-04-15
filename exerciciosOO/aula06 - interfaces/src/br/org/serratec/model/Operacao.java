package br.org.serratec.model;

public class Operacao implements Livraria{
	private TipoOperacaoEnum tipo;
	private double valorOperacao;
	private Livro livro;

	public Operacao(TipoOperacaoEnum tipo, Livro livro) {
		this.tipo = tipo;
		this.livro = livro;
		if(tipo.equals(TipoOperacaoEnum.VENDA)) {
			venderLivro();
		}else {
			emprestarLivro();
		}
	}

	public TipoOperacaoEnum getTipo() {
		return tipo;
	}

	public double getValorOperacao() {
		return valorOperacao;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	@Override
	public String toString() {
		return "Operacao: " + tipo + "\n"
				+ "Valor Operacao: " + String.format("R$ %.2f", valorOperacao) + "\n"
				+ livro + "\n";
	}

	@Override
	public void emprestarLivro() {
		valorOperacao = livro.getValor() * 0.02 + taxaEmprestimo;
		
	}

	@Override
	public void venderLivro() {
		valorOperacao = livro.getValor() * 1.09;
		
	}
	
	

}
