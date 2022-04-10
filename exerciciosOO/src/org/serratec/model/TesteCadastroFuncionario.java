package org.serratec.model;

import javax.swing.JOptionPane;

public class TesteCadastroFuncionario {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Escreva o nome do funcion�rio: ");
		String telefone = JOptionPane.showInputDialog("Escreva o telefone do funcion�rio: ");
		String email = JOptionPane.showInputDialog("Escreva o email do funcion�rio: ");
		String salarioString = JOptionPane.showInputDialog("Escreva o sal�rio do funcion�rio: ");
		Double salarioDouble = Double.parseDouble(salarioString);

		CadastroFuncionario cf = new CadastroFuncionario(nome, telefone, email, salarioDouble);

		cf.aumentarSalario();

		String funcionario = "Nome funcionario: " + cf.nome + "\nTelefone: " + cf.telefone + "\nEmail: " + cf.email
				+ "\nSal�rio com 10% de aumento: " + String.format("%.2f", cf.salario);

		JOptionPane.showMessageDialog(null, funcionario);

	}

}
