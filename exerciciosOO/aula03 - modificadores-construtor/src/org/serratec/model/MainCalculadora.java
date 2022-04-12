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
		
		String selecaoOperacao = "Qual operação você deseja realizar?\n";
		selecaoOperacao += "1 - Soma\n";
		selecaoOperacao += "2 - Subtração\n";
		selecaoOperacao += "3 - Multiplicação\n";
		selecaoOperacao += "4 - Divisão";
		
		String opcao = JOptionPane.showInputDialog(null, selecaoOperacao);
		int opcaoInt = Integer.parseInt(opcao);
				
		switch(opcaoInt) {
		case 1:
			JOptionPane.showMessageDialog(null, "A soma é: " + calc.somar());
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "A subtração é: " + calc.subtrair());
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "A multiplicação é: " + calc.multiplicar());
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "A divisão é: " + calc.dividir());
			break;
		}
		
		sc.close();

	}

}
