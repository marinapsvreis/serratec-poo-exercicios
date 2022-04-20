package br.org.serratec.exceptions;

public interface Conta {
	public boolean saque(double valor);
	public boolean deposito(double valor);
}
