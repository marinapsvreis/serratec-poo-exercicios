package org.serratec.model;

import javax.swing.JOptionPane;

public class TesteCadastroFuncionario {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Escreva o nome do funcionário: ");
		String telefone = JOptionPane.showInputDialog("Escreva o telefone do funcionário: ");
		String email = JOptionPane.showInputDialog("Escreva o email do funcionário: ");
		String salarioString = JOptionPane.showInputDialog("Escreva o salário do funcionário: ");
		Double salarioDouble = Double.parseDouble(salarioString);

		CadastroFuncionario cf = new CadastroFuncionario(nome, telefone, email, salarioDouble);

		cf.aumentarSalario();

		String funcionario = "Nome funcionario: " + cf.nome + "\nTelefone: " + cf.telefone + "\nEmail: " + cf.email
				+ "\nSalário com 10% de aumento: " + String.format("%.2f", cf.salario);

		JOptionPane.showMessageDialog(null, funcionario);

	}

}
