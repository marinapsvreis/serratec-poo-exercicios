package org.serratec.model;

public class Conta {
	String titular;
	int numero;
	double saldo;

	// Métodos sem retorno
	public void deposito(double valor) {
		// this.saldo += saldo; se o nome do parametro do metodo fosse igual ao atributo
		saldo += valor;
		//System.out.printf("Seu saldo atual é: %.2f%n", saldo);
	}

	public boolean saque(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		} else {
			return false;
		}

	}

}
