package org.serratec.model;

import java.util.Scanner;

public class TesteFornecedor {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor("22.345.817/0001-34", "Empresa Marina Portugal", "+55 24 99940-7781");
		Fornecedor fornecedor2 = new Fornecedor("22.345.817/0001-34", "Empresa Marina Portugal", "+55 24 99940-7781");
		Fornecedor fornecedor3 = new Fornecedor("22.345.817/0001-34", "Empresa Marina Portugal", "+55 24 99940-7781");

		System.out.println("A empresa cadastrada foi: ");
		System.out.printf("Razão Social: %s%nCNPJ: %s%nTelefone: %s%n", 
				fornecedor.getRazaoSocial(), fornecedor.getCnpj(), fornecedor.getTelefone());
				
		System.out.println("O numero de fornecedores é: " + Fornecedor.getContador());		
	}

}
