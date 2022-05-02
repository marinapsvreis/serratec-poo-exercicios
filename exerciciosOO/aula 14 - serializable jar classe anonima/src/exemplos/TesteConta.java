package exemplos;

import interfaces.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta = () -> System.out.println("Transacao efetuada com sucesso!!");
		
		Conta conta2 = () -> System.out.println("Transacao efetuada!");
		
		conta.transacao();
		conta2.transacao();		
		
		conta.investimento();
	}

}
