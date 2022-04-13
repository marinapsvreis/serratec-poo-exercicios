package br.org.serratec.model;

public class TestarMaratona {

	public static void main(String[] args) {
		Maratona a1 = new Maratona("Marina", "Feminino", 30, 1.69);
		Maratona a2 = new AtletaAmador("Bob", "Masculino", 17, 1.79, true);
		Maratona a3 = new AtletaProfissional("Ucah", "Masculino", 27, 1.75, 80.0);

		System.out.printf("%s", a1.toString());
		a1.verificaSituacao();
		System.out.println();

		System.out.printf("%s", a2.toString());
		a2.verificaSituacao();
		System.out.println();

		System.out.printf("%s", a3.toString());
		a3.verificaSituacao();
		System.out.println();

	}

}
