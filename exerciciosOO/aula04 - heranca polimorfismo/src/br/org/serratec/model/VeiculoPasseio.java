package br.org.serratec.model;

public class VeiculoPasseio extends Veiculo {
	private int quantidadePortas;

	public VeiculoPasseio(String chassi, String placa, String cor, double valorIPVA, int quantidadePortas) {
		super(chassi, placa, cor, valorIPVA);
		this.quantidadePortas = quantidadePortas;
	}

	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

}
