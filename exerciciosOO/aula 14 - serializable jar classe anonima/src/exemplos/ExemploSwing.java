package exemplos;

import javax.swing.JButton;

public class ExemploSwing {

	public static void main(String[] args) {
		JButton jButton = new JButton();
		jButton.addActionListener(e -> System.out.println("A��o performada!"));
		
		System.out.println(jButton);

	}

}
