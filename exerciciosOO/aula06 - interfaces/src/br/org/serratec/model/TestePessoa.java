package br.org.serratec.model;

public class TestePessoa {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica("Marina", "Av. Imperador 1000", 50000.00, "123456789-00");
		PessoaJuridica pj = new PessoaJuridica("Marina Valente Tour", "Av. Imperador 1500", 100000.00,
				"25101010/0001-1", "Marina Portugal da Silva Valente dos Reis");

		TotalTributos tt = new TotalTributos();

		System.out.println(pf + "\nValor Imposto de Renda: " + String.format("R$ %.2f", pf.calculaImpostoDeRenda()));

		System.out.println();

		System.out.println(pj + "\nValor Imposto de Renda: " + String.format("R$ %.2f", pj.calculaImpostoDeRenda())
				+ "\n" + "Valor ICMS: " + String.format("R$ %.2f", pj.calcularICMS()));

		tt.totalizarTributos(pf);
		tt.totalizarTributos(pj);

		System.out.println();
		System.out.println("Total geral: " + String.format("R$ %.2f", tt.getTotal()));
	}

}
