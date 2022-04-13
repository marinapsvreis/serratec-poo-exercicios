package br.org.serratec.model;

public class Caminhao extends Veiculo {
	private int cargaMaxima;
	
	public Caminhao() {
		super();
	}

	public Caminhao(String chassi, String placa, String cor, double valorIPVA, int cargaMaxima) {
		super(chassi, placa, cor, valorIPVA);
		this.cargaMaxima = cargaMaxima;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	
	@Override
	public void adicionarValorIPVA(double valor) {
		super.adicionarValorIPVA(valor*2);
	}

}
