package br.org.serratec.exceptions;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("5239-6", "Marina", 1000.00);

		try {
			cc.deposito(300.00);
			cc.saque(1200.00);
			cc.deposito(1001.00);

		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Fim!");
		}

	}

}
