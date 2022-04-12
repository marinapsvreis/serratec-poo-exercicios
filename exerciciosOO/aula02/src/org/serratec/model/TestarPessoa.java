package org.serratec.model;

import java.util.Scanner;

public class TestarPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas você quer cadastrar? ");
		int numeroPessoas = sc.nextInt();
		
		Pessoa[] vetorPessoas = new Pessoa[numeroPessoas];
		
		String nomePessoaMaiorAltura = " ", nomePessoaMaiorPeso = " ";
		
		double somaAltura = 0.0, somaPeso = 0.0, maiorPeso = 0.0, maiorAltura = 0.0;
		
		for(int i = 0; i < numeroPessoas; i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			System.out.println();
			
			somaAltura += altura;
			somaPeso += peso;
			
			vetorPessoas[i] = new Pessoa(nome, peso, altura);
		}
		
		System.out.println();
		
		for(int i = 0; i < numeroPessoas; i++) {
			if(i == 0) {
				maiorPeso = vetorPessoas[i].peso;
				nomePessoaMaiorPeso = vetorPessoas[i].nome;
			}else if(maiorPeso < vetorPessoas[i].peso){
				maiorPeso = vetorPessoas[i].peso;
				nomePessoaMaiorPeso = vetorPessoas[i].nome;
			}
		}
		
		
		
		for(int i = 0; i < numeroPessoas; i++) {
			if(i == 0) {
				maiorAltura = vetorPessoas[i].altura;
				nomePessoaMaiorAltura = vetorPessoas[i].nome;
			}else if(maiorAltura < vetorPessoas[i].altura){
				maiorAltura = vetorPessoas[i].altura;
				nomePessoaMaiorAltura = vetorPessoas[i].nome;
			}
		}
		
		System.out.println("O nome da pessoa com maior peso é: " + nomePessoaMaiorPeso);
		System.out.println("O nome da pessoa com maior altura é: " + nomePessoaMaiorAltura);
		System.out.println("A média de peso é: " + somaPeso/numeroPessoas);
		System.out.println("A média de altura é: " + somaAltura/numeroPessoas);		
		
		sc.close();
	}

}
