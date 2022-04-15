package br.org.serratec.model;

public class Vendedor extends Funcionario {
	private double comissao;
	private static double vendas;
	private double salarioTotal;

	public Vendedor(String nome, double comissao) {
		super(nome);
		this.comissao = comissao;
		vendas = 0.0;
		salarioTotal = 0.0;
	}

	public double getComissao() {
		return comissao;
	}

	public static double getVendas() {
		return vendas;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	@Override
	public String toString() {
		return super.toString() 
				+"Comissão: " + comissao + "%\n"
				+"Total vendas: R$ " + String.format("%.2f", vendas) + "\n"
				+ "Salário Total: R$" + String.format("%.2f", salarioTotal);
	}

	public void adicionarVenda(double valor) {
		vendas += valor;
	}

	@Override
	public void calcularSalario() {
		salarioTotal = salarioMinimo + vendas * comissao / 100;
	}

}
