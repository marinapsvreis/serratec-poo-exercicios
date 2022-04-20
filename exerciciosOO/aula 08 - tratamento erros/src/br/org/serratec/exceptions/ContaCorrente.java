package br.org.serratec.exceptions;

public class ContaCorrente implements Conta {

	private String numeroConta;
	private String titularConta;
	private double saldo;

	public ContaCorrente(String numeroConta, String titularConta, double saldo) {
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean saque(double valor) {
		if (valor > saldo) {
			throw new ContaException("Saldo insuficiente");
		} else {
			saldo -= valor;
			System.out.println("Saldo atualizado após saque: " + String.format("R$ %.2f", saldo));
			return true;
		}

	}

	@Override
	public boolean deposito(double valor) {
		if(valor > 1000.00) {
			throw new ContaException("Deposito acima de 1000 reais não permitido");
		}
		saldo += valor;
		System.out.println("Saldo atualizado após deposito: " + String.format("R$ %.2f", saldo));
		return true;
	}

}
