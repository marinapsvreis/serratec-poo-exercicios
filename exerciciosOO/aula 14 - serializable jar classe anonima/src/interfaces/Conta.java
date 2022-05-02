package interfaces;

@FunctionalInterface
public interface Conta {
	public void transacao();
	
	default void investimento() {
		System.out.println("Fiz um investimento!");
	}
	
}
