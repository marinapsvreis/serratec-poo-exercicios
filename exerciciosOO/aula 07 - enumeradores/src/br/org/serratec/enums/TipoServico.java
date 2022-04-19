package br.org.serratec.enums;

public enum TipoServico {
	OLEO("Trocar �leo", 100.00), LAVAGEM("Lavar veiculo", 50.00), REVISAO("Revisar mec�nica", 200.00);

	private String descricao;
	private double valorPorServico;

	private TipoServico(String descricao, double valorPorServico) {
		this.descricao = descricao;
		this.valorPorServico = valorPorServico;
	}

	public String getDescricao() {
		return descricao;
	}

	public double getValorPorServico() {
		return valorPorServico;
	}

}
