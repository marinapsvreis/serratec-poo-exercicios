package exemplos;

import javax.swing.JButton;

public class ExemploSwing {

	public static void main(String[] args) {
		JButton jButton = new JButton();
		jButton.addActionListener(e -> System.out.println("Ação performada!"));
		
		System.out.println(jButton);

	}

}
