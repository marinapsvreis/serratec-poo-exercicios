package br.org.serratec.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo4Exception {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\temp\\listaprodutos.csv");
			System.out.println("O arquivo existe!");

		} catch (FileNotFoundException e) {
			System.out.println("Arquivo não encontrado!");
			
		}finally {
			fr.close();
		}
		
		
		
		
		
		

	}

}
