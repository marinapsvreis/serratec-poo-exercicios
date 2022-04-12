package org.serratec.model;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = JOptionPane.showInputDialog(null, "Digite o primeiro valor:");
		String b = JOptionPane.showInputDialog(null, "Digite o segundo valor:");
		double aDouble  = Double.parseDouble(a);
		double bDouble  = Double.parseDouble(b);
		
		Calculadora calc = new Calculadora(aDouble, bDouble);
		
		String selecaoOperacao = "Qual opera��o voc� deseja realizar?\n";
		selecaoOperacao += "1 - Soma\n";
		selecaoOperacao += "2 - Subtra��o\n";
		selecaoOperacao += "3 - Multiplica��o\n";
		selecaoOperacao += "4 - Divis�o";
		
		String opcao = JOptionPane.showInputDialog(null, selecaoOperacao);
		int opcaoInt = Integer.parseInt(opcao);
				
		switch(opcaoInt) {
		case 1:
			JOptionPane.showMessageDialog(null, "A soma �: " + calc.somar());
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "A subtra��o �: " + calc.subtrair());
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "A multiplica��o �: " + calc.multiplicar());
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "A divis�o �: " + calc.dividir());
			break;
		}
		
		sc.close();

	}

}
