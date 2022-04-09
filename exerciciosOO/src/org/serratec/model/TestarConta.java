package org.serratec.model;

public class TestarConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.titular = "Marina";
		conta.saldo = 0.0;
		conta.numero = 10;
		
		System.out.printf("Status atual da conta da %s número %d: R$ %.2f%n", conta.titular, conta.numero, conta.saldo);
		
		conta.deposito(100.00);
		
		System.out.printf("Saldo atualizado: R$ %.2f%n", conta.saldo);
		
		//Sacando 50		
		if(conta.saque(50.00)) {
			System.out.printf("Saldo atualizado: R$ %.2f%n", conta.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		//Tentando sacar 100
		if(conta.saque(100.00)) {
			System.out.printf("Saldo atualizado: R$ %.2f%n", conta.saldo);
		}else {
			System.out.println("Saldo insuficiente");
		}

	}

}
