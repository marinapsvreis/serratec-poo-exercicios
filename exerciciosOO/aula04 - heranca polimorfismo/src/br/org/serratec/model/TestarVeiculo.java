package br.org.serratec.model;

public class TestarVeiculo {

	public static void main(String[] args) {
		Caminhao caminhao = new Caminhao();
		caminhao.setPlaca("123");
		caminhao.setChassi("343434343");
		caminhao.setCor("Azul");
		caminhao.setValorIPVA(5000);
		caminhao.setCargaMaxima(1000);
		caminhao.adicionarValorIPVA(500);
		
		System.out.println("O valor do IPVA: " + caminhao.getValorIPVA());

	}

}
