package interfaces;

public class ContaCorrente implements Conta {

	@Override
	public void transacao() {
		System.out.println("Transacao conta corrente!");

	}

	@Override
	public void investimento() {
		System.out.println("Investimento conta corrente!");
	}
	

	public static void main(String[] args) {
		Conta conta = new ContaCorrente();
		conta.investimento();

	}

}
