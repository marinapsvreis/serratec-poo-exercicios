package org.serratec.model;

public class TestarAluno {

	public static void main(String[] args) {
		// Criação de uma instancia de um objeto
		Aluno aluno1 = new Aluno();
		// Aluno aluno2 = new Aluno(); - esse da referencia diferente
		Aluno aluno2 = aluno1;
		
		//Passando valores para os atributos do objeto
		aluno1.codigoAluno = 10;
		aluno1.nome = "Marina";
		aluno1.telefone = "+55 24 99940-7781";
		aluno1.email = "marinapsvreis@gmail.com";

		// Imprimindo o endereço de memória
		System.out.println(aluno1);
		System.out.println(aluno2);
		
		//Exibindo atributos do objeto sem encapsulamento
		System.out.println(aluno1.nome);
		System.out.println(aluno2.email); //sobrescreveu o objeto inteiro

		// Comparando endereços de memória
		if (aluno1 == aluno2) {
			System.out.println("Referencias iguais");
		} else {
			System.out.println("Diferentes");
		}
	}

}
