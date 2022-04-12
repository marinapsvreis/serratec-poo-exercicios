package org.serratec.model;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario("Adriano", 2000.00);
		double calcINSS = f1.calcINSS();
		double calcValeTransporte = f1.calcValeTransporte();
		double salarioLiquido = f1.getSalario() - calcINSS - calcValeTransporte;
		
		JOptionPane.showMessageDialog(null, 
				String.format("Nome: %s%n"
						+ "Salário: R$ %.2f%n"
						+ "INSS: R$ %.2f%n"
						+ "Vale Transporte: R$ %.2f%n"
						+ "Salário Liquido: R$ %.2f",
						f1.getNome(), 
						f1.getSalario(), 
						calcINSS, 
						calcValeTransporte, 
						salarioLiquido));
	}

}
